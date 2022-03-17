package com.company;
//Create a class, which will have a method to find max element of int array.
// The class must have a constructor accepting int array.

public class Array {
    private int [] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }
    public int arrMax(){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
       Array array = new Array(new int[]{10,4,36,6,4,17});
        System.out.println(array.arrMax());
    }
}
