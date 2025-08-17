package com.vbforge.p_234_Palindrome_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public static void main(String[] args) {

        // Test case 1: [1,2,2,1] - should return true
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println("Test 1 [1,2,2,1]: " + isPalindrome(head1)); // true

        // Test case 2: [1,2] - should return false
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Test 2 [1,2]: " + isPalindrome(head2)); // false

        // Test case 3: [1] - should return true
        ListNode head3 = new ListNode(1);
        System.out.println("Test 3 [1]: " + isPalindrome(head3)); // true

        // Test case 4: [1,2,3,2,1] - should return true
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);
        head4.next.next.next = new ListNode(2);
        head4.next.next.next.next = new ListNode(1);
        System.out.println("Test 4 [1,2,3,2,1]: " + isPalindrome(head4)); // true

    }

    private static boolean isPalindrome(ListNode head){

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list using fast/slow pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverseList(slow.next);

        // Step 3: Compare the first half with the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalfCopy = secondHalf; // Keep a copy for restoration

        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: Restore the original list (optional, but good practice)
        slow.next = reverseList(secondHalfCopy);

        return isPalindrome;

    }


    /**
     * Helper method to reverse a linked list
     */
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
