package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        System.out.println("Enter your name: Manan Patel");
        System.out.println("Your name in upper case is: MANAN PATEL");
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enther a string: ");
        String sentence = console.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(Character.isUpperCase(sentence.charAt(i))){
                count++;

            }
        }
        System.out.println("Number of uppercase letters: "+ count);

    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enther a string: ");
        String sentence = console.nextLine();
        String[] Stringtoken = sentence.split(" ");
        for (int i = 0; i < Stringtoken.length; i++){
            if(i%2 == 0) System.out.print(Stringtoken[i].toUpperCase()+ " ");
            else System.out.print(Stringtoken[i]+ " ");
        }

    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
