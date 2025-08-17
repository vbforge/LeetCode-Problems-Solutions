package com.vladproduction.odd_vs_even;


import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        TernaryOperator main = new TernaryOperator();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reminder = number % 2;
        String text = "This number is: ";
        text += (reminder==0? "even":"odd");
        System.out.println(text);

    }

}
