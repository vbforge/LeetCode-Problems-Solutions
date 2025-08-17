# 🐢🐇 Floyd's Cycle Detection Algorithm (Tortoise and Hare)

## 📌 Overview
This implementation uses the **classic Floyd's Cycle Detection Algorithm** (also known as the **Tortoise and Hare Algorithm**) to detect a cycle in a linked list with **O(1) space complexity**.

The idea:
- Use **two pointers** moving at different speeds.
- If there's a **cycle**, they will eventually meet.
- If there's **no cycle**, the fast pointer will reach the end.

---

## ⚙️ Algorithm Steps

1. **Initialize two pointers**:
    - **Slow pointer (tortoise)** → moves **1 step** at a time.
    - **Fast pointer (hare)** → moves **2 steps** at a time.

2. **Traverse the list**:
    - Move pointers at their respective speeds.
    - If `slow == fast` → **cycle detected**.
    - If `fast` or `fast.next` becomes `null` → **no cycle**.

---

## 🧠 Why It Works
- In a cycle, the fast pointer **gains 1 step per iteration** over the slow pointer.
- Eventually, this gain will make them **meet at the same node**.
- If there’s no cycle, the fast pointer will **fall off the list** (reach `null`).

---

## ⏱️ Complexity Analysis
- **Time Complexity**: `O(n)` – Each pointer visits each node at most twice.
- **Space Complexity**: `O(1)` – Only two pointer variables are used.

---

## ✅ Edge Cases Covered
- Empty list (`head == null`)
- Single node without a cycle (`head.next == null`)
- Cycle starting at various positions in the list

---

## 🧪 Example Usage

```java
public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;         // move 1 step
        fast = fast.next.next;    // move 2 steps

        if (slow == fast) return true; // cycle found
    }

    return false; // no cycle
}
```

---

## 📋 Test Cases
| Test Case | Input | Expected Output |
|-----------|-------|-----------------|
| Empty List | `null` | `false` |
| Single Node (no cycle) | `1 -> null` | `false` |
| Single Node (cycle) | `1 -> 1` | `true` |
| Cycle in middle | `1 -> 2 -> 3 -> 4 -> 2...` | `true` |
| No cycle | `1 -> 2 -> 3 -> null` | `false` |

---

## 📚 References
- [Floyd's Tortoise and Hare Algorithm - Wikipedia](https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare)
