# LeetCode 54: Spiral Matrix

## Problem Statement
Given an `m x n` matrix, return all elements of the matrix in spiral order.

**Constraints:**
- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 10`
- `-100 <= matrix[i][j] <= 100`

---

## Solution Code

### Local Machine Code (Java)
```java
import java.util.ArrayList;
import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a matrix: ");
        int row, column;
        Scanner sc1 = new Scanner(System.in);
        row = sc1.nextInt();
        column = sc1.nextInt();
        int[][] m = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                m[i][j] = sc1.nextInt();
            }
        }
        System.out.println("The current matrix is: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int sr = 0, ec = column - 1, er = row - 1, sc = 0;
        int count = row * column;
        while(count > 0) {
            // Traverse from left to right
            for(int i = sc; i <= ec; i++) {
                res.add(m[sr][i]);
                count--;
            }
            sr++;
            if(count == 0) break;
            // Traverse from top to bottom
            for(int i = sr; i <= er; i++) {
                res.add(m[i][ec]);
                count--;
            }
            ec--;
            if(count == 0) break;
            // Traverse from right to left
            for(int i = ec; i >= sc; i--) {
                res.add(m[er][i]);
                count--;
            }
            er--;
            if(count == 0) break;
            // Traverse from bottom to top
            for(int i = er; i >= sr; i--) {
                res.add(m[i][sc]);
                count--;
            }
            sc++;
            if(count == 0) break;
        }
        System.out.print("The Spiral Matrix Representation of elements is: ");
        System.out.print(res);
    }
}
```

### LeetCode Submission Code (Java)
```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0, ec = n - 1, er = m - 1, sc = 0;
        int count = m * n;
        List<Integer> res = new ArrayList<>();
        while(count > 0) {
            // Traverse from left to right
            for(int i = sc; i <= ec; i++) {
                res.add(matrix[sr][i]);
                count--;
            }
            sr++;
            if(count == 0) break;
            // Traverse from top to bottom
            for(int i = sr; i <= er; i++) {
                res.add(matrix[i][ec]);
                count--;
            }
            ec--;
            if(count == 0) break;
            // Traverse from right to left
            for(int i = ec; i >= sc; i--) {
                res.add(matrix[er][i]);
                count--;
            }
            er--;
            if(count == 0) break;
            // Traverse from bottom to top
            for(int i = er; i >= sr; i--) {
                res.add(matrix[i][sc]);
                count--;
            }
            sc++;
            if(count == 0) break;
        }
        return res;
    }
}
```

---

## Approach
1. **Initialize Boundaries:**
   - `sr` (starting row), `sc` (starting column), `er` (ending row), and `ec` (ending column) define the current spiral layer.
2. **Traverse Layers:**
   - **Left to Right:** Traverse the top row from `sc` to `ec`, then increment `sr`.
   - **Top to Bottom:** Traverse the right column from `sr` to `er`, then decrement `ec`.
   - **Right to Left:** Traverse the bottom row from `ec` to `sc`, then decrement `er`.
   - **Bottom to Top:** Traverse the left column from `er` to `sr`, then increment `sc`.
3. **Termination:**
   - Repeat until all elements (`count = m * n`) are traversed.

---

## Dry Run Example

### Input Matrix:
```
1  2  3  4
5  6  7  8
9 10 11 12
```

### Spiral Order:
1. **Left to Right (Row 0):** `[1, 2, 3, 4]`
2. **Top to Bottom (Column 3):** `[5, 6, 7, 8]` → `[8, 6, 7]` (since 5 is already traversed)
3. **Right to Left (Row 2):** `[9, 10, 11, 12]` → `[12, 11, 10, 9]`
4. **Bottom to Top (Column 0):** `[5, 9]` → `[9, 5]` (since 5 is already traversed)

**Final Spiral Order:**
`[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]`

---

## Time and Space Complexity
- **Time Complexity:** O(m * n)
  - Every element is visited exactly once.
- **Space Complexity:** O(1) (excluding the output list)
  - Only a few variables are used for boundary tracking.

---
