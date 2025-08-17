package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class MainLCM06 {
    public static void main(String[] args) {
        MainLCM06 main = new MainLCM06();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            String m = scanner.next();
            int maxValue = Integer.parseInt(m);
            if (maxValue <= 100) {
                array[i] = maxValue;
            }
        }
        int lcm = findLCM(array);
        System.out.println(lcm);
    }

    private int findLCM(int[] array) {
        if (array.length == 0)return 0;
        if (array.length == 1)return array[0];

        int lcm = findLCM2(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            lcm = findLCM2(lcm, array[i]);
        }
        return lcm;
    }

    private static int findGCD(int x, int y) {
        while (x * y != 0) {
            if (x < y) {
                y = y % x;
            } else {
                x = x % y;
            }
        }
        return x + y;
    }
    private static int findLCM2(int x, int y) {
        return x * y / findGCD(x, y);
    }
}