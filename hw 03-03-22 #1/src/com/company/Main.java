package com.company;

public class Main {

    public static void main(String[] args) {
//1 Make a class Computer with the following attributes (String cpu, int ram, int hdd, double price).
// Implement the method that print all information about the Computer.
// Create several objects of Computer and put it into array. Print all computers.
        Computer comp1 = new Computer();
        comp1.cpu = "Lenovo";
        comp1.ram = 24;
        comp1.hdd = 36;
        comp1.price = 800.80;

        Computer comp2 = new Computer();
        comp2.cpu = "HP";
        comp2.ram = 21;
        comp2.hdd = 30;
        comp2.price = 900.80;

        Computer[] computers = {comp1, comp2};
        for (int i = 0; i < computers.length; i++) {
        printComputers(computers[i]);
        }
    }
    public static void printComputers(Computer computer){
        System.out.println("cpu: " + computer.cpu);
        System.out.println("ram: " + computer.ram);
        System.out.println("hdd: " + computer.hdd);
        System.out.println("price: " + computer.price);
        System.out.println();
    }
}