package org.example;

import org.example.MenuFunction.Counter;
import org.example.MenuFunction.Find;
import org.example.MenuFunction.ResultSql;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menuList(new ResultSql(),new Find(),new Counter());

    }
}