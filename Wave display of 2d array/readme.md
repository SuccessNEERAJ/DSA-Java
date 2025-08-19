# Wave Display of 2D Array

This Java program takes a **2D array** (matrix) as input from the user and displays its elements in a **wave-like traversal** order.

---

## Problem Statement

Given a 2D array of size `row x column`, print the elements of the array in a wave pattern:
- For even-indexed rows (`0, 2, 4...`): print elements from **left to right**.
- For odd-indexed rows (`1, 3, 5...`): print elements from **right to left**.

This creates a **wave display** of the matrix.

---

## Example

### Input:
```text
Enter the number of rows you want in a 2d array: 
3
Enter the number of columns you want in a 2d array: 
4
Enter the elements in 2d array: 
1  2  3  4
5  6  7  8
9 10 11 12

The 2d array in wave form is like this:
1 2 3 4 8 7 6 5 9 10 11 12
```