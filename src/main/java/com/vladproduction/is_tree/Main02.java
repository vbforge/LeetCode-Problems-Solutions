package com.vladproduction.is_tree;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Main02 main = new Main02();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        if (n == 0) {
            System.out.println("YES");
            return;
        }
        int e = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i][j] == 1) {
                    e++;
                }
            }
            if (e != n - 1) {
                System.out.println("YES");
                return;
            }
            if (n == 1) {
                System.out.println("YES");
                return;
            }
            for (int j = 0; j < n; j++) {
                boolean ones = false;
                for (int k = 0; k < n; k++) {
                    if (a[i][j] == 1) {
                        ones = true;
                        break;
                    }
                }
                if (!ones) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
