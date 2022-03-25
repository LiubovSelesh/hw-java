package com.company;

//квадрат a = a2
public class Square extends Shape {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }
    public double getArea(){
        return a * a;

    }

    public int getA() {
        return a;
    }

//    @Override
//    public String toString() {
//        return getName() + " " +  getArea();
//    }
}
