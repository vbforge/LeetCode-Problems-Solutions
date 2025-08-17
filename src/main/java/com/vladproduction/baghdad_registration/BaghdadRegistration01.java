package com.vladproduction.baghdad_registration;

import java.util.Scanner;

public class BaghdadRegistration01 {
    public static void main(String[] args) {
        BaghdadRegistration01 main = new BaghdadRegistration01();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(((n + 2) / 3) + " " + n / 2);
    }
}
