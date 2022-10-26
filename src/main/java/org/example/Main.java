package org.example;

public class Main {

    public static void main(String[] args) {

        ResultSql resultSql = new ResultSql();
        resultSql.Connect();
       // resultSql.update();
        resultSql.find();
        resultSql.edit();
        resultSql.find();

    }
}