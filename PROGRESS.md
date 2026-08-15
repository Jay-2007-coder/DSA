# DSA Progress Log

Track solved problems, approaches, complexities, and weak spots.

---

## JAVA BASICS

| Date | Problem Name | Difficulty | Pattern Used | My Approach (1 line) | Time/Space | Status | Revisit? |
|---|---|---|---|---|---|---|---|
| 2026-08-13 | Character Triangle Pattern | Easy | Nested Loops | Outer loop for rows 1..5, inner loop prints character `ch` and increments it | $O(N^2)$ / $O(1)$ | Solved | No |
| 2026-08-13 | Inverted Number Triangle | Easy | Nested Loops | Inner loop limit `n - line + 1` printing column index `star` | $O(N^2)$ / $O(1)$ | Solved | No |
| 2026-08-11 | Prime Number Check | Easy | Trial Division | Iterated from 2 to `n-1` checking `n % i == 0` with early break | $O(N)$ / $O(1)$ | Solved | Yes |
| 2026-08-11 | Reverse a Number | Easy | Digit Extraction | Extracted digits with `% 10` and built reverse using `rev * 10 + digit` | $O(\log_{10} N)$ / $O(1)$ | Solved | No |
| 2026-08-10 | Leap Year Checker | Easy | Conditional Logic | Checked divisibility by 400, 100, and 4 using nested if-else | $O(1)$ / $O(1)$ | Solved | No |

### ⚠️ Weak spots
- Remember to optimize prime checking from $O(N)$ to $O(\sqrt{N})$ using `i <= Math.sqrt(n)`.
- Watch out for String concatenation when mixing numbers and strings in `System.out.println()`.
