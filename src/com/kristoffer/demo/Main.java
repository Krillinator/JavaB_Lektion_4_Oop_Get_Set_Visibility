package com.kristoffer.demo;

import com.kristoffer.demo.visibilityTest.AccessModTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccessModTest accessModTest = new AccessModTest();
        Student benny = new Student("Benny", 15);
        Student frida = new Student("Frida", 25);
        Player player1 = new Player();

        // Object within List
        List<Student> studentList = new ArrayList<>();

        studentList.add(benny); // Index 0
        studentList.add(frida); // Index 1

        System.out.println( studentList.get(0).getName() ); // Access index objects methods
        studentList.get(1).test();

        studentList.add( new Student("Anton", 25) ); // Anonymous Object alternative




        // System.out.println(benny.name);         // name is private!
        System.out.println(benny.getName());       // getName() is public method containing private variable
        System.out.println(benny.getAge());
        System.out.println(frida.getName());
        System.out.println(frida.getAge());

        benny.setName("Benny");       // We can now set a private variables value!
        //benny.name = "benny";       // Do NOT call a private variable
        benny.setAge(benny.getAge() + 1);

        accessModTest.agePublic = 15;
        accessModTest.testPublic();

        // accessModTest.testProtected();   Only on same package
        // accessModTest.testNoModifier();  Only on same package


        // Question #1
        // TODO - GET / SET within the actual class!

        player1.setScore(500);
        player1.addFivePoints();    // 1000?

        System.out.println(player1.getScore());

    }
}
