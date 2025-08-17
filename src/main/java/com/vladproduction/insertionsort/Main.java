package com.vladproduction.insertionsort;

import java.util.Scanner;

import static com.vladproduction.insertionsort.InsertionSort.printArray;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("size array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("elements array :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        InsertionSort is = new InsertionSort();
        InsertionSort.insertionSort(a,n);
        printArray(a);
    }


}
