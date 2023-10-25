package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.util.Random;
import static java.lang.Integer.parseInt;

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
        Scanner console = new Scanner(System.in);
        System.out.println("Enther a string: ");
        String sentence = console.nextLine();
        sentence.toLowerCase();
        for(int i = 0; i < (sentence.length()/2) ; i++){
            if(sentence.charAt(i) != sentence.charAt(sentence.length()-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enther a string: ");
        String sentence = console.nextLine();
        int vowel = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'  ){
                vowel++;
            }
        }
        System.out.println("Number of vowels: "+ vowel);
        int consonants = sentence.length() - vowel;
        System.out.println("Number of consonants: "+ consonants);
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        int number1, number2;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = console.nextInt();
        System.out.println("Enter second number: ");
        number2 = console.nextInt();
        System.out.println("Result: "+ (number1+number2));
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        Scanner console = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter first number: ");
        number1 = console.nextInt();
        System.out.println("Enter second number: ");
        number2 = console.nextInt();
        System.out.println("Enter operation (add, sub, mul, div): ");
        String operation = console.next();

        switch (operation) {
            case "add" -> System.out.println("Result: " + (number1 + number2));
            case "sub" -> System.out.println("Result: " + (number1 - number2));
            case "mul" -> System.out.println("Result: " + (number1 * number2));
            case "div" -> System.out.println("Result: " + (number1 / number2));
            default -> System.out.println("Invalid command");
        }
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
        Scanner console = new Scanner(System.in);
        int price;
        System.out.println("Enter the price: ");
        price = console.nextInt();
        int cost = 0;
        String dimension = "";
        while(true){
            console.nextLine();
            System.out.println("Enter the room dimensions (widthxheight)");
            dimension = console.nextLine().toLowerCase();
            if(dimension.equals("done")){
                break;
            }
           String[] stringtoken = dimension.split(" x ");
            cost += (Integer.parseInt(stringtoken[0])*Integer.parseInt(stringtoken[1])*price);
        }
        System.out.println("Total cost: "+ cost);

    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int int_random = random.nextInt((5-1)+1)+1;
        System.out.println("Enter a number: ");
        int guess = console.nextInt();
        while(true){
            if(guess==int_random){
                break;
            }
            System.out.println("Try again ..");
            System.out.println("Enter a number: ");
            guess = console.nextInt();


        }
        System.out.println("You guessed it!!!");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence = console.nextLine();
        String[] stringtoken = sentence.split(" ");

        for (int i = 0; i < stringtoken.length; i++){
            for (int j = 0; j < stringtoken[i].length(); j++){
                for(int k = 0; k < stringtoken[i].length();k++){
                    if(k==j){
                        break;
                    }
                            System.out.print(" ");

                        }
                System.out.println(stringtoken[i].charAt(j));
            }
        }
    }

    //
    // Private helper methods
    //
}

