# DSA Concept Notes

Quick reference guide for Data Structures & Algorithms patterns, templates, and complexities.

---

## JAVA BASICS

### Core Language Fundamentals & Control Flow
- **Core idea**: Fundamental primitives, type conversion, conditional checks (`if-else`, `switch`, ternary `?:`), and IO using `Scanner`.
- **When to use it**: Basic logic building, branching conditions, and input parsing.
- **Template / pseudocode**:
```java
// Fast ternary check
String status = (number % 2 == 0) ? "Even" : "Odd";

// Scanner input
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```
- **Time & Space complexity**: $O(1)$ time, $O(1)$ space.
- **Common mistakes**:
  - Forgetting that integer division `5 / 2` truncates to `2` (use `(double) 5 / 2` for `2.5`).
  - Combining `String + int + int` without parentheses (e.g., `"val" + 10 + 20` results in `"val1020"` instead of `"val30"`).
  - Missing `break` statements in `switch-case` causing unintended fall-through.
- **Related patterns**: Loops, Basic Math.

---

### Digit Extraction & Number Reversal
- **Core idea**: Extract digits from right to left using modulo `% 10` and integer division `/ 10`. Construct reversed numbers using `rev = rev * 10 + digit`.
- **When to use it**: Palindrome number checks, digit sums, reversing numbers, Armstrong numbers.
- **Template / pseudocode**:
```java
int no = 10899;
int rev = 0;
while (no > 0) {
    int lastDigit = no % 10;
    rev = rev * 10 + lastDigit;
    no = no / 10;
}
```
- **Time & Space complexity**:
  - Time: $O(\log_{10} N)$ where $N$ is the input number (proportional to number of digits).
  - Space: $O(1)$ auxiliary space.
- **Common mistakes**:
  - Modifying the original variable when it's needed later (keep a copy `int original = no;`).
  - Overflowing integer limits when reversing large numbers.
- **Related patterns**: Math, Bit Manipulation.

---

### Primality Testing ($O(\sqrt{N})$ Check)
- **Core idea**: A number $N$ is prime if it has no divisors between $2$ and $\sqrt{N}$. If $N = a \times b$, at least one factor must be $\le \sqrt{N}$.
- **When to use it**: Single-number primality check, prime range generation.
- **Template / pseudocode**:
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```
- **Time & Space complexity**:
  - Time: $O(\sqrt{N})$.
  - Space: $O(1)$.
- **Common mistakes**:
  - Iterating up to $N$ or $N/2$ instead of $\sqrt{N}$ (inefficient $O(N)$ approach).
  - Handling $0$, $1$, and $2$ incorrectly as edge cases.
- **Related patterns**: Sieve of Eratosthenes (for range queries).

---

### Nested Loops & Pattern Printing
- **Core idea**: Outer loop controls rows (line numbers), inner loop controls columns (elements per line).
- **When to use it**: Grid traversal, 2D matrix manipulation, pyramid/character triangle patterns.
- **Template / pseudocode**:
```java
// Right-angled triangle of numbers
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= line; star++) {
        System.out.print(star + " ");
    }
    System.out.println();
}

// Inverted triangle
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= n - line + 1; star++) {
        System.out.print("*");
    }
    System.out.println();
}
```
- **Time & Space complexity**:
  - Time: $O(N^2)$ for 2D pattern loops.
  - Space: $O(1)$.
- **Common mistakes**:
  - Incorrect inner loop bounds (confusing `line` count with `n - line + 1`).
  - Forgetting `System.out.println()` at the end of each outer loop iteration.
- **Related patterns**: 2D Arrays, Matrix Traversal.

---

### Functions, Scope, and Pass-by-Value
- **Core idea**: Java is **strictly Pass-by-Value**. Methods operate on copies of primitive arguments. Primitive variables declared inside loops/blocks exist only within their scope.
- **When to use it**: Modularizing code, writing reusable helper functions.
- **Template / pseudocode**:
```java
public static int sum(int a, int b) {
    return a + b; // Value returned to caller
}
```
- **Time & Space complexity**:
  - Time: $O(1)$ function call overhead.
  - Space: $O(1)$ call stack frame for non-recursive calls.
- **Common mistakes**:
  - Expecting primitive values to swap inside a `swap(a, b)` function (Java copies primitives).
  - Expecting variables declared inside a loop to be accessible outside the loop body.
- **Related patterns**: Recursion, Object references in Java.
