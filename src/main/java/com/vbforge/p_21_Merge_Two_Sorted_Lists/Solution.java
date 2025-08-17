package com.vbforge.p_21_Merge_Two_Sorted_Lists;

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

        // Test case 1: list1 = [1,2,4], list2 = [1,3,4] -> [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println("Test case 1:");
        System.out.print("List1: ");
        printList(list1);
        System.out.print("List2: ");
        printList(list2);
        ListNode result1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Merged: ");
        printList(result1);
        System.out.println();

        // Test case 2: Empty lists [] and [] -> []
        System.out.println("Test case 2 (both empty):");
        ListNode result2 = solution.mergeTwoLists(null, null);
        System.out.print("Merged: ");
        printList(result2);
        System.out.println();

        // Test case 3: [] and [0] -> [0]
        ListNode list3 = new ListNode(0);
        System.out.println("Test case 3:");
        System.out.print("List1: ");
        printList(null);
        System.out.print("List2: ");
        printList(list3);
        ListNode result3 = solution.mergeTwoLists(null, list3);
        System.out.print("Merged: ");
        printList(result3);
        System.out.println();

        // Test case 4: Different lengths [1,2,3,4,5] and [6,7]
        ListNode list4a = new ListNode(1);
        list4a.next = new ListNode(2);
        list4a.next.next = new ListNode(3);
        list4a.next.next.next = new ListNode(4);
        list4a.next.next.next.next = new ListNode(5);

        ListNode list4b = new ListNode(6);
        list4b.next = new ListNode(7);

        System.out.println("Test case 4 (different lengths):");
        System.out.print("List1: ");
        printList(list4a);
        System.out.print("List2: ");
        printList(list4b);
        ListNode result4 = solution.mergeTwoLists(list4a, list4b);
        System.out.print("Merged: ");
        printList(result4);
        System.out.println();

        // Test case 5: Interleaving values
        ListNode list5a = new ListNode(1);
        list5a.next = new ListNode(5);
        list5a.next.next = new ListNode(9);

        ListNode list5b = new ListNode(2);
        list5b.next = new ListNode(6);
        list5b.next.next = new ListNode(8);

        System.out.println("Test case 5 (interleaving):");
        System.out.print("List1: ");
        printList(list5a);
        System.out.print("List2: ");
        printList(list5b);
        ListNode result5 = solution.mergeTwoLists(list5a, list5b);
        System.out.print("Merged: ");
        printList(result5);

    }

    /**
     * Merges two sorted linked lists into one sorted list.
     *
     * Algorithm - Iterative Approach with Dummy Node:
     * 1. Create a dummy node to simplify edge cases
     * 2. Use a current pointer to build the merged list
     * 3. Compare values from both lists and attach the smaller one
     * 4. Move the pointer of the list from which we took the node
     * 5. When one list is exhausted, attach the remaining nodes
     * 6. Return dummy.next (the actual head of merged list)
     *
     * Time Complexity: O(m + n) where m and n are lengths of the lists
     * Space Complexity: O(1) as we only use a few pointers
     */
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        //traverse both lists and merge
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        //attach remaining nodes (one of the lists will be null):
        if(list1 != null){
            current.next = list1;
        } else {
            current.next = list2;
        }

        //return head of merged list (skip dummy node)
        return dummy.next;
    }

    /**
     * Alternative recursive solution for comparison.
     * More elegant but uses O(m + n) space due to call stack.
     */
    private static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        // Base cases
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Recursive cases
        if (list1.val <= list2.val) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }

    //helper method to print:
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
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
