package com.vladproduction.fizz_buzz;/*
 * 1)   solve the function which accepts byte array;
 *
 *      array build by several rules:
 * -accept arg as integer;
 *
 *      the function is:
 * -if integer multiple of three, put word FIZZ into array;
 * -if integer multiple of five, put word BUZZ into array;
 * -if integer multiple of three and five, put word FIZZBUZZ into array;
 * -if the number is not a multiple of these numbers throw IllegalArgumentException;
 *
 * 2)cover by tests
 */


import java.util.Arrays;

public class FizzBuzz {
    static final String FIZZ = "FIZZ";
    static final String BUZZ = "BUZZ";



    public static void main(String[] args) {
        FizzBuzz fbf = new FizzBuzz();
        byte [] result = fbf.fizzbuzz(5);
        String resultAsText = new String(result);
        System.out.println(resultAsText);
        System.out.println(Arrays.toString(fbf.fizzbuzz(3)));

//        System.out.println(Arrays.toString(fbf.fizzbuzz(5)));
//        System.out.println(Arrays.toString(fbf.fizzbuzz(15)));
//        System.out.println(Arrays.toString(fbf.fizzbuzz(45)));
//        System.out.println(Arrays.toString(fbf.fizzbuzz(60)));
//
    }

    public byte[] fizzbuzz(int value) {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append(FIZZ);
        }
        if (value % 5 == 0) {
            sb.append(BUZZ);
        }
        if (!sb.isEmpty())
            return sb.toString().getBytes();
        throw new IllegalArgumentException("Please check!!!");
    }
}
