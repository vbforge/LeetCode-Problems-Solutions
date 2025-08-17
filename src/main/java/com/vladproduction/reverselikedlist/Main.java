package com.vladproduction.reverselikedlist;

import static com.vladproduction.reverselikedlist.ReverseLinkedList.head;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();
        head = new ReverseLinkedList.Node(10);
        head.next = new ReverseLinkedList.Node(20);
        head.next.next = new ReverseLinkedList.Node(30);
        head.next.next.next = new ReverseLinkedList.Node(40);

        System.out.println("Linked List 'ORIGINAL'");
        list.display(head);

        head = list.reverse(head);
        System.out.println();

        System.out.println("Linked List (after reverse): ");
        list.display(head);

    }
}
