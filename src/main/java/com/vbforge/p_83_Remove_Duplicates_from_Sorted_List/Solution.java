package com.vbforge.p_83_Remove_Duplicates_from_Sorted_List;

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

        Solution solution = new Solution();

        // Test case 1: [1,1,2] -> [1,2]
        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(1);
        test1.next.next = new ListNode(2);

        System.out.println("Test case 1:");
        System.out.print("Input: ");
        printList(test1);
        ListNode result1 = solution.deleteDuplicates(test1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println();

        // Test case 2: [1,1,2,3,3] -> [1,2,3]
        ListNode test2 = new ListNode(1);
        test2.next = new ListNode(1);
        test2.next.next = new ListNode(2);
        test2.next.next.next = new ListNode(3);
        test2.next.next.next.next = new ListNode(3);

        System.out.println("Test case 2:");
        System.out.print("Input: ");
        printList(test2);
        ListNode result2 = solution.deleteDuplicates(test2);
        System.out.print("Output: ");
        printList(result2);
        System.out.println();

        // Test case 3: Empty list
        System.out.println("Test case 3 (empty list): []");
        ListNode result3 = solution.deleteDuplicates(null);
        System.out.print("Output: ");
        printList(result3);
        System.out.println();

        // Test case 4: Single element [1]
        ListNode test4 = new ListNode(1);
        System.out.println("Test case 4:");
        System.out.print("Input: ");
        printList(test4);
        ListNode result4 = solution.deleteDuplicates(test4);
        System.out.print("Output: ");
        printList(result4);

    }

    /**
     * Removes duplicates from a sorted linked list.
     *
     * Algorithm:
     * 1. Handle edge case: if head is null, return null
     * 2. Use current pointer starting from head
     * 3. While current and current.next exist:
     *    - If current.val == current.next.val, skip the duplicate
     *    - Otherwise, move to next node
     * 4. Return the original head
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1) as we only use a few pointers
     */
    public ListNode deleteDuplicates(ListNode head) {
        //edge case: empty list
        if(head == null){
            return null;
        }
        ListNode current = head;

        //traverse the list
        while (current != null && current.next != null){
            if(current.val == current.next.val){
                //skip duplicate node
                current.next = current.next.next;
            } else {
                // Move to next node only if no duplicate found
                current = current.next;
            }
        }

        return head;
    }

    //helper method to print the linked list
    private static void printList(ListNode head){
        if(head == null){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        ListNode current = head;
        while (current != null){
            System.out.print(current.val);
            if(current.next != null){
                System.out.print(",");
            }
            current = current.next;
        }

        System.out.println("]");
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
