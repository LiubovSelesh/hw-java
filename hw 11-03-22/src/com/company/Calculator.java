package com.company;
//Make a Calculator class, which will have 5 static methods:
//int plus(int a, int b) - returns the sum of a and b
//int minus(int a, int b) - returns the difference between a and b
//int multiply(int a, int b) - returns the product of a and b
//double divide(int a, int b) - returns the result of dividing a by b
//double percent(int a, int b) - returns b percent of the number a
//(for example, percent(4, 50) should return 50% of 4)

public class Calculator {
    private int a, b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int plus(){
        int sum = a + b;
        return sum;
    }
    public int minus(){
        return a - b;
    }
    public int multiply(){
        return a * b;
    }
    public int divide(){
        return a / b;
    }
    public double percent(){
        return b * 100 / a ;
    }

    public static void main(String[] args) {

        Calculator  calculator = new Calculator(10, 5);
        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());
        System.out.println(calculator.percent() + "%");
    }
}
