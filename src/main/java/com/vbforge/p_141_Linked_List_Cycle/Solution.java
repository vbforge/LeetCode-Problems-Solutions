package com.vbforge.p_141_Linked_List_Cycle;

/**
 * Definition for singly-linked list.
 *  class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) {
 *      val = x;
 *      next = null;
 *      }
 *  }
 */
public class Solution {
    public static void main(String[] args) {

        // Test case 1: [3,2,0,-4] with cycle at pos 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // Create cycle

        System.out.println("Test case 1: " + hasCycle(head1)); // Should print true

        // Test case 2: [1,2] with cycle at pos 0
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = head2; // Create cycle

        System.out.println("Test case 2: " + hasCycle(head2)); // Should print true

        // Test case 3: [1] with no cycle
        ListNode head3 = new ListNode(1);

        System.out.println("Test case 3: " + hasCycle(head3)); // Should print false

        // Test case 4: Empty list
        System.out.println("Test case 4: " + hasCycle(null)); // Should print false

    }

    /**
     * Detects if a linked list has a cycle using Floyd's Cycle Detection Algorithm
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1) - uses only two pointers
     *
     * @param head The head of the linked list
     * @return true if there is a cycle, false otherwise
     */
    private static boolean hasCycle(ListNode head) {

        // Handle edge cases: empty list or single node without cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers
        ListNode slow = head;    // Tortoise - moves 1 step at a time
        ListNode fast = head;    // Hare - moves 2 steps at a time

        // Move pointers until fast reaches end or they meet
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer 1 step
            fast = fast.next.next;      // Move fast pointer 2 steps

            // If pointers meet, there's a cycle
            if (slow == fast) {
                return true;
            }
        }

        // Fast pointer reached the end, no cycle exists
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
