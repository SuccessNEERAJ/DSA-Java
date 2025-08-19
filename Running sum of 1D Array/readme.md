# Running Sum of 1D Array (LeetCode 1480)

## 📌 Problem Statement
Given an array `nums`. We define a **running sum** of an array as:

Return the running sum of `nums`.

---

## 🧾 Examples

**Example 1:**
```text
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

**Example 2:**
```text
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].


---

## ✅ Constraints
- `1 <= nums.length <= 1000`
- `-10^6 <= nums[i] <= 10^6`

---

## 💻 My Local Java Solution (Using ArrayList)
This version reads input dynamically using `Scanner` and builds the running sum with an `ArrayList`.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class runningsum {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter the size of array");
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            arr1.add(num);
        }
        System.out.println(sum(arr1));
        sc.close();
    }

    public static ArrayList<Integer> sum(ArrayList<Integer> arr1) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,arr1.get(0)); // first element same as original

        for (int i = 1; i < arr1.size(); i++) {
            result.add(result.get(i - 1) + arr1.get(i));
        }
        return result;
    }
}

##  Leetcode Solution:
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}

