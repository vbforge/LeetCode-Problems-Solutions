package com.vladproduction.demo;

public class ForEachExamples {
    public static void main(String[] args) {

        int[] arrayInt = { 1, 2, 3, 4, 5, 6 };
        for (int element : arrayInt) {
            element *= element;
            System.out.print(element + " ");//1 4 9 16 25 36
        }

        System.out.println();
        for (int valueInt : arrayInt ) {
            System.out.print(valueInt + " ");//1 2 3 4 5 6
        }

        System.out.println();
        String[] strArray = new String[] {"One", "Two", "Three"};
        strArray[2] = null;
        for (String val: strArray) {
            System.out.print(val + ", ");
        }
    }
}
