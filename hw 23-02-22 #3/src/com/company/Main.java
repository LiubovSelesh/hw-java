package com.company;

public class Main {

    public static void main(String[] args) {
        // Implement the method that create an array int[n][n] of random integers

        getArray();
    }
    public static void getArray(){
        int[][] arr = new int[3][4];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
