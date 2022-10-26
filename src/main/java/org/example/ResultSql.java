package org.example;

import net.objecthunter.exp4j.ExpressionBuilder;
import java.sql.*;
import java.util.Scanner;

public class ResultSql {
    private Connection connection;
    Scanner scanner = new Scanner(System.in);





    public void Connect() {
        connection = ManagerDb.getInstance().getConnection();
    }


    public void findAll() {

        String sql = "Select * FROM test";
        try  {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String expr = resultSet.getString("expr");
                String result = resultSet.getString("result");
                System.out.println(id + " | " + expr + " | " + result);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        String exprScan = scanner.nextLine();
        double resultScan = new ExpressionBuilder(exprScan).build().evaluate();
        String query = "INSERT INTO test(expr, result) VALUES (?,?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, exprScan);
            statement.setDouble(2, resultScan);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give id : \n");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Plz give new expression : \n");
        String exprScan = scanner.nextLine();
        double resultScan = new ExpressionBuilder(exprScan).build().evaluate();
        String query = "UPDATE test SET expr = ?, result = ? where id = ?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, exprScan);
            statement.setDouble(2, resultScan);
            statement.setInt(3,id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*public void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give result : \n");
        Double resultScan = scanner.nextDouble();
        String sql = "Select * FROM test where result = ?";
        Statement statement = null;
        PreparedStatement setValue = null;
        try {
            setValue = connection.prepareStatement(sql);
            statement = connection.createStatement();


            setValue.setDouble(1,resultScan);
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String expr = resultSet.getString("expr");
                String result = resultSet.getString("result");
                System.out.println(id + " | " + expr + " | " + result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     */
}
