# README FOR ALL STRING SOLUTION AND APPROACHES 
---

# Valid Anagram
# Problem Number : #242
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To check if two strings are anagrams, we need to ensure they have the same characters with the same frequencies.
We can do this by counting the occurrences of each character in both strings and comparing the counts.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize a vector sk of size 26 to track the frequency of each character.
2. For each character in the first string (s), increment its corresponding position in the vector.
3. For each character in the second string (t), decrement its corresponding position in the vector.
4. If any position in sk is non-zero, return false, meaning the strings are not anagrams.
5. If all positions are zero, return true, meaning the strings are anagrams.


# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the strings, as we loop through both strings once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as we only use a fixed-size vector of size 26.

---
# Reverse String
# Problem Number : #344

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To reverse the string, we can use the built-in reverse function to directly reverse the elements of the vector.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Use the reverse function from the C++ Standard Library to reverse the vector of characters in place.
2. The function modifies the original vector s directly.

# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the vector, as the reverse function loops through the elements once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as the reversal is done in place with no additional space used.

---

# Find the Index of the First Occurrence in a String  
# Problem Number : #28

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To find the first occurrence of the needle in the haystack, we can use the built-in find function, which efficiently returns the position of the first occurrence.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Use the find function to search for the needle in the haystack.
2. If needle is found, find returns the index of its first occurrence.
3. If not found, find returns -1.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the haystack, as find potentially needs to check each character once.

*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as no extra space is used except for the input strings.

---

# First Unique Character in a String
# Problem Number : #387

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To find the first unique character in a string, we can count the frequency of each character and then check the string again to find the first character that appears only once.


# Approach
<!-- Describe your approach to solving the problem. -->
1. Use a vector sk of size 26 to store the frequency of each character.
2. Traverse the string once to populate the frequency counts in sk.
3. Traverse the string again and return the index of the first character with a frequency of 1.
4. If no unique character is found, return -1.
   
# Complexity
*Time complexity:*
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
- O(n), where n is the length of the string, as we loop through the string twice.
  
*Space complexity:*
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
- O(1), as we use a fixed-size vector of 26 elements.

---
# ALL Solutions of String are completed
