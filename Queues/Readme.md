# README FOR ALL QUEUE SOLUTION AND APPROACHES 
---

# Design Circular Queue
# Problem Number : #622
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
A circular queue is a queue with a fixed size where elements wrap around when they reach the end of the array. 
This allows efficient use of space and prevents shifting elements when enqueueing or dequeueing.

# Approach
<!-- Describe your approach to solving the problem. -->
We use a vector queue of size n to store the queue elements and maintain two pointers:
        - front: Points to the front of the queue.
        - rear: Points to the rear of the queue.
# Operations:
1. Enqueue (enQueue(value))
        - If the queue is full ((rear + 1) % n == front), return false.
        - If the queue is empty (rear == -1), initialize front = rear = 0.
        - Otherwise, update rear = (rear + 1) % n.
        - Store the value at queue[rear].
2. Dequeue (deQueue())
        - If the queue is empty (front == -1), return false.
        - If there's only one element (front == rear), reset front and rear to -1.
        - Otherwise, update front = (front + 1) % n.
3. Front (Front())
        - If empty, return -1.
        - Otherwise, return queue[front].
4. Rear (Rear())
        - If empty, return -1.
        - Otherwise, return queue[rear].
5. Check if Empty (isEmpty())
        - Return true if front == -1.
6. Check if Full (isFull())
        - Return true if (rear + 1) % n == front.

# Complexity
1. Enqueue (enQueue()): O(1), since it directly places an element in queue.
2. Dequeue (deQueue()): O(1), since it updates the front pointer.
3. Front (Front()): O(1), as it retrieves an element in constant time.
4. Rear (Rear()): O(1), similar to Front().
5. Is Empty (isEmpty()): O(1), a simple comparison.
6. Is Full (isFull()): O(1), another simple comparison.
---
# Implement Queue using Stack
# Problem Number : #232

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to implement a queue using two stacks (or in this case, two queues). 
A queue follows the FIFO (First In, First Out) principle, while a stack follows LIFO (Last In, First Out).
We need to ensure that elements are dequeued in the correct order.

# Approach
<!-- Describe your approach to solving the problem. -->
1. We maintain two queues:
        - inp: Used for enqueue operations (push).
        - out: Used for dequeue (pop) and peek operations.
2. Push Operation (push(x))
        - Simply push x into the inp queue.
3. Pop Operation (pop())
        - If out is empty, transfer all elements from inp to out, reversing their order.
        - Remove the front element from out.
4. Peek Operation (peek())
        - If out is empty, transfer all elements from inp to out.
        - Return the front element of out.
5. Empty Check (empty())
        - The queue is empty if both inp and out are empty.


# Complexity:
1. Push (push(x)): O(1), since it simply enqueues to inp.
2. Pop (pop()): O(1) amortized, because each element is moved from inp to out at most once.
3. Peek (peek()): O(1) amortized, following the same logic as pop.
4. Empty (empty()): O(1), as it just checks if both queues are empty.

---

# Sliding Window Maximum
# Problem Number : #239

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem requires us to find the maximum element in every sliding window of size k as we traverse the array. 
A brute force approach would check all elements in each window, but this would be inefficient. 
Instead, we use a monotonic deque to keep track of useful elements efficiently.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Use a deque (q) to store indices of useful elements in decreasing order of their values. This ensures that the maximum element of the current window is always at the front of the deque.
2. Initialize the deque for the first k elements:
        - Remove elements from the back of q if they are smaller than the current element nums[i].
        - Push the current index at the back.
3. Store the first maximum element, which is at nums[q.front()].
4. Slide the window across the array:
        - Remove elements out of the window: If q.front() is out of the current window (i - q.front() >= k), remove it.
        - Maintain the decreasing order: Remove elements from the back if they are smaller than nums[i].
        - Insert the new element: Push the current index i at the back of the deque.
        - Store the new maximum: nums[q.front()] is the maximum for this window.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), since each element is pushed and popped from the deque at most once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(k), as the deque stores at most k elements.

---

# Find The Winner of Circular Game
# Problem Number : #1823

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem is a variation of the Josephus Problem, where n friends stand in a circle, and every k-th friend is eliminated until only one remains. 
The solution relies on recursion to determine the position of the winner.
# Approach
<!-- Describe your approach to solving the problem. -->
1. Define a recursive function jos(n, k) to solve the Josephus problem for n people with step k.
2. Base case: If only one person remains (n == 1), return 0 (zero-based index).
3. Recursive case: The survivor's position in a smaller problem (n-1 people) is computed recursively and then adjusted using modular arithmetic:
                jos (n−1 ,k) + k mod n
This shifts the index after eliminating a person.
4. Convert the zero-based index returned by jos(n, k) to a one-based index in findTheWinner(n, k) by adding 1.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), as the recursion runs for n levels
*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(n) due to recursive function calls on the stack.

---
# ALL Solutions of Queue are completed
