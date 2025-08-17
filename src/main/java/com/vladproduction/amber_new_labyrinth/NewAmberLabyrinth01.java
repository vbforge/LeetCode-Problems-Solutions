package com.vladproduction.amber_new_labyrinth;

import java.util.Scanner;

public class NewAmberLabyrinth01 {
    public static void main(String[] args) {
        NewAmberLabyrinth01 main = new NewAmberLabyrinth01();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int [] l = new int[scanner.nextInt()+1];
        for (int i = 1; i < l.length; i++) {
            l[i] = scanner.nextInt(); //read
        }
        int [] coins = new int[l.length];  //for counting coins
        coins[0] = 0; //start from outside, count as '0' value
        coins[1] = Integer.MIN_VALUE; //never visit this position, by task rule
        coins[2] = l[2]; //jump to the [2] position
        if (l.length>3){ //if we have boxes more than 3
            coins[3] = l[3];//look what in [3] position
            for (int i = 4; i < l.length; i++) { //and from [4] pos goes to the end
                coins[i] = Math.max(coins[i-2], coins[i-3]) + l[i]; //pick up max value
                //here we can say about dynamic programming(choose the best variation for next step)
                //and counting every position (coins) by each jumping
            }
        }
        System.out.println(coins[coins.length-1]); //print value of the last position
    }
}
