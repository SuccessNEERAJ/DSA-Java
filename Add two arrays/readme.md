# Add Two Arrays as Numbers in Java

## 📌 Problem Statement
Write a Java program that takes two arrays of digits as input, where each array represents a number, and computes their sum.  

For example:
- Input arrays: `[9, 9, 9]` and `[1, 0, 0]`
- Represent numbers: `999` and `100`
- Output: `[1, 0, 9, 9]` (which is `1099`)

---

## 🖥️ Program Description
- The user enters the **size and elements** of two arrays.
- Each array represents a number (digits stored in order).
- The program adds them digit by digit from the end (like manual addition) using the **carry method**:
  - Start from the last element of both arrays.
  - Add corresponding digits + carry.
  - Store the remainder (`% 10`) in the result.
  - Update the carry (`/ 10`).
- If there’s a carry left after the loop, add it to the front of the result.

---