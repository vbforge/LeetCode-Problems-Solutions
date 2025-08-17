package com.vladproduction.genealogical_tree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenealogicalTree01 {
    public static void main(String[] args) {
        GenealogicalTree01 genealogicalTree01 = new GenealogicalTree01();
        genealogicalTree01.run();
    }

    private void run() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];//creating matrix
        for (int i = 0; i < n; i++) { //reading it by all rows
            while (true) { // moving by loop while
                int j = scanner.nextInt(); // read the sub-array
                if (j == 0) break; // when we see '0' stop loop and go to the next sub-array
                a[i][j - 1] = 1; //here we put '1' on the last element in a[i]sub-array
                            //[j-1] because martians starting counting from 1,(it`s index rule)
            }
        }
        //how to see matrix (to print it):
        //so now we have read related matrix (graph), how all edges connect to each others
        //such way we can print it to see our graph:
//        for (int i = 0; i<n; i++){
//            for (int j = 0; j<n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        //comment it, so we do not need to print it one`s again

        //now we create Set, and we can see which of martians has been added to the list
        //where there are already performed
        Set<Integer> performedSet = new HashSet<>();
        while (performedSet.size() < n){ //we are going to add martians to set while we have quantity
                                        //promoted of them but not already spoke
            for (int i = 0; i<n; i++){ // loop through till n
                if (!performedSet.contains(i)) { //and if set does not contain spoken martian
                    boolean check = metZero(a,i); //to check if we have '0' in the column for certain martian
                    if(check){ //if we have '0'
                        performedSet.add(i); //adding to our set martian (and count him as spoken)
                        System.out.print((i+1) + " "); //print it in separate line
                        writeZero(a, i); // we have to mark that such martian already in set (as spoken)
                    }
                }
            }
        }
    }

    private void writeZero(int[][] a, int i) {
        for (int j = 0; j < a.length; j++) {
            a[i][j] = 0;
        }
    }

    private boolean metZero(int[][] a, int j) { //run through
        for (int i = 0; i < a.length; i++) {
            if(a[i][j] != 0){ //if we do not meat '0'
                return false;
            }
        }
        return true;
    }
}
