# README FOR ALL SOLUTION AND APPROACHES 
---

# TWO SUM 
# Problem Number : #1
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
This code solves the two-sum problem by checking all pairs of numbers in the list.
1. The outer loop picks the first number (nums[j]), and the inner loop checks all numbers after it (nums[k]).
2. If the sum of the two numbers equals the target, their indices (j and k) are added to the result list.
3. The process ensures every pair is checked, and the result is returned.
It's a brute-force approach to finding the solution.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Loop through each number in the array (j).
2. For each number, check all subsequent numbers (k).
3. If the sum of the two numbers equals the target, store their indices (j and k) in the result.
4. Return the result after checking all pairs.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- The time complexity of solution is O(n²).

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- The space complexity of solution is O(1).

---
# Maximum Subarray 
# Problem Number : #53

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to find the maximum sum of any contiguous subarray. We can track the current sum and reset it when it becomes negative, as continuing with a negative sum wouldn't help in maximizing the overall sum.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize max to the smallest possible value and sum to 0.
2. Iterate through the array:
    - Add each element to sum.
    - If sum exceeds max, update max.
    - If sum becomes negative, reset it to 0, as it would decrease any future subarray sum.
3. Return max, which holds the largest sum of any contiguous subarray.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), since we loop through the array once.


*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as we only use a few variables to track the sum and max.

---

# Pivot Index  
# Problem Number : #724

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to find an index where the sum of the elements to the left equals the sum of the elements to the right. We can do this by first calculating the total sum and then adjusting it as we iterate through the array.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Calculate the total sum of the array (rs).
2. Initialize a variable ls to 0, representing the sum of elements to the left of the current index.
3. Iterate through the array:
    - Subtract the current element from rs (which now represents the sum of elements to the right of the current index).
    - If ls (left sum) equals rs (right sum), return the current index.
    - Add the current element to ls (update the left sum).
4. If no pivot index is found, return -1.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), as we loop through the array twice.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as we only use a few variables to store the sums.

---

# Plus One  
# Problem Number : #66

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to add one to the number represented by the digits array. Starting from the least significant digit, we can increment it and handle any carry-over that might result.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Start from the last digit of the array (n-1).
2. Increment the last digit.
3. If the digit becomes 10, set it to 0 and carry over the 1 to the next digit.
4. If the carry-over reaches the first digit, add a new digit at the beginning and set it to 1.
5. Return the updated digits array.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the digits array, as we may need to traverse the entire array in the worst case.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as we modify the array in place without using additional space, except for the potential new digit at the beginning.

---
# ALL Solutions of Array are completed
