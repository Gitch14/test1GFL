package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Find {

    private Connection connection;
    Scanner scanner = new Scanner(System.in);

    public void Connect() {
        connection = ManagerDb.getInstance().getConnection();
    }


    public void findEquals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give result : \n");
        double resultScan = scanner.nextDouble();
        String sql = "Select * FROM test where result = ?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);


            statement.setDouble(1,resultScan);
            ResultSet resultSet = statement.executeQuery();
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

    public void findLess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give result : \n");
        double resultScan = scanner.nextDouble();
        String sql = "Select * FROM test where result < ?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);


            statement.setDouble(1,resultScan);
            ResultSet resultSet = statement.executeQuery();
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

    public void findBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give result : \n");
        double resultScan = scanner.nextDouble();
        String sql = "Select * FROM test where result > ?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);


            statement.setDouble(1,resultScan);
            ResultSet resultSet = statement.executeQuery();
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
}
