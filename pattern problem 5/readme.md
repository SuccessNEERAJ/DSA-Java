# Hollow Hourglass Star Pattern in Java

## 📌 Problem Statement
Write a Java program that takes an **odd number greater than 3** as input and prints a **hollow hourglass-like star pattern**.

---

## 🖥️ Program Description
- The user enters an **odd number** `n` (e.g., 5, 7, 9...).
- The pattern is constructed in two parts:
  1. **Top row** — prints `2 * n - 1` stars in a single line.
  2. **Remaining rows** — 
     - Print decreasing stars on both left and right sides.
     - Increase spaces in the middle to form a hollow section.

---
For example, if `n = 5`, the output should be:
<p>
*********
**** ****
***   ***
**     **
*       *
</p>