package com.vladproduction.gcd_greatestcommondivisor;

import java.util.Scanner;

public class GCD01 {
    public static void main(String[] args) {
        GCD01 main = new GCD01();
        main.run();
    }

    private void run() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            String m = scanner.next();
            array[i] = Integer.parseInt(m);
        }
        //System.out.println(Arrays.toString(array));
        int gcd = findGCD(array);
        System.out.println(gcd);
    }

    private int findGCD(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        int gcd = findGCD(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            gcd = findGCD(gcd, array[i]);
        }

        return gcd;
    }

    private int findGCD(int a, int b) {

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
}
