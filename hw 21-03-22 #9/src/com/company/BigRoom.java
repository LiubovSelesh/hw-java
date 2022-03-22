package com.company;

public class BigRoom extends Hotel {

    public BigRoom(int number, int price, String view) {
       super(number, price, view);
    }

    public void description() {
        System.out.println("The room number" + getNumber() + " room number five is very spacious");
    }
}

