package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class LCM01 {
    public static void main(String[] args) {
        LCM01 LCM01 = new LCM01();
        LCM01.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long res = lcm(a,b);
        System.out.println(res);

    }

    public static long lcm(long a, long b) {
        // find min(a,b)
        long hcf = a<b?a:b;
        // just loop and decrement
        for (;; hcf--) {
            if((a%hcf==0) && (b%hcf==0)) {
                // guaranteed to exit
                // when hcf reaches 1
                break;
            }
        }
        return a*(b/hcf);
    }
}
