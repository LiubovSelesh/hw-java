package com.company;

public class Main {

    public static void main(String[] args) {
// Implement a simple bank app
// a. Create Person class with the following attributes (String firstName, String lastName).
// Write constructor, toString and getters methods.
        Person person = new Person("Alex", "Miller");
        String personFirstName = person.getFirstName();
        String personLastName = person.getLastName();
        System.out.println(personFirstName + " " + personLastName);

    }
}

//    Cat barsik = new Cat("Барсик", 5, 4);
//       String barsikName = barsik.getName();
//       int barsikAge = barsik.getAge();
//       int barsikWeight = barsik.getWeight();
//
//       System.out.println("Имя кота: " + barsikName);
//       System.out.println("Возраст кота: " + barsikAge);
//       System.out.println("Вес кота: " + barsikWeight);