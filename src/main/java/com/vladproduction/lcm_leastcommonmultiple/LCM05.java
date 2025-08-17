package com.vladproduction.lcm_leastcommonmultiple;

import java.util.Scanner;

public class LCM05 {
    public static void main(String[] args) {
        LCM05 LCM03 = new LCM05();
        LCM03.run();
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

    private int findLCM(int [] array){
        int res = 0;
        int lsm2 = findLCM2(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            res = findLCM2(lsm2,array[i]);
        }
        return res;
    }

    private int findLCM2(int a, int b) {
        return a*b/findGCD(a, b);
    }

    private int findGCD(int x, int y) {
        while (x*y != 0)
        {
            if (x < y) y = y%x;
            else x = x%y;
        }
        return x + y;
    }

}
