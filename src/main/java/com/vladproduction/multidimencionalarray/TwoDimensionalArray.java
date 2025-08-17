package com.vladproduction.multidimencionalarray;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] multiplicationTable = new int[5][];
        System.out.println("multiplicationTable = " + Arrays.deepToString(multiplicationTable));
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + Arrays.toString(multiplicationTable[i]));
        }

        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];
            System.out.println("multiplicationTable[" + i + "] = " + Arrays.toString(multiplicationTable[i]));
        }

        System.out.println("\nInitialization array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(" " + multiplicationTable[i][j]);
            }
            System.out.println();
        }

        System.out.println("========");
        for (int[] ints : multiplicationTable) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }
    }
}
