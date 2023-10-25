package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {
    static ArrayList<String> history = new ArrayList<>();

    public static void add(int a, int b){
        int result = a+b;
        System.out.println("Result: " + result);
        history.add(a + " + " + b + " = " + result);
    }
    public static void subtract(int a, int b){
        int result = a-b;
        System.out.println("Result: " + result);
        history.add(a + " - " + b + " = " + result);
    }
    public static void multiply(int a, int b){
        int result = a*b;
        System.out.println("Result: " + result);
        history.add(a + " * " + b + " = " + result);
    }
    public static void divide(int a, int b){
        int result = a/b;
        System.out.println("Result: " + result);
        history.add(a + " / " + b + " = " + result);
    }

}
