package com.company;

import java.util.Arrays;

//c. Create BankProcessing class with an attribute Account[] bankAccounts.
// Write a constructor, which takes an array of Accounts as argument.
// Write toString method. Write the method which return the array of all of the bank clients.
public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts){
        this.bankAccounts = bankAccounts;
    }
    public Account[] getBankAccounts(){
        return bankAccounts;
    }
    public String toString() {
        return Arrays.toString(bankAccounts) ;
    }
    public Person[]getClient(Account[] bankAccounts){
        Person[] clients = new Person[bankAccounts.length];
        for (int i = 0; i < clients.length; i++) {
            clients[i] = bankAccounts[i].getClient();
        }
        return clients;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Pit", "Peterson");
        Account person = new Account("123456789", 150.0, person1);
        Account[] accounts = new Account[]{person,
        new Account("1234567895", 15247.2, new Person("Mia", "Miller")),
        new Account("9874563212", 1547.2, new Person("Liz", "Teylor"))};
        BankProcessing bp = new BankProcessing(accounts);
        System.out.println(bp);
        System.out.println(Arrays.toString(bp.getClient(accounts)));
    }
}
