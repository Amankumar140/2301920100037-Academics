# README FOR ALL Linked List  SOLUTION AND APPROACHES 
---

# Remove Duplicates From Sorted Linked List 
# Problem Number : #83
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem requires removing duplicate elements from a sorted linked list. 
Since the list is sorted, duplicates will always appear consecutively. 
This property allows us to traverse the list just once, skipping over duplicate nodes.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialization: Start with a pointer, res, set to the head of the list. This pointer will be returned at the end as the updated list.
2. Traverse the List:
        - While the current node (head) and its next node exist, compare their values:
        - If the current node's value equals the next node's value, skip the next node by adjusting the next pointer (head->next = head->next->next).
        - Otherwise, move the head pointer to the next node (head = head->next).
3. Return the Modified List: The traversal ensures that all duplicates are removed by the time the loop exits, so return res.
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the number of nodes in the linked list, as we only traverse the list once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as the algorithm uses constant extra space.

---

# Reverse Linked List 
# Problem Number : #206

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To reverse a singly linked list, the goal is to reverse the direction of the next pointers for each node in the list. 
Instead of moving from one node to the next, we "flip" the connections so that each node points to its previous node.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialization:
       - Use three pointers:
              - prev (initially NULL): Tracks the reversed portion of the list.
              - cur (initially head): Tracks the current node being processed.
              - next: Temporarily stores the next node to ensure we don't lose access to the remaining list during reversal.
2. Reversing the List:
    - Iterate through the list while cur is not NULL:
        - Save the next node in next (next = cur->next).
        - Reverse the current node's pointer (cur->next = prev).
        - Move the prev pointer forward to the current node (prev = cur).
        - Move the cur pointer forward to the next node (cur = next).
3. Return the New Head:
      - After the loop, prev points to the new head of the reversed list. Return prev.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the number of nodes in the linked list, as each node is processed exactly once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as the algorithm uses only a constant amount of extra space.
---

# Linked List Cycle 
# Problem Number : #141

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem is to detect whether a cycle exists in a linked list. 
This can be efficiently solved using the Floyd's Tortoise and Hare algorithm.
By using two pointers moving at different speeds, we can determine if there is a cycle because the two pointers will eventually meet if a cycle exists.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize Two Pointers:
        - slow: Moves one step at a time.
        - fast: Moves two steps at a time.
        - Both pointers start at the head of the list.
2. Traverse the List:
        - While the fast pointer and its next node are not NULL:
                - Move slow one step forward (slow = slow->next).
                - Move fast two steps forward (fast = fast->next->next).
                - If at any point slow equals fast, a cycle is detected, and the function returns true.
3. No Cycle:
        -If the fast pointer reaches the end of the list (NULL), the function returns false, indicating there is no cycle.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the number of nodes in the list. In the worst case, the fast pointer traverses the list at twice the speed of slow, so they meet in linear time.
*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as no additional space is used besides the two pointers.
---

#  Merge Two Sorted Linked list 
# Problem Number : #21

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To merge two sorted linked lists into one sorted list, we leverage the fact that the two lists are already sorted. 
We can use a pointer to iteratively compare the smallest elements from both lists and build the merged list in ascending order.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Use a Dummy Node:
        - A dummy node (dummy) is created to act as the starting point for the new merged list. This simplifies edge cases like empty lists.
        - prev is a pointer that keeps track of the tail of the merged list as we build it.
2. Traverse Both Lists:
        - Use two pointers, fast (for list1) and slow (for list2), to compare the current nodes of the two lists.
        - If fast->val is smaller than slow->val, attach fast to the merged list and move the fast pointer forward.
        - Otherwise, attach slow to the merged list and move the slow pointer forward.
        - Move the prev pointer forward to the last node in the merged list.
3. Attach Remaining Nodes:
        - Once one of the lists is fully traversed, attach the remaining nodes from the other list to the merged list (either fast or slow).
4. Return the Result:
        -Return dummy.next, which points to the head of the merged list.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n+m), where n and m are the lengths of list1 and list2, respectively. Each node is visited once.
*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as the merging is done in-place without requiring extra memory.

---
# ALL Solutions of Linked List  are completed
