package com.company;
//b. Create Account class with the following attributes String IBAN,
// Person client, double balance. Write constructor, toString and getters methods.

public class Account {
    private String iban ;
    private double balance;
    private Person client;

    public Account(String iban, double balance, Person client){
        this.iban = iban;
        this.balance = balance;
        this.client = client;
    }
    public double getBalance(){
        return balance;
    }
    public String getIban(){
        return iban;
    }
    public Person getClient(){
        return client;
    }

    public String toString() {
        return iban + " " + client + " " + balance;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Pit", "Peterson");
        Account person = new Account("123456789", 150.0, person1);
        String clientIban = person.getIban();
        double clientBalance = person.getBalance();
        Person clientName = person.getClient();
        System.out.println(person);
        System.out.println("--------------");
        System.out.println(clientName);
        System.out.println(clientIban);
        System.out.println(clientBalance);
    }

}