package org.example.MenuFunction.Imp;

import org.example.MenuFunction.Counter;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CounterImp implements Counter {
    Scanner scanner = new Scanner(System.in);
    public void count() {
        int count = 0;
        System.out.println("Write your expression: ");
        String exprScan = scanner.nextLine();
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(exprScan);

        while (m.find()) {
            count++;
        }


        System.out.println("Count : " + count);

    }
}
