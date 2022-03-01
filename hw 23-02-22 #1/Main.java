package com.company;

public class Main {

    public static void main(String[] args) {
        // Implement the method that calculates the sum of integer array.
        // You should not use any loops. Use the recursion.

        int[] arr = {4,8,0,1,8};
        int sum = sumOfArray(arr,arr.length-1);
        System.out.println("Sum = " + sum);
    }
    public static int sumOfArray(int[] arr,int index) {
        if(index == 0) {
            return arr[index];
        }else{
            return arr[index] + sumOfArray(arr,--index);
        }
    }
}
