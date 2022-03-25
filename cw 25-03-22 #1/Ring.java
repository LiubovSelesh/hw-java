package com.company;
//Круг π × r2
public class Ring extends Shape {

    private int r;

    public Ring(String name, int r) {
        super(name);
        this.r = r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }

    public int getR() {
        return r;
    }

//    @Override
//    public String toString() {
//        return getName() +  " " + getArea();
//    }


}
