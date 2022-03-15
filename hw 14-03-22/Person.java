package com.company;
// Implement a simple bank app
// a. Create Person class with the following attributes (String firstName, String lastName).
// Write constructor, toString and getters methods.

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        Person person = new Person("Alex", "Miller");
        Person person1 = new Person("Pit", "Peterson");
        System.out.println(person);
        System.out.println(person1);
    }
}
