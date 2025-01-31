# README FOR ALL STACK SOLUTION AND APPROACHES 
---

# Valid Parentheses
# Problem Number : #20
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem requires checking if a given string of parentheses is balanced (valid). A valid string must satisfy:
          1. Every opening bracket ((, {, [) must have a corresponding closing bracket (), }, ]).
          2. The brackets must be closed in the correct order.
A stack is a natural choice for this problem because of its LIFO (Last In, First Out) behavior, which aligns with how brackets should be closed.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Use a Stack:
        - Push opening brackets ((, {, [).
        - When encountering a closing bracket:
                - If the stack is not empty and the top of the stack matches the corresponding opening bracket, pop the top.
                - Otherwise, return false (mismatched or extra closing bracket).
2. Final Check:
        - If the stack is empty at the end, the string is valid.
        - If there are unmatched opening brackets left, return false.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the string (each character is processed once).

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(n) in the worst case (all opening brackets are stored in the stack).

---
# Implement Stack using queue
# Problem Number : #225

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to implement a stack using a single queue. A stack follows the LIFO (Last In, First Out) principle, whereas a queue follows FIFO (First In, First Out). 
To mimic stack behavior using a queue, we ensure that the most recently added element is always at the front of the queue.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Push Operation:
        - Insert the element into the queue.
        - Rotate the queue (move all previous elements to the back) so that the newly inserted element becomes the front of the queue.
        - This ensures that pop() and top() operations retrieve the last pushed element efficiently.
2. Pop Operation:
        - The front element of the queue is the top of the stack.
        - Remove and return it.
3. Top Operation:
        - Simply return the front element of the queue.
4. Empty Operation:
        - Check if the queue is empty.

# Complexity
1. Push: O(n) (Reordering requires moving all previous elements)
2. Pop: O(1) (Directly remove from the front)
3. Top: O(1) (Directly access the front)
4. Empty: O(1) (Check if the queue is empty)

---

# Next Greater Element 1
# Problem Number : #496

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to determine the next greater element for each number in nums1 based on its position in nums2. 
The next greater element is the first number appearing after the given number in nums2 that is greater than it.
If no such number exists, we return -1.



# Approach
<!-- Describe your approach to solving the problem. -->
1. Find the Index in nums2
        - For each element in nums1, we locate its position in nums2 using std::find().
2. Search for the Next Greater Element
        - Starting from the found index, we iterate through the rest of nums2 to find the next greater element.
        - If we find an element larger than the current one, we store it and break out of the loop.
        - If no greater element is found, we return -1 for that number.
3. Store Results
        - Each result is appended to an output list, which is returned at the end.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(N×M), where N is the size of nums1 and M is the size of nums2.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1) (excluding the output list), as we do not use extra data structures.

---

# Find Middle Element in the Stack
# Problem Number : #1991

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem requires us to find an index where the sum of elements to the left equals the sum of elements to the right.
A naive approach would involve calculating the sum for each index separately, leading to an inefficient solution. Instead, we can optimize this by maintaining a running left sum (ls) and a right sum (rs), reducing the need for redundant computations.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Compute the total sum of the array (rs).
2. Initialize ls (left sum) as 0.
3. Iterate through the array:
        - Subtract the current element from rs (since it's no longer part of the right sum).
        - Check if ls == rs. If true, return the current index.
        - Add the current element to ls (updating the left sum for the next iteration).
4. If no such index is found, return -1.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the size of the array, as we traverse it twice (once for computing the total sum and once for finding the middle index).

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), since we use only a few integer variables.

---
# ALL Solutions of Stack are completed
