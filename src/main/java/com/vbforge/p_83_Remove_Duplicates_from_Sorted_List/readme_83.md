# Remove Duplicates from Sorted List (LeetCode #83)

## Problem Description

Given the head of a **sorted** linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

### Examples

**Example 1:**
```
Input: head = [1,1,2]
Output: [1,2]
```

**Example 2:**
```
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

### Constraints
- The number of nodes in the list is in the range [0, 300]
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order

## Solution Approach

### Algorithm

The key insight is that since the linked list is **already sorted**, all duplicate values will be adjacent to each other. This allows us to use a simple one-pass algorithm:

1. **Handle Edge Case**: If the list is empty (`head == null`), return `null`
2. **Initialize Pointer**: Start with `current` pointing to `head`
3. **Traverse and Remove Duplicates**:
   - While `current` and `current.next` both exist:
     - If `current.val == current.next.val`: Skip the duplicate by setting `current.next = current.next.next`
     - Otherwise: Move to the next node (`current = current.next`)
4. **Return**: The original `head` (now with duplicates removed)

### Visual Example

For input `[1,1,2,3,3]`:

```
Step 1: 1 -> 1 -> 2 -> 3 -> 3
        ^current
        Found duplicate (1 == 1), skip second 1

Step 2: 1 -> 2 -> 3 -> 3
        ^current
        No duplicate (1 != 2), move current

Step 3: 1 -> 2 -> 3 -> 3
             ^current
        No duplicate (2 != 3), move current

Step 4: 1 -> 2 -> 3 -> 3
                  ^current
        Found duplicate (3 == 3), skip second 3

Final:  1 -> 2 -> 3
```

### Time & Space Complexity

- **Time Complexity**: O(n) where n is the number of nodes
  - We visit each node at most once
- **Space Complexity**: O(1)
  - We only use a constant amount of extra space (the `current` pointer)

### Key Points

1. **In-place Modification**: We modify the original list structure rather than creating a new list
2. **Pointer Management**: We only advance the `current` pointer when no duplicate is found
3. **Edge Cases Handled**:
   - Empty list (head == null)
   - Single node list
   - List with all duplicates
   - List with no duplicates

### Alternative Approaches

**Recursive Solution** (less efficient due to call stack):
```java
public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) return head;
    
    if (head.val == head.next.val) {
        return deleteDuplicates(head.next);
    } else {
        head.next = deleteDuplicates(head.next);
        return head;
    }
}
```

**Two-Pointer Approach** (same complexity, different style):
```java
public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;
    
    ListNode slow = head;
    ListNode fast = head.next;
    
    while (fast != null) {
        if (slow.val != fast.val) {
            slow.next = fast;
            slow = fast;
        }
        fast = fast.next;
    }
    slow.next = null;
    return head;
}
```

## Testing

The solution includes comprehensive test cases:
- Basic examples from the problem
- Empty list
- Single element list
- Lists with consecutive duplicates
- Lists with no duplicates

Run the `main` method to see all test cases in action!