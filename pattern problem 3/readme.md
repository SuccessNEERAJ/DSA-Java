# Diamond Half Pattern in Java

## 📌 Problem Statement
Write a Java program that takes an **odd number greater than 3** as input and prints a star pattern where:
- The number of stars increases until the middle row.
- Then decreases symmetrically.

For example, if `n = 5`, the output should be:
<pre>
*
**
***
**
*
</pre>

Also for example, if `n=5`, and we have to print the numbers like:
<pre>
1
12
123
12
1
</pre>

Then we only need to change `System.out.print("*");` to `System.out.print(cst);`