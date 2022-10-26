package org.example;

import java.util.Scanner;

public class Menu {

    public void menuList(ResultSql resultSql) {
        resultSql.Connect();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        scanner.nextLine();
        while (num == 0) {
            System.out.println("Input num to choice menu : \n"
            +"1 - findAll expression\n"
            +"2 - new expression\n"
            +"3 - edit expression\n"
            +"4 - filter\n");
            int n = scanner.nextInt();
            switch (n) {
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
                    //resultSql.find();
                    break;
            }
            System.out.println("Input 1 if you want close menu : \n");
            num = scanner.nextInt();
            scanner.nextLine();
        }
    }

}
