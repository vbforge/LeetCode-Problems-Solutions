package com.vladproduction.trie_word_dictionary;

/**
 * Design add and search words data structure
 * */

public class WordDictionary {

    private final Node root;

    public WordDictionary() {
        root = new Node();
    }

    /**
     * Adds a word into the data structure.
     * */
    public void addWord(String word) {
        Node curr = root;
        for(char ch : word.toCharArray()) {
            if(curr.getNodes()[ch-'a'] == null)
                curr.getNodes()[ch-'a'] = new Node();
            curr = curr.getNodes()[ch - 'a'];
        }
        curr.setEnd(true);
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot
     * character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return root.find(word, 0); // string, index
    }
      
    
}