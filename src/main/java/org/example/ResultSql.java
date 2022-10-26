package org.example;

import net.objecthunter.exp4j.ExpressionBuilder;
import java.sql.*;
import java.util.Scanner;

public class ResultSql {
    private Connection connection;
    Scanner scanner = new Scanner(System.in);
    String expr = scanner.nextLine();
    double result = new ExpressionBuilder(expr).build().evaluate();



    public void Connect() {
        connection = ManagerDb.getInstance().getConnection();
    }


    public void find() {

        String sql = "Select * FROM test";
        try  {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String fn = resultSet.getString("expr");
                String country = resultSet.getString("result");
                System.out.println(id + " | " + fn + " | " + country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        String query = "INSERT INTO test(expr, result) VALUES (?,?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, expr);
            statement.setDouble(2, result);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
