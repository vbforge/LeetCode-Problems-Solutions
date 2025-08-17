# Merge Two Sorted Lists (LeetCode #21)

## Problem Description

You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists into one sorted list. The list should be made by **splicing together** the nodes of the first two lists. Return the head of the merged linked list.

### Examples

**Example 1:**
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

**Example 2:**
```
Input: list1 = [], list2 = []
Output: []
```

**Example 3:**
```
Input: list1 = [], list2 = [0]
Output: [0]
```

### Constraints
- The number of nodes in both lists is in the range [0, 50]
- -100 <= Node.val <= 100
- Both `list1` and `list2` are sorted in **non-decreasing** order

## Solution Approach

### Algorithm - Iterative with Dummy Node

The optimal approach uses a **dummy node** technique to simplify edge case handling:

1. **Create Dummy Node**: Initialize a dummy node to avoid complex head management
2. **Two-Pointer Traversal**: Use pointers to traverse both lists simultaneously
3. **Compare and Attach**: At each step, compare current values and attach the smaller node
4. **Advance Pointer**: Move the pointer of the list from which we took the node
5. **Handle Remaining**: When one list is exhausted, attach all remaining nodes from the other
6. **Return Result**: Return `dummy.next` (the actual head of merged list)

### Visual Example

For `list1 = [1,2,4]` and `list2 = [1,3,4]`:

```
Initial:
list1: 1 -> 2 -> 4
list2: 1 -> 3 -> 4
dummy: 0
       ^current

Step 1: Compare 1 <= 1, take from list1
dummy: 0 -> 1
            ^current
list1:      2 -> 4
list2: 1 -> 3 -> 4

Step 2: Compare 2 > 1, take from list2
dummy: 0 -> 1 -> 1
                 ^current
list1: 2 -> 4
list2:      3 -> 4

Step 3: Compare 2 <= 3, take from list1
dummy: 0 -> 1 -> 1 -> 2
                      ^current
list1:           4
list2: 3 -> 4

Step 4: Compare 4 > 3, take from list2
dummy: 0 -> 1 -> 1 -> 2 -> 3
                           ^current
list1: 4
list2:      4

Step 5: Compare 4 <= 4, take from list1
dummy: 0 -> 1 -> 1 -> 2 -> 3 -> 4
                                ^current
list1: null
list2: 4

Step 6: list1 is null, attach remaining list2
dummy: 0 -> 1 -> 1 -> 2 -> 3 -> 4 -> 4

Final result: [1,1,2,3,4,4]
```

### Implementation Details

**Key Points:**
- **Dummy Node Trick**: Eliminates the need to handle the first node specially
- **Stable Merge**: When values are equal, we take from `list1` first (maintains relative order)
- **No Extra Space**: We reuse existing nodes, just rewiring the `next` pointers
- **Handles All Edge Cases**: Empty lists, different lengths, all values from one list

### Time & Space Complexity

- **Time Complexity**: O(m + n) where m and n are the lengths of the lists
  - We visit each node exactly once
- **Space Complexity**: O(1) for iterative approach
  - Only uses a constant amount of extra space (dummy node and pointers)

### Alternative Approaches

#### 1. Recursive Solution
```java
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    
    if (list1.val <= list2.val) {
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    } else {
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
    }
}
```
- **Pros**: More elegant and intuitive
- **Cons**: O(m + n) space complexity due to call stack

#### 2. Without Dummy Node
```java
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    
    ListNode head, current;
    
    // Determine the head
    if (list1.val <= list2.val) {
        head = current = list1;
        list1 = list1.next;
    } else {
        head = current = list2;
        list2 = list2.next;
    }
    
    // Merge the rest
    while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            current.next = list1;
            list1 = list1.next;
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }
    
    current.next = (list1 != null) ? list1 : list2;
    return head;
}
```
- **Pros**: No dummy node
- **Cons**: More complex edge case handling

## Edge Cases Handled

1. **Both lists empty**: Returns `null`
2. **One list empty**: Returns the other list
3. **Different lengths**: Properly handles remaining nodes
4. **All values equal**: Maintains stable ordering
5. **Single nodes**: Works correctly with minimal lists

## Testing Strategy

The solution includes comprehensive test cases:
- **Basic merge**: Example from problem statement
- **Empty lists**: Both empty, one empty
- **Different lengths**: Long list + short list
- **Interleaving values**: Values that alternate between lists
- **Equal values**: Testing stable merge behavior

## Common Mistakes to Avoid

1. **Forgetting to handle null lists**
2. **Not advancing pointers correctly**
3. **Losing reference to remaining nodes**
4. **Creating new nodes instead of reusing existing ones**
5. **Complex head management without dummy node**

Run the `main` method to see all test cases in action and verify the solution works correctly!