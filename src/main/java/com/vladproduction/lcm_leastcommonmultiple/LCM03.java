package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class LCM03 {
    public static void main(String[] args) {
        LCM03 LCM03 = new LCM03();
        LCM03.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = lcm(a, b);
        System.out.println(res);

    }

    public static int lcm(int a, int b) {
        int gcd = Math.min(a, b);
        for (; ; gcd--) {
            if ((a % gcd == 0) && (b % gcd == 0)) {
                break;
            }
        }
        return a * (b / gcd);
    }

}
