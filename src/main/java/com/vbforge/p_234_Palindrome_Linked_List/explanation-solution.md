# Palindrome Linked List — Two-Pointer Approach

This project implements a solution to check whether a **singly linked list** is a palindrome in **O(n)** time and **O(1)** space.

---

## 📌 Problem Overview
A palindrome is a sequence that reads the same forward and backward.  
Given the head of a singly linked list, determine if the list is a palindrome **without** using extra space for storing values.

---

## 💡 Key Insight
Use the **two-pointer** technique to:
1. Find the middle of the list
2. Reverse the second half
3. Compare the two halves
4. (Optional) Restore the list to its original state

---

## 🔍 Algorithm Steps

### 1️⃣ Find the Middle
- Use **fast/slow pointers**:
  - `fast` moves **2 steps**
  - `slow` moves **1 step**
- When `fast` reaches the end, `slow` is at the middle.

### 2️⃣ Reverse the Second Half
- Reverse the list starting from `slow.next`.

### 3️⃣ Compare Halves
- Compare nodes from the start (`head`) and from the start of the reversed second half.

### 4️⃣ Restore the List (Optional)
- Reverse the second half back to preserve the original list.

---

## ⏳ Time and Space Complexity
- **Time Complexity:** `O(n)` — Traverses the list a constant number of times
- **Space Complexity:** `O(1)` — Only a few extra pointers are used

---

## ⚠️ Key Points
- **Odd-length lists:** The middle element is ignored in comparison.
- **Even-length lists:** Both halves are compared fully.
- **Edge cases:** Handles empty lists and single-node lists correctly.
- **List preservation:** Restores the original structure if needed.

---

## 🧪 Test Cases

| Input                | Output | Explanation                      |
|----------------------|--------|----------------------------------|
| `[1,2,2,1]`          | `true` | Even-length palindrome           |
| `[1,2]`              | `false`| Not a palindrome                 |
| `[1]`                | `true` | Single element                   |
| `[1,2,3,2,1]`        | `true` | Odd-length palindrome            |

---

## 📜 Example
```java
Input: head = [1, 2, 3, 2, 1]
Output: true
```

---

## 🏗️ Implementation Outline
```java
public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;

    // Step 1: Find the middle
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse the second half
    ListNode secondHalf = reverse(slow);

    // Step 3: Compare halves
    ListNode p1 = head, p2 = secondHalf;
    boolean result = true;
    while (p2 != null) {
        if (p1.val != p2.val) {
            result = false;
            break;
        }
        p1 = p1.next;
        p2 = p2.next;
    }

    // Step 4: Restore list
    reverse(secondHalf);

    return result;
}

private ListNode reverse(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
```

---

## ✅ Advantages
- No extra array or stack for storing values
- Works in-place with **O(1)** extra space
- Restores the original list if needed
