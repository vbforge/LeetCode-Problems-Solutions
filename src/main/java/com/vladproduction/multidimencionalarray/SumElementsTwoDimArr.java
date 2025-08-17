package com.vladproduction.multidimencionalarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Task: you need to find the sum of the elements of a two-dimensional array.
 */
public class SumElementsTwoDimArr {
    public static void main(String[] args) {

        simple();
        System.out.println();

        int rows = 5, column = 5;
        advanceAutoFill(rows, column);

    }

    private static void simple() {
        int[][] array2D = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {0, 2, 0, 4, 0}
        };

        int sum = 0;
        for (int[] row : array2D) {
            for (int element : row) {
                sum = sum + element;
            }
        }
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }


    //adjustable rows and columns method;
    //function to add elements to the array;
    //only not negative numbers contain ( >=0 );
    //print table;
    //count sum and print it also;
    //numbers range should be from 0 to multiplication result of two parameters (row * column);
    //think about not duplicate numbers in each row;

    private static void advanceAutoFill(int rows, int column) {

        int[][] table = new int[rows][column];
        Random random = new Random();
        int sum = 0;

        //fill table with unique numbers in each row:
        for (int i = 0; i < rows; i++) {
            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int j = 0; j < column; j++) {
                int number;
                do {
                    number = random.nextInt(rows * column + 1);
                } while (uniqueNumbers.contains(number));
                uniqueNumbers.add(number);
                table[i][j] = number;
                sum += number;
            }
        }

        //print table:
        for (int[] row : table) {
            System.out.println(Arrays.toString(row));
        }

        //print sum:
        System.out.println("Table numbers sum: " + sum);

    }
}
