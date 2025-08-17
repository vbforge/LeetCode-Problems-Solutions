package com.vladproduction.elementary_searching;

public class LinearSearch {

    private int [] theArray = new int[50];
    private int arraySize = 10;

    //generating random array:
    public void generateRandomArray(){
        for (int i = 0; i < arraySize; i++) {
           theArray[i] = (int)(Math.random() * 10) + 10;
        }
    }

    //printing array in horizontal:
    public void printHorizontal(int i){

        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + theArray[n] + " ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();

    }

    //linear search:
    public void linearSearch(int value){
        boolean isValueInArray = false;
        String indexesWithValue = "";
        for (int i = 0; i < arraySize; i++) {
            if(theArray[i] == value){
                isValueInArray = true;
                indexesWithValue += i + " ";
            }
            printHorizontal(i);
        }
        if(!isValueInArray){
            indexesWithValue = "None";
        }
        System.out.println();
        System.out.println("Value is catch in such index(s): " + indexesWithValue);
    }

    //main:
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.generateRandomArray();
        ls.linearSearch(18);
    }

}
