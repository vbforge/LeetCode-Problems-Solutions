package com.vladproduction.demo;

public class ForEachAndStringBuilder {
    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println("*** modification through FOR-EACH does not affect original array ***");
        //array
        String[] strings = {"Java", "Spring", "MySql"};
        for (String string : strings) {
            System.out.print(string + 11 + " ");//can see changes (Java11 Spring11 MySql11)
        }
        System.out.println();
        for (String string : strings) {
            System.out.print(string + " "); //does not affect on original [] (Java Spring MySql )
        }

        System.out.println("\n==============================");
        System.out.println("*** modification through FOR loop array affected original***");
        //modification through for loop array:
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            System.out.print(str + " " + "(base stack) ");
        }

        System.out.println("\n==============================");
        System.out.println("*** modification through FOR-EACH in StringBuilder is affected***");
        //StringBuilder
        StringBuilder[] sb = new StringBuilder[3];
        sb[0] = new StringBuilder("Java");
        sb[1] = new StringBuilder("Spring");
        sb[2] = new StringBuilder("MySql");
        for (StringBuilder stringBuilder : sb) {
            stringBuilder.append(" - ").append(11); //modifying
        }
        //print to see modifications
        for (StringBuilder stringBuilder : sb) {
            System.out.print(stringBuilder + " "); //affected original
        }

        /*==============================
        *** modification through FOR-EACH does not affect original array ***
        Java11 Spring11 MySql11
        Java Spring MySql
        ==============================
        *** modification through FOR loop array affected original***
        Java (base stack) Spring (base stack) MySql (base stack)
        ==============================
        *** modification through FOR-EACH in StringBuilder is affected***
        Java - 11 Spring - 11 MySql - 11*/
    }
}
