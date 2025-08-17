package com.vladproduction.trie_word_dictionary;

public class Node {

    private Node[] nodes;
    private boolean isEnd;

    Node(){
        nodes = new Node[26];
    }

    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public boolean find(String word, int idx) {
        if(word.length() == idx) {
            return isEnd;
        }

        if(word.charAt(idx) == '.') {
            for(Node child : nodes) {
                if(child != null && child.find(word, idx+1))
                    return true;
            }
            return false;
        }
        else {
            if(nodes[word.charAt(idx) - 'a'] == null) {
                return false;
            }
            else {
                return nodes[word.charAt(idx) - 'a'].find(word, idx+1);
            }
        }
    }
}
