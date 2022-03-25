package com.company;
//1.создать классы содержащие методы для подсчета площади прямоугольника
//квадарата и круга. Кроме результата подсчета должно выводиться также
//название соответствующей фигуры. Создать массив таких обьектов и вывести
//его на экран
//Прямоугольник1 (a*b)
//Круг π × r2
//квадрат a = a2

public class Shape {
    private String name;


    public Shape(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public double getArea(){
        return 0;
    }
}
