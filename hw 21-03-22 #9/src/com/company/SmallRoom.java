package com.company;

public class SmallRoom extends Hotel {

    public SmallRoom(int number, int price, String view) {
        super(number, price, view);
    }

    public void description() {
        System.out.println("The room number" + getNumber() + " is very bright");
    }
}