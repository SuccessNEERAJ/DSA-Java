# Set Matrix Zeroes — Java Implementation (LeetCode 73)

## 📌 Problem
Given a matrix `m` of size `row × column`, if any element is `0`, set its **entire row** and **entire column** to `0`.  
This must be done **in-place** (without using extra space for another matrix).

---

## 🚀 How My Code Works

### Step 1: Input Handling
```java
int row, column;
Scanner sc = new Scanner(System.in);
row = sc.nextInt();
column = sc.nextInt();
int[][] m = new int[row][column];
```
- Read the number of rows (row) and columns (column).

- Create a 2D array m to store the matrix.

- Fill the matrix with user input.

### Step 2: Print Current Matrix
We simply loop through all `m[i][j]` and display the original matrix before modification.

### Step 3: Setup Boolean Flags
```java
boolean isRow = false;
boolean isColumn = false;
```
- `isRow` → to check if the first row should be zeroed.

- `isColumn` → to check if the first column should be zeroed.

### Step 4: First Pass — Mark Rows and Columns
```java
for (int i = 0; i < row; i++) {
    for (int j = 0; j < column; j++) {
        if (m[i][j] == 0) {
            m[i][0] = 0;   // Mark row i
            m[0][j] = 0;   // Mark column j
            if (i == 0) isRow = true;     // First row needs zeroing
            if (j == 0) isColumn = true;  // First column needs zeroing
        }
    }
}
```
- If `m[i][j] == 0`, we mark the first cell of its row `(m[i][0])` and first cell of its column `(m[0][j])` as 0.

- This way, the first row and column are used as flags to remember which rows and columns must later be zeroed.

- Additionally, if the zero is in the first row `(i == 0)` or first column `(j == 0)`, we set isRow or isColumn accordingly.

### Step 5: Second Pass — Apply Zeroes Using Markers
```java
for (int i = 1; i < row; i++) {
    for (int j = 1; j < column; j++) {
        if (m[i][0] == 0 || m[0][j] == 0) {
            m[i][j] = 0;
        }
    }
}
```
- For each cell (excluding the first row and column), check:

   -If its row was marked `(m[i][0] == 0)`

   -Or if its column was marked `(m[0][j] == 0)`

- If yes → set `m[i][j] = 0.`

### Step 6: Handle First Row and First Column Separately
```java
if (isRow) {
    for (int i = 0; i < row; i++) {
        m[0][i] = 0;
    }
}

if (isColumn) {
    for (int j = 0; j < column; j++) {
        m[j][0] = 0;
    }
}
```
- If `isRow == true`, zero out the entire first row.

- If `isColumn == true`, zero out the entire first column.

### Step 7: Print Final Matrix
- After modification, we print the matrix again to show the result.

## 🧠 Time & Space Complexity
- Time Complexity: `O(row × column)` → we traverse the entire matrix twice.

- Space Complexity: `O(1)` → we only use two boolean flags `(isRow, isColumn).`

## 🔍 Dry Run Example
Input
```text
row = 3, column = 3
m =
1 1 1
1 0 1
1 1 1
```
- Step 1 — First Pass (marking):

   -Found m[1][1] == 0

      -Mark row → m[1][0] = 0

      -Mark column → m[0][1] = 0

Matrix after marking:
```text
1 0 1
0 0 1
1 1 1
```
- Step 2 — Apply markers:

   -(1,1), (1,2), (2,1) become 0.

Matrix becomes:
```text
1 0 1
0 0 0
1 0 1
```
Final Output:
```text
1 0 1
0 0 0
1 0 1
```
## ✅ Summary

- Used first row and column of matrix m as storage for zero markers.

- Tracked first row/column separately with isRow and isColumn.

- Achieved O(n·m) time and O(1) extra space.

- Clean and efficient solution to LeetCode 73.

## 💻 My Local Java Solution 
```java
import java.util.Scanner;
public class setmatrixzero {
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a matrix: ");
        int row, column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] m = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("The current matrix is: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
        boolean isRow = false;
        boolean isColumn = false;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                if(m[i][j] == 0){
                    m[i][0] = 0;
                    m[0][j] = 0;
                    if(i == 0){
                        isRow = true;
                    }
                    if(j == 0){
                        isColumn = true;
                    }
                }
            }
        }
        for(int i = 1; i<row; i++){
            for(int j = 1; j<column; j++){
                if(m[i][0] == 0 || m[0][j] == 0){
                    m[i][j] = 0;
                }
            }
        }
        if(isRow){
            for(int i = 0; i<row; i++){
                m[0][i] = 0;
            }
        }
        if(isColumn){
            for(int j = 0; j<column; j++){
                m[j][0] = 0;
            }
        }
        System.out.println("The matrix after modification is: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
```

##  Leetcode Solution:
```java
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false;
        boolean isColumn = false;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j]= 0;
                    if(i==0){
                        isRow =true;
                    }
                    if(j==0){
                        isColumn = true;
                    }
                }
            }
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][0] == 0 || matrix[0][j]== 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(isRow){
            for(int i =0; i<n; i++){
                matrix[0][i] = 0;
            }
        }
        if(isColumn){
            for(int j =0; j<m; j++){
                matrix[j][0] = 0;
            }
        }
    }
}
```