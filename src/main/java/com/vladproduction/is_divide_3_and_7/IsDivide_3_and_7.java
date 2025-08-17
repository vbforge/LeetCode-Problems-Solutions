package com.vladproduction.is_divide_3_and_7;

import java.util.Scanner;

public class IsDivide_3_and_7 {
    public static void main(String[] args) {
        IsDivide_3_and_7 dividable = new IsDivide_3_and_7();
        dividable.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isDivide(n);
    }

    int tree = 3;
    int seven = 7;

    private void isDivide(int n) {
        int common = tree * seven;
        int mode = n % common;
        if (mode == 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
