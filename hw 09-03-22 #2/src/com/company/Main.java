package com.company;

public class Main {

    public static void main(String[] args) {
//Create a class Person with following fields: String firstName, String lastName, MyDate birthday.
//a. Implement the constructor method.
//b. Implement String toString() method, that returns the String something like “Ivanov Ivan [21-15-2022]”
        Birthday birthday = new Birthday(21,12, 2022);

        Person person = new Person("Miller", "Alex ", birthday);
        System.out.println(person);



    }
}
