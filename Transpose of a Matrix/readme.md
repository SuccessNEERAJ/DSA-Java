# 🟦 Transpose Matrix (LeetCode 867)

## 📌 Problem Statement
Given a 2D integer array `matrix`, return **the transpose of matrix**.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

---

## 🧾 Examples

**Example 1:**
```text
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
```
**Example 2:**
```text
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```
## ✅ Constraints
- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 1000`
- `1 <= m * n <= 10^5`
- `-10^9 <= matrix[i][j] <= 10^9`

## 💻 My Local Java Solution (Using ArrayList)
This version reads input dynamically using `Scanner` and builds the running sum with an `ArrayList`.

```java
import java.util.Scanner;
public class matrixtranspose{
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a 2D matrix");
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<arr1.length; i++){
            for(int j =0; j<arr1[0].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before the transpose: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after transpose: ");
        int[][] ans = new int[column][row];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                ans[j][i] = arr1[i][j];
            }
        }
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
```
##  Leetcode Solution:
```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] ans = new int[column][row];
        for(int i =0; i<row; i++){
            for(int j = 0; j<column; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
```
## 🔑 Explanation
- Create a new matrix ans of size column x row.

- For every element at (i, j) in the original matrix, assign it to (j, i) in the transposed matrix.

- Return or print the transposed matrix.