package com.vladproduction.array_algorithms;

public class ArrayStructures {

    private int [] theArray = new int[50];

    private int arraySize = 10;

    //create random values inside of array:
    public void generateRandomArray(){
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }
    
    //printing array:
    public void printArray(){
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
            System.out.println("----------");
        }
    }

    //get value by index:
    public int getValueByIndex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }

    //does array contains such value:
    public boolean isArrayContainValue(int searchValue) {
        boolean isValueIn = false;
        for (int i = 0; i < arraySize; i++) {
            if(theArray[i] == searchValue){
            isValueIn = true;
            }
        }
            return isValueIn;
    }

    //deleting by index value and moving all others up
    public void deleteIndex(int index){
        System.out.println("index selected: " + index);
        System.out.println("value by index was: " + theArray[index]);
        if(index < arraySize){
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    //insert value at the end of array:
    public void insertValue(int value){
        System.out.println("insertion value is: " + value);
        if(arraySize < 50){
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    //linear search for value to get all matchers
    //(if using binary search case were going get only one matcher)
    //(but in case no duplicates values - better to use binary search)
    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexesWithValue = "";
        System.out.print("The Value was found in the Following: ");
        for (int i = 0; i < arraySize; i++) {
            if(theArray[i] == value){
                valueInArray = true;
                System.out.print(i + " ");
                indexesWithValue += i + " ";
            }
        }
        if (!valueInArray){
            indexesWithValue = "None";
            System.out.print(indexesWithValue);
        }
        System.out.println();
        return indexesWithValue;


    }


    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        System.out.println(arrayStructures.getValueByIndex(5));
        System.out.println(arrayStructures.isArrayContainValue(12));
        System.out.println();

        //delete here:
        System.out.println("delete here:");
        arrayStructures.deleteIndex(3);
        arrayStructures.printArray();
        System.out.println();

        //insert here:
        System.out.println("insert here:");
        arrayStructures.insertValue(77);
        arrayStructures.printArray();
        System.out.println();

        //linear search here:
        System.out.println("linear search here:");
        arrayStructures.linearSearchForValue(23);

    }
}
