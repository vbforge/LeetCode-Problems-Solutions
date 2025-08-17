package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 21) {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                String m = scanner.next();
                int maxValue = Integer.parseInt(m);
                if (maxValue <= 100) {
                    array[i] = maxValue;
                }
            }
            int result = findLCM(array);
            System.out.println(result);
        }
    }

    private int findLCM(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int lcm = findLCM2(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            lcm = findLCM2(lcm, array[i]);
        }
        return lcm;
    }

    private static int findGCD(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int mod = a % b;
        if (mod == 0) {
            return b;
        }
        return findGCD(b, mod);
    }

    private static int findLCM2(int x, int y) {
        return x * (y / findGCD(x, y));
    }
}

