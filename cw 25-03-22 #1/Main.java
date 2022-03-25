package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);
        Square square = new Square("Square", 10);
        Ring ring = new Ring("Ring", 10);


        Shape[] shapes = {rectangle, square, ring};
        for (int i = 0; i < shapes.length; i++) {
            final Shape shape = shapes[i];
            System.out.println(shape.getName() + " " + shape.getArea());
//
//            for (Shape s: shapes){
//                System.out.println(s.getName() + " has area " + s.getArea());
//            }
        }
    }
}

