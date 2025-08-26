# LeetCode 167: Two Sum II - Input Array Is Sorted

## Problem Statement
Given a **1-indexed** array of integers `numbers` that is already **sorted in non-decreasing order**, find two numbers such that they add up to a specific `target`. Return the indices of the two numbers as an array `[index1, index2]` (1-indexed).

**Constraints:**
- `2 <= numbers.length <= 3 * 10^4`
- `-1000 <= numbers[i] <= 1000`
- `numbers` is sorted in non-decreasing order.
- There is exactly one solution.

---

## Solution Code

### Local Machine Code (Java)
```java
import java.util.Scanner;

public class Twosum2 {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the target value which will add up to sum: ");
        int target = sc.nextInt();
        System.out.println("Enter the elements in the array in ascending sorted order including which sums up to the target value: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[2];
        int i = 0, j = size - 1;
        while (i < j) {
            if(arr[i] + arr[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            else if(arr[i] + arr[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("The elements of index which add up to the target value is: ");
        for(int n = 0; n < 2; n++) {
            System.out.print(res[n] + " ");
        }
    }
}
```

### LeetCode Submission Code (Optimized Two-pointer Approach)
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int j = numbers.length - 1, i = 0;
        while(i < j) {
            if(numbers[i] + numbers[j] == target) {
                arr[0] = i + 1;
                arr[1] = j + 1;
                break;
            }
            else if(numbers[i] + numbers[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return arr;
    }
}
```

### Brute Force Approach (LeetCode)
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }
        return arr;
    }
}
```

---

## Approach

### Optimized Two-pointer Technique
1. **Two Pointers:**
   - Initialize `i` at the start (`0`) and `j` at the end (`numbers.length - 1`).
   - If `numbers[i] + numbers[j] == target`, return `[i+1, j+1]`.
   - If the sum is greater than `target`, decrement `j`.
   - If the sum is less than `target`, increment `i`.
2. **Efficiency:**
   - Leverages the sorted property to find the solution in **O(n)** time.

### Brute Force Approach
1. **Nested Loop:**
   - Check all possible pairs `(i, j)` where `i < j`.
   - If `numbers[i] + numbers[j] == target`, return `[i+1, j+1]`.
2. **Efficiency:**
   - Time complexity is **O(n²)** due to nested loops.

---

## Dry Run Example

### Input Array:
`[2, 7, 11, 15]`
**Target:** `9`

### Optimized Two-pointer Execution:
1. **Initialization:** `i = 0`, `j = 3`
2. **Iteration:**
   - `2 + 15 = 17 > 9` → `j--` (`j = 2`)
   - `2 + 11 = 13 > 9` → `j--` (`j = 1`)
   - `2 + 7 = 9` → **Match found!** Return `[1, 2]`

### Brute Force Execution:
1. **Nested Loop:**
   - `i = 0`: Check `j = 1` to `3`
     - `2 + 7 = 9` → **Match found!** Return `[1, 2]`

---

## Time and Space Complexity

| Approach            | Time Complexity | Space Complexity |
|---------------------|-----------------|------------------|
| Two-pointer         | O(n)            | O(1)             |
| Brute Force         | O(n²)           | O(1)             |

---
