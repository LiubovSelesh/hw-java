package com.company;

public class Main {

    public static void main(String[] args) {
//Create a class Practice with following fields: String subject , Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish.
//a. Implement the constructor method.
//b. Implement String toString() method, that returns the String info about Practice.

        MyDate date = new MyDate(21,12,2000);

        Person person = new Person("Alex", "Fisher", date);

        MyDate dateTeacher = new MyDate(11,03,1999);
        Person teacher = new Person("Mia", "Miller", dateTeacher);

        MyDate startDate = new MyDate(22,11,2021);
        MyDate finishDate = new MyDate(15,12,2022);

        Practice practice = new Practice("Maths", person, teacher, startDate, finishDate);
        System.out.println(practice);
    }
}
