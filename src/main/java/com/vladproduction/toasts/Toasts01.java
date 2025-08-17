package com.vladproduction.toasts;

import java.util.Scanner;

public class Toasts01 {
    public static void main(String[] args) {
        Toasts01 main = new Toasts01();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        doToasts(a, b);
    }

    private void doToasts(int toasts, int panCapacity) {

        if(toasts==0){
            System.out.println(0);
            return;

        }

        int amountFrying = 0;
        if(toasts<=panCapacity){
            amountFrying++;
            int time = (amountFrying*2)*2;
            System.out.println(time);
        }else {
            int fullPanCount = toasts/panCapacity;
            int reminderToasts = toasts%panCapacity;
            if(reminderToasts == 0){
                int time = (fullPanCount*2)*2;
                System.out.println(time);
            }else {
                int reminderTime = 6;
                int fullTime = (fullPanCount-1)*4;
                int time = reminderTime+fullTime;
                System.out.println(time);
            }
        }
    }
}
