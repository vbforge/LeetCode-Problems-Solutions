package com.vbforge.p_160_Intersection_of_Two_Linked_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static void main(String[] args) {

        // Case 1
        runTest(8, new int[]{4, 1, 8, 4, 5}, new int[]{5, 6, 1, 8, 4, 5}, 2, 3);
        // Case 2
        runTest(2, new int[]{1, 9, 1, 2, 4}, new int[]{3, 2, 4}, 3, 1);
        // Case 3
        runTest(0, new int[]{2, 6, 4}, new int[]{1, 5}, 3, 2);

    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        // Loop until they meet or both reach null
        while (pA != pB) {
            // Move to next node or switch head
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        // Either intersection node or null
        return pA;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static ListNode buildList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private static void runTest(int intersectVal, int[] listA, int[] listB, int skipA, int skipB) {
        ListNode headA = buildList(listA);
        ListNode headB = buildList(listB);

        if (intersectVal != 0) {
            // Find intersection node in listA
            ListNode intersectNode = headA;
            for (int i = 0; i < skipA; i++) {
                intersectNode = intersectNode.next;
            }
            // Attach listB's skipB-th node to the intersection node
            ListNode bNode = headB;
            for (int i = 0; i < skipB - 1; i++) {
                bNode = bNode.next;
            }
            bNode.next = intersectNode;
        }

        ListNode result = getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersected at '" + result.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }

}
