package com.vladproduction.group_of_singers;

import java.util.Scanner;

public class GroupOfSingers01 {
    public static void main(String[] args) {
        GroupOfSingers01 main = new GroupOfSingers01();
        main.run();
    }

    private void run() {

        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        int x = Integer.parseInt(n[0]);
        int y = Integer.parseInt(n[1]);
        boolean isDefined = (definition(x, y) == 1);
        if (isDefined) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //values of x and y calculating numbers : '1' or '0'
    //if 1 - YES(all will sign); if 0 - NO (not all will sign)
    private static int definition(int x, int y) {
        while (x * y != 0) {
            if (x < y) {
                y = y % x;
            } else x = x % y;
        }
        return x + y;
    }
}
