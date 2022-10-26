package org.example.MenuFunction;

import java.util.Scanner;

public class Counter {
    Scanner scanner = new Scanner(System.in);
    public void count() {
        int count = 0;
        String exprScan = scanner.nextLine();
        for (int i = 0; i < exprScan.length(); i++) {
            if (Character.isDigit(exprScan.charAt(i))) {
                count++;
            }
        }

        System.out.println("Количество чисел: " + count);

    }
}
