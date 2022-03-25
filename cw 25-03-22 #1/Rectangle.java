package com.company;
//Прямоугольник1 (a*b)
public class Rectangle extends Shape {
    private int a;
    private int b;


    public Rectangle(String name, int a, int b) {
       super(name);
        this.a = a;
        this.b = b;


}
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public double getArea(){
        return a * b;
    }


//    @Override
//    public String toString() {
//        return  getName() + " " + getArea();
//
//    }
}
