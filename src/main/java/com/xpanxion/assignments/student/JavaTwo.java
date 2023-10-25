package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaTwo {
    Scanner console = new Scanner(System.in);
    public void ex1(){

        String person;
        ArrayList<Person> personArrayList = new ArrayList<>();
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

    }
}
