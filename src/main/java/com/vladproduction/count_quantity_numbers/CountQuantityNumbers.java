package com.vladproduction.count_quantity_numbers;


import java.util.Scanner;

public class CountQuantityNumbers {
    public static void main(String[] args) {
        CountQuantityNumbers main = new CountQuantityNumbers();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tenThousands = ((number/1000)/10)%10;
        System.out.println("tenThousands = "+tenThousands);
        int thousands = ((number/100)/10)%10;
        System.out.println("thousands = "+thousands);
        int hundreds = ((number/10)/10)%10;
        System.out.println("hundreds = "+hundreds);
        int tenths = (number / 10) % 10;
        System.out.println("tenths = "+tenths);
        String text = "This number has: \n";

        if(number>=10000){
            text += tenThousands + "\tby '10000'\n";
        }
        if(number>=1000){
            text += thousands + "\tby '1000'\n";
        }
        if(number>=100){
            text += hundreds + "\tby '100'\n";
        }
        if(number>=10){
            text += tenths + "\tby '10'\n";
        }

        System.out.println(text);

    }

}
