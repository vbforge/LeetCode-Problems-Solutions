package com.vladproduction.is_tree;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Main01 main = new Main01();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[n][n]; //size of our Graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt(); //read every position (elements)
            }
        }
        if(n == 0){
            System.out.println("YES");
            return;
        }
        //now we check if our Graph is Tree:
        //counting amount edges
        int e = 0;
        for (int i = 0; i < n; i++) { //run around graph
            for (int j = i+1; j < n; j++) { //int j = i+1 -->
                //as we have symmetric matrix, and do not count twice each edge
                //each row we start from his number (diagonal)
                //i+1 means that we take next element from position we start with
                //because it`s always '0' (Graph doesn`t have any loop)
                if(a[i][j] == 1){ //if on the position a[i][j] == '1'
                    //e++; //counting it (edges quantity)
                    //or we can write so directly:
                    e += a[i][j]; //because we don`t have any others numbers except '0' or '1'
                }
            }
            //now we look if it`s Tree or not: (if?):
            //amount of edges must be one(!!!) less than amount of tops
            if(e != n-1){
                System.out.println("NO"); //print that it`s not tree
                return;
            }
            if(n == 1){
                System.out.println("YES");
                return;
            }
            //we have to check as well that each rows of matrix has '1'
            //so it`s possible to reach next position from previous
            for (int j = 0; j < n; j++) {
                boolean ones = false;
                for (int k = 0; k < n; k++) {
                    if(a[i][j] == 1){
                        ones = true;
                        break;
                    }
                }
                if(!ones){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
