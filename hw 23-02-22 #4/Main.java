package com.company;

public class Main {

    public static void main(String[] args) {
	//Implement the method that finds the row’s index in the array int[n][k] of random integers with minimum sum of elements
        int[][] arr = {{5, 2, 3, 8}, {4, 5, 1, 1}, {1, 14, 0, 1}};
        getIndex(arr);
    }
    public static void getIndex(int[][] arr){
        int minSum = 0;
        int index = 0;
        for(int i=0; i < 1; i++) {
            for(int j=0; j < arr[i].length; j++) {
                minSum = minSum + arr[i][j];
            }
        }

        for(int i=0; i < arr.length; i++) {
            int sum = 0;
            for(int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }
            if (sum < minSum) {
                minSum = sum;
                index = i;
            }
            System.out.println("= " + sum);
//            System.out.println();
        }
        System.out.println(index);
//        System.out.println();
    }
}
