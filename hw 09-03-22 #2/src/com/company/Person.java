package com.company;

public class Person {
    String firstName;
    String lastName;
    Birthday birthday;
        public Person (String firstName, String lastName, Birthday birthday){
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
        }

    public String toString(){
        return lastName+" "+ firstName+" ["+ birthday.toString()+"]";
    }
}
