# Butterfly Star Pattern in Java

## 📌 Problem Statement
Write a Java program that takes an **odd number greater than 3** as input and prints a **butterfly-shaped star pattern**.

---

## 🖥️ Program Description
- The pattern has two halves:
  - **Top half** → Stars increase, spaces shrink.
  - **Bottom half** → Stars decrease, spaces expand.
- To avoid double-counting the middle line, a variable `sstars` is used to adjust stars in the middle row.

---

For example, if `n = 7`, the output should be:
<pre>
*     *
**   **
*** ***
*******
*** ***
**   **
*     *
</pre>