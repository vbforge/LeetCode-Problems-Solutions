package com.vladproduction.sum_of_squares;

import java.util.Scanner;

public class SumOfSquaresNumbs {
    public static void main(String[] args) {
        SumOfSquaresNumbs sumOfSquaresNumbs = new SumOfSquaresNumbs();
        sumOfSquaresNumbs.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(" ");
        int res = sumOfSquares(arr);
        System.out.println(res);
    }

    private int  sumOfSquares(String [] arr) {
        int sum = 0;
        int[] arr2 = new int[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
            arr2[i] = arr2[i] * arr2[i];
            sum += arr2[i];
        }
        return sum;
    }
}
