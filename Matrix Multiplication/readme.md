# Matrix Multiplication Program (Java)

## 📌 Problem Statement
Write a Java program to perform **matrix multiplication** of two user-defined matrices.  
- The user enters the dimensions and elements of two matrices.  
- The program checks if multiplication is possible (`columns of first matrix == rows of second matrix`).  
- If valid, the program multiplies them and displays the resulting matrix.  
- Otherwise, it shows an error message.

---

## 🧾 Example

**Input**
```text
Enter the rows and columns of first matrix:
2 3
Enter the rows and columns of second matrix:
3 2
Fill the elements of first matrix:
1 2 3
4 5 6
Fill the elements of second matrix:
7 8
9 10
11 12
```
**Output**
```text
The first matrix is:
1 2 3
4 5 6

The second matrix is:
7 8
9 10
11 12

The matrix after multiplication is:
58 64
139 154
```
## 🚀 How It Works
1. Take input for the dimensions of both matrices.
2. Fill the matrices with user-provided values.
3. Print both matrices.
4. Validate if multiplication is possible:  
   - ✅ Condition: `columns of first matrix == rows of second matrix`
5. If valid, multiply the matrices using the formula:

\[
C[i][j] = \sum_{k=0}^{n-1} A[i][k] \times B[k][j]
\]

6. Print the resulting matrix.

---

## 📂 Code Structure
- **Input Handling** → `Scanner` is used to read dimensions and elements.  
- **Matrix Storage** → 2D integer arrays (`int[][]`) store matrix values.  
- **Validation** → Multiplication allowed only if `column1 == row2`.  
- **Computation** → Nested loops perform multiplication.  
- **Output** → Print result in matrix form.  

---
