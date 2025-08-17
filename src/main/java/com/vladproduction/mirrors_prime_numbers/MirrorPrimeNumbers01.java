package com.vladproduction.mirrors_prime_numbers;

import java.util.Scanner;

public class MirrorPrimeNumbers01 {
    public static void main(String[] args) {

        MirrorPrimeNumbers01 main = new MirrorPrimeNumbers01();
        main.run();

    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findNumbers(scanner.nextInt(), scanner.nextInt()));
    }

    private int findNumbers(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            boolean isSimple = isSimple(i);
            if (isSimple) {
                int reverseValue = revert(i);
                boolean reverseNumberIsSimple = isSimple(reverseValue);
                if (reverseNumberIsSimple) {
                    count++;
                }
            }
        }
        return count;
    }

    private int revert(int m) {
        StringBuilder sb = new StringBuilder();
        sb.append(m);
        String reverseValue = sb.reverse().toString();
        return Integer.parseInt(reverseValue);
    }

    private static boolean isSimple(int x) {
        if ((x == 0) || (x == 1)) {
            return false;
        }
        if ((x == 2) || (x == 3)) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        int k = (int) Math.sqrt(x) + 1;
        for (int i = 3; i < k; i = i + 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
