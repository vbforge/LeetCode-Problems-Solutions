package com.vladproduction.multidimencionalarray;

public class MainArrayMulti {
    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3}, {10, 20, 30, 40, 50, 60, 70}, {100, 200, 300}};
        System.out.println(array.length); //3

        int x1 = array[0][2]; //3
        int x2 = array[1][4]; //50
        int x3 = array[2][1]; //200
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        //some examples:
        int[][] array1 = {{1, 2, 3}, {}, {1, 2, 3, 4, 5}};
//        int[][] array2 = new arrayA() {{1, 2, 3}, {}, {1, 2, 3, 4, 5}}; //incorrect declaration
//        int[][] array3 = {1, 2, 3}, {0}, {1, 2, 3, 4, 5}; //incorrect declaration
        int[][] array4 = new int[2][];

    }
}
