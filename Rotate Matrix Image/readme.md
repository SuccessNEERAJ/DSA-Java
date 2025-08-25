# LeetCode 48: Rotate Image

## Problem Statement
You are given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise) **in-place**.

**Constraints:**
- You must rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT return anything from the function.

---

## Solution Code
### Local Machine Code (Java)
```java
import java.util.Scanner;
public class rotatematrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and column of a square matrix");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements in the matrix");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before the clockwise rotation: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after 90 degrees clockwise rotation: ");
        // Reverse each column
        for(int col=0; col<n; col++){
            int i = 0;
            int j = n-1;
            while(i<=j){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
        // Transpose the matrix
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Print the rotated matrix
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
```

### LeetCode Submission Code (Java)
```java
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Reverse each column
        for(int col = 0; col < n; col++){
            int i = 0;
            int j = n-1;
            while(i<=j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }
        // Transpose the matrix
        for(int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
```

---

## Approach
1. **Reverse each column**: This step flips the matrix vertically.
2. **Transpose the matrix**: Swap elements across the main diagonal (i.e., `matrix[i][j]` becomes `matrix[j][i]`).

**Why this works:**
- Reversing each column and then transposing the matrix is equivalent to rotating the matrix 90 degrees clockwise.

---

## Dry Run Example

### Input Matrix:
```
1 2 3
4 5 6
7 8 9
```

### Step 1: Reverse each column
- Column 0: `[1, 4, 7]` → `[7, 4, 1]`
- Column 1: `[2, 5, 8]` → `[8, 5, 2]`
- Column 2: `[3, 6, 9]` → `[9, 6, 3]`

**Matrix after reversing columns:**
```
7 8 9
4 5 6
1 2 3
```

### Step 2: Transpose the matrix
- Swap `matrix[i][j]` with `matrix[j][i]` for all `i < j`.

**Matrix after transposing:**
```
7 4 1
8 5 2
9 6 3
```

### Final Rotated Matrix:
```
7 4 1
8 5 2
9 6 3
```

---

## Time and Space Complexity
- **Time Complexity:** O(n²)
  - We traverse the matrix twice: once for reversing columns and once for transposing.
- **Space Complexity:** O(1)
  - The rotation is done in-place, using only a constant amount of extra space.

---
