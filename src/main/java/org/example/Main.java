package org.example;

import org.example.MenuFunction.Imp.CounterImp;
import org.example.MenuFunction.Imp.FindImp;
import org.example.MenuFunction.Imp.ResultSqImp;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menuList(new ResultSqImp(),new FindImp(),new CounterImp());

    }
}