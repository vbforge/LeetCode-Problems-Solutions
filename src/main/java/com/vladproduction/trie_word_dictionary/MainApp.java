package com.vladproduction.trie_word_dictionary;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException {

        //version1();
        version2();

        //for version2 output expected:
        /*false
        true
        true
        true*/

    }

    private static void version1() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        WordDictionary obj = new WordDictionary();

        while (read.ready()) {
            String[] inp = read.readLine().split(" ");
            if (inp[0].equals("addWord")) {
                obj.addWord(inp[1]);
            } else if (inp[0].equals("search")) {
                System.out.println(obj.search(inp[1]));
            }
        }
    }

    private static void version2(){
        WordDictionary obj = new WordDictionary();

        File file = new File("src/main/java/com/dsa2/trie/test.txt");
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = read.readLine()) != null) {
                String[] inp = line.split(" ");
                if (inp[0].equals("addWord")) {
                    obj.addWord(inp[1]);
                } else if (inp[0].equals("search")) {
                    System.out.println(obj.search(inp[1]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
