# Matrix Problems and Solutions

 

## 1. Diagonal Traverse

### Approach
- Use a HashMap to group elements of the matrix by their diagonal index `(i + j)`.
- Traverse through the matrix and store each element in its respective diagonal group.
- Reverse the elements of even-indexed diagonals to achieve the required diagonal order.
- Combine all diagonal elements into a single list and convert it to an array for the final result.

---

## 2. Matrix Diagonal Sum

### Approach
- Traverse through each element of the matrix.
- Check if the element lies on the primary diagonal `(i == j)` or the secondary diagonal `(i + j == n - 1)`.
- Add these elements to a running sum.
- Return the final sum.

---

## 3. Reshape the Matrix

### Approach
- Calculate the total number of elements in the given matrix (`m * n`).
- Check if the reshaping is possible by comparing `m * n` with `r * c`.
- If not possible, return the original matrix.
- If possible, map the elements from the original matrix to the reshaped matrix by iterating through rows and columns.

---

## 4. Transpose Matrix

### Approach
- Initialize a new matrix with dimensions swapped (`n x m` for `m x n`).
- Iterate through the original matrix and assign `matrix[j][i]` to `transpose[i][j]`.
- Return the transposed matrix.
