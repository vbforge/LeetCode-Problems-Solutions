package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class LCM02 {
    public static void main(String[] args) {
        LCM02 main = new LCM02();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = lcm(a,b);
        System.out.println("res = "+res);

    }

    public static int lcm(int a, int b) {
        //lcm-least common multiple; the smallest positive integer that is divisible by both a and b
        //наименьшее натуральное число, которое делится и на a, и на b
        // find min(a,b)
        //gcd-greatest common divisor; largest positive int that divides each of the integers
        //наибольшее положительное целое число, которое делит каждое из целых чисел
        int gcd = Math.min(a, b);
        System.out.println("gcd = "+gcd);
        // just loop and decrement
        for (;; gcd--) {
            System.out.println("loop start");
            if((a%gcd==0) && (b%gcd==0)) {
                // guaranteed to exit
                // when hcf reaches 1
                break;
            }
        }
        return a*(b/gcd);
    }
}
