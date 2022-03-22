package com.company;

public class Hotel {
    public int number;
    private int price;
    private String view;

    public Hotel(int number, int price, String view) {
        this.number = number;
        this.price = price;
        this.view = view;
    }

    public int getPrice() {
        return price;
    }

    public String getView() {
        return view;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "number=" + number +
                ", price=" + price +
                ", view='" + view + '\'' +
                '}';
    }

    public void getBooking(){
        System.out.println("I want reserve room number " + this.number);
    }

    public void description(){
        System.out.println("This room is reserved");
    }
}