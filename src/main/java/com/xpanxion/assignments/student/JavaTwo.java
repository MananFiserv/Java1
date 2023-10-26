package com.xpanxion.assignments.student;

import java.util.*;
import java.text.NumberFormat;

public class JavaTwo {
    Scanner console = new Scanner(System.in);
    ArrayList<Person> personArrayList = new ArrayList<>();
    public void ex1(){

        String person;

        while(true){
            System.out.println("Enter person");
            person = console.nextLine();
            if(person.equals("done")){
                break;
            }
            String[] stringtoken = person.split(", ");
            String[] name = stringtoken[1].split(" ");
            personArrayList.add(new Person(Integer.parseInt(stringtoken[0]), name[0], name[1]));
        }
        for (Person value : personArrayList) {
            System.out.println(value);
        }
    }
    public void ex2(){
        Map<Integer, Person> hashPerson = new HashMap<>();
        Person person1 = new Person(1, "Peter", "Jones");
        Person person2 = new Person(2, "John", "Smith");
        Person person3 = new Person(3, "Mary", "Jane");

        hashPerson.put(person1.getId(), person1);
        hashPerson.put(person2.getId(), person2);
        hashPerson.put(person3.getId(), person3);

        while(true){
            System.out.println("Enter Person ID:");
            String id = console.next();
            if(id.equals("done")){
                break;
            }
            if(hashPerson.containsKey(Integer.parseInt(id))){
                System.out.println(hashPerson.get(Integer.parseInt(id)));
            }else {
                System.out.println("No Person associated with the "+ id);
            }
        }
    }
    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex4(){
        ex3();
    }
    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    public void ex6(){
        String number1;
        int number2;


        while (true){
            System.out.println("Enter first number: ");
            number1 = console.next().toLowerCase();
            if (number1.equals("done")) break;
            System.out.println("Enter second number: ");
            number2 = console.nextInt();
            System.out.println("Enter operation (add, sub, mul, div): ");
            String operation = console.next();
            switch (operation) {
                case "add" -> Calculator.add(Integer.parseInt(number1), number2);
                case "sub" -> Calculator.subtract(Integer.parseInt(number1), number2);
                case "mul" -> Calculator.multiply(Integer.parseInt(number1), number2);
                case "div" -> Calculator.divide(Integer.parseInt(number1), number2);
                default -> System.out.println("Invalid command");
            }
        }
        for (int i = 0; i < Calculator.history.size(); i++){
            System.out.println(Calculator.history.get(i));
        }
    }
    public void ex7(){
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        personList.stream().map(person -> new Person(person.getId(), person.getFirstName(), "xxx")).forEach(System.out::println);

    }
    public void ex8(){
        var personList = Arrays.asList(
                new Person(1,"Charlie" , "Jones"),
                new Person(2,"Zoey" , "Smith"),
                new Person(3,"Adam" , "Anderson")
        );
        Collections.sort(personList);
        for (Person p: personList){
            System.out.println(p);
        }
    }
}
