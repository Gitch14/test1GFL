package org.example;

import org.example.MenuFunction.Imp.CounterImp;
import org.example.MenuFunction.Imp.FindImp;
import org.example.MenuFunction.Imp.ResultSqImp;

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


    public void menuList(ResultSqImp resultSqImp, FindImp findImp, CounterImp counterImp) {
        findImp.connect();
        resultSqImp.connect();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        scanner.nextLine();
        while (num == 0) {
            System.out.println(generalMenu);
            int n1 = scanner.nextInt();
            switch (n1) {
                case 1:
                resultSqImp.findAll();
                break;
                case 2:
                    resultSqImp.update();
                    break;
                case 3:
                    resultSqImp.edit();
                    break;
                case 4:
                    counterImp.count();
                    break;
                case 5:
                    System.out.println(filterMenu);
                    int n2 = scanner.nextInt();
                    switch (n2){
                        case 1:
                            findImp.findEquals();
                            break;
                        case 2:
                            findImp.findLess();
                            break;
                        case 3:
                            findImp.findBigger();
                    }
                    break;
            }
            System.out.println("Input 1 if you want close menu : \n");
            num = scanner.nextInt();
            scanner.nextLine();
        }
    }

}
