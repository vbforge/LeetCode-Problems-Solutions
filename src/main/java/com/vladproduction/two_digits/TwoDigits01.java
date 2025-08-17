package com.vladproduction.two_digits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDigits01 {
    public static void main(String[] args) {
        TwoDigits01 main = new TwoDigits01();
        main.run();
    }

    /*      рекуррентность:
        f(n) = f(n – 1) + f(n – 2),
        f(1) = 2, f(2) = 4              */

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(2);
            return;
        }
        int[] m = new int[n+1];
        m[0] = 0;
        m[1] = 2;
        m[2] = 4;
        for (int i = 3; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        System.out.println(m[n]);
        List<String> list = printVariants(5,9,n, false);
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
    }

    static List<String> printVariants(int a, int b, int n, boolean printAll){
        /*
        a aa aaa aaaa

        if (n==1){
        a b
        }
        if (n==2){
        aa bb ab ba
        }
        if (n==3){
         List = aaa bba aba baa aab bbb abb bab

        }
         */
        List<String> res = new ArrayList<>();

            res.add(a+"");
            res.add(b+"");
        List<String> currentVariants = new ArrayList<>();
        currentVariants.add(a+"");
        currentVariants.add(b+"");
        for (int i = 1; i < n; i++) {

            List<String> nextVariants = createNextVariant(a,b,currentVariants);
            currentVariants = nextVariants;
            if(printAll){
                res.addAll(nextVariants);
            }else {
                res=nextVariants;
            }

        }
        return res;

    }
    static List<String> createNextVariant(int a, int b, List <String> previousItems){

        String notValidA = ""+a+a+a;
        String notValidB = ""+b+b+b;
        List<String> variants = new ArrayList<>();
        for (int i = 0; i < previousItems.size(); i++) {
            String prev = previousItems.get(i);
            String itemA = prev+a; //candidates
            String itemB = prev+b;
            if(!(itemA).contains(notValidA) && !(itemA).contains(notValidB)){
                variants.add(itemA);
            }
            if(!(itemB).contains(notValidA) && !(itemB).contains(notValidB)){
                variants.add(itemB);
            }

        }
        return variants;
    }

}
