package com.company;
//Imagine you are developing a system for on-line shop (or for a hotel or for a school or for a hospital or ....... for whatever area you want).
// Implement several classes. Come up with several classes connected by an inheritance relationship.
// Think about which methods should be implemented in the parent class, which in the descendant classes.

public class Main {

    public static void main(String[] args) {

        BigRoom bigRoom = new BigRoom(5, 95, "Sea");
        SmallRoom smallRoom = new SmallRoom(12, 50, " Mountains");
        NewRoom newRoom = new NewRoom(13, 81, "Beautiful view from window");
        System.out.println(bigRoom);
        System.out.println(smallRoom);
//        System.out.println(newRoom);

        Hotel[] hotel = {bigRoom, smallRoom, newRoom};
        for (int i = 0; i < hotel.length; i++) {
//            hotel[i].getBooking();
            hotel[i].description();

        }

    }
}
