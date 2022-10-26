package org.example;

import org.example.MenuFunction.Counter;
import org.example.MenuFunction.Find;
import org.example.MenuFunction.ResultSql;

import java.sql.Connection;
import java.util.Scanner;

public class Menu {
    private final static String generalMenu = "Input num to choice menu : \n"
            +"1 - findAll expression\n"
            +"2 - new expression\n"
            +"3 - edit expression\n"
            +"4 - counter\n"
            +"5 - filter\n";


    private final static String filterMenu = "Input num to choice menu : \n"
            +"1 - findEquals result\n"
            +"2 - findLess result\n"
            +"3 - findBigger result\n";

    private Connection connection;


    public void menuList(ResultSql resultSql, Find find, Counter counter) {
        find.Connect();resultSql.Connect();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        scanner.nextLine();
        while (num == 0) {
            System.out.println(generalMenu);
            int n1 = scanner.nextInt();
            switch (n1) {
                case 1:
                resultSql.findAll();
                break;
                case 2:
                    resultSql.update();
                    break;
                case 3:
                    resultSql.edit();
                    break;
                case 4:
                    counter.count();
                    break;
                case 5:
                    System.out.println(filterMenu);
                    int n2 = scanner.nextInt();
                    switch (n2){
                        case 1:
                            find.findEquals();
                            break;
                        case 2:
                            find.findLess();
                            break;
                        case 3:
                            find.findBigger();
                    }
                    break;
            }
            System.out.println("Input 1 if you want close menu : \n");
            num = scanner.nextInt();
            scanner.nextLine();
        }
    }

}
