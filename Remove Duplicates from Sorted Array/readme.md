# LeetCode 26: Remove Duplicates from Sorted Array

## Problem Statement
Given a **sorted** array `nums`, remove the duplicates **in-place** such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

**Constraints:**
- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in non-decreasing order.

---

## Solution Code

### Local Machine Code (Java)
```java
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of array with some duplicate values but in sorted increasing order: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int insert = 1;
        for(int i = 1; i < size; i++) {
            if(arr[i-1] != arr[i]) {
                arr[insert] = arr[i];
                insert++;
            }
        }
        System.out.println("The number of unique elements in array is: " + insert);
        System.out.print("Unique elements are: ");
        for (int i = 0; i < insert; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

### LeetCode Submission Code (Java)
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int insert = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[insert] = nums[i];
                insert++;
            }
        }
        return insert;
    }
}
```

---

## Approach
1. **Two-pointer Technique:**
   - Use a pointer `insert` to track the position where the next unique element should be placed.
   - Iterate through the array with another pointer `i`. If `nums[i]` is different from `nums[i-1]`, place it at `nums[insert]` and increment `insert`.
2. **In-place Modification:**
   - Overwrite duplicates as you traverse the array, ensuring the first `insert` elements are unique and sorted.
3. **Return the Length:**
   - The value of `insert` at the end of the loop is the count of unique elements.

---

## Dry Run Example

### Input Array:
`[0, 0, 1, 1, 1, 2, 2, 3, 3, 4]`

### Step-by-Step Execution:
1. **Initialization:** `insert = 1`
2. **Iteration:**
   - `i = 1`: `nums[0] == nums[1]` → Skip
   - `i = 2`: `nums[1] != nums[2]` → `nums[1] = 1`, `insert = 2`
   - `i = 3`: `nums[2] == nums[3]` → Skip
   - `i = 4`: `nums[3] == nums[4]` → Skip
   - `i = 5`: `nums[4] != nums[5]` → `nums[2] = 2`, `insert = 3`
   - `i = 6`: `nums[5] == nums[6]` → Skip
   - `i = 7`: `nums[6] != nums[7]` → `nums[3] = 3`, `insert = 4`
   - `i = 8`: `nums[7] == nums[8]` → Skip
   - `i = 9`: `nums[8] != nums[9]` → `nums[4] = 4`, `insert = 5`

### Modified Array:
`[0, 1, 2, 3, 4, 2, 2, 3, 3, 4]`

### Output:
- **Number of Unique Elements:** `5`
- **Unique Elements:** `[0, 1, 2, 3, 4]`

---

## Time and Space Complexity
- **Time Complexity:** O(n)
  - Single pass through the array.
- **Space Complexity:** O(1)
  - Only a constant amount of extra space is used.

---
