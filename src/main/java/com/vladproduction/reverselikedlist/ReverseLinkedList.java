package com.vladproduction.reverselikedlist;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class ReverseLinkedList {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void display(Node node){
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
    }
}
