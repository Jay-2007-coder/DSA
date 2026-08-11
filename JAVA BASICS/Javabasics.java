// public class Javabasics {
// public static void main(String[] args) {
// // Print "Hello, World!" to the console
// System.out.println("123456789");
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// // Print "Hello, World!" to the console
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// // Print "Hello, World!" to the console
// int a = 4;
// int b = 5;
// System.out.println(a + b);
// a = 6;
// b = 7;
// System.out.println(a + b);

// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// byte b = 127;
// long a = 0000000000;
// System.out.println(b);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter your name: ");
// String input = sc.next();
// System.out.println("Hello " + input);
// boolean a = sc.nextBoolean();
// System.out.println(a);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter numbers: ");
// float a = sc.nextFloat();
// System.out.print ("Enter another number: ");
// int b = sc.nextInt();
// sum = (int) a * b;
// System.out.println("The Multiplication is: " + sum);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter radius: ");
// float r = sc.nextFloat();
// float pi = 3.14f;
// float area = pi * r * r;
// System.out.println("The area of circle is: " + area);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// long a = 1234;
// int b = (int)a;
// System.out.println(b);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter age: ");
// int age = sc.nextInt();
// if(age >= 18) {
// System.out.println("You are Eligible To vote");
// }
// if(age > 13 && age < 18) {
// System.out.println("You are a Teenager");
// }
// else {
// System.out.println("You are not Eligible to vote");
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = 10;
// int b = 20;
// if (a > b) {
// System.out.println("A is greater than B");
// }
// else {
// System.out.println("B is greater than A");
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter a number: ");
// int a = sc.nextInt();
// if(a % 2 == 0) {
// System.out.println("The no is even");

// }
// else {
// System.out.println("The no is odd");
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter your marks: ");
// int age = sc.nextInt();
// if (age >= 18)
// {
// System.out.println("You are Eligible To vote");
// }
// else if(age > 13 && age < 18 ) {
// System.out.println("You are a Teenager");
// }
// else
// {
// System.out.println("You are not Eligible to vote");
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter your Income: ");
// int income = sc.nextInt();
// float tax = 0.18f;
// if ( income <= 500000) {
// System.out.println("No tax for you");

// }
// else if(income > 500000 && income <= 1000000 ) {
// System.out.println("Your tax is: " + (income * tax));
// }
// }
// }

// Print largest of thee
// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// int c = 30;
// if (a>=b && a>=c) {
// System.out.println("A is largest");
// }
// else if (b>=c) {
// System.out.println("B is largest");
// }
// else {
// System.out.println("C is largest");
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int num = 5;
// String type = (num%2 == 0) ? "Even" : "Odd";
// System.out.println(type);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.print ("Enter Marks: ");
// int marks = sc.nextInt();
// String type = (marks >=33) ? "Pass" : "Fail";
// System.out.println(type);
// }
// }

// public class JavaBasics {
// public static void main(String[] args) {
// int income = 600000;
// int tax = (income < 500000) ? 0
// : (income < 1000000) ? (int)(income * 0.2)
// : (int)(income * 0.3);
// System.out.println("The tax is: " + tax);
// }
// }

// public class JavaBasics {
// public static void main(String[] args) {
// int num = 2;
// switch(num) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// case 7:
// System.out.println("Sunday");
// break;
// default:
// System.out.println("Invalid day");
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// char ch = 'a';
// switch(ch) {
// case 'a' : System.out.println("Samosa");
// break;
// case 'b' : System.out.println("Burger");
// break;
// default: System.out.println("Invalid choice");
// }
// }
// }

// Calculator using switch
// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter first number: ");
// int a = sc.nextInt();
// System.out.print ("Enter second number: ");
// int b = sc.nextInt();
// System.out.print ("Enter operator (+, -, *, /): ");
// char op = sc.next().charAt(0);
// int result;
// switch(op) {
// case '+' : result = a + b;
// System.out.println("The sum is: " + result);
// break;
// case '-' : result = a - b;
// System.out.println("The difference is: " + result);
// break;
// case '*' : result = a * b;
// System.out.println("The product is: " + result);
// break;
// case '/' : result = a / b;
// System.out.println("The Division is: " + result);
// break;
// case '%' : result = a % b;
// System.out.println("The Modulus is: " + result);
// break;
// default: System.out.println("Invalid operator");
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int counter = 0;
// while(counter < 5) {
// System.out.println("Hello World");
// counter++;
// }
// System.out.println(counter);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int counter = 1;
// while(counter <= 1000000 ) {
// System.out.print(counter + " ");
// counter++;
// }
// // System.out.println(counter);
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter n: ");
// int n = sc.nextInt();
// int sum = 0;
// while(sum <= n) {
// System.out.println(sum);
// sum++;
// }

// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter n: ");
// int n = sc.nextInt();
// int sum = 0;
// int i = 1;
// while(i <= n) {
// sum += i;
// System.out.println("The sum is: " + sum);
// i++;

// }
// System.err.println("The final sum is: " + sum);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int sum = 0;
// for(int i = 1; i<=10; i++) {
// sum = sum + i;
// }
// System.out.println("The sum is: " + sum);}
// }

// public class Javabasics {
// public static void main(String[] args) {
// for(int i = 1; i<=4 ; i++) {
// System.out.println("* * * *");
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter n: ");
// int n = sc.nextInt();
// for(int i = n; i >= 1 ; i--) {
// System.out.print(i + " ");
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 987654321;
// int digit = 0;
// while(n>0) {
// digit = n%10;
// System.out.print(digit + " ");
// n = n/10;
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 987654321;
// int digit = 0;
// int rev = 0;
// while(n>0) {
// digit = n%10; // gives remainder which is the last digit of n
// rev = (rev * 10) + digit;
// System.out.print(rev + " \n");
// n = n/10;
// }
// System.out.println("The reverse is: " + rev);
// }
// }

// do while
// public class Javabasics {
// public static void main(String[] args) {
// int counter = 1;
// do {
// System.out.println("Hello World");
// counter++;
// } while(counter <=5);
// }
// }

// if multiple of ten exit
// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// int n = sc.nextInt();
// if(n % 10 == 0) {
// break;
// }
// System.out.println(n);

// } while(true);
// System.out.println("Exited the loop");
// }
// }

// contine statement
// public class Javabasics {
// public static void main(String[] args) {
// for(int i = 1; i <=10; i++) {
// if(i == 3) {
// continue;
// }
// System.out.println(i);
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// int n = sc.nextInt();
// if (n % 10 == 0) {
// continue;
// }
// System.out.println(n);

// }while(true);

// }
// }

// Prime no
// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter n: ");
// int n = sc.nextInt();
// if(n == 2) {
// System.out.println("The number is prime");
// }else {
// boolean isPrime = true;
// for(int i = 2; i<=Math.sqrt(n); i++) {
// if(n % i == 0) { //n is a multiple of i
// isPrime = false;
// }
// }
// if (isPrime == true) {
// System.out.println("The number is prime");
// }
// else {
// System.out.println("The number is not prime");
// }
// }

// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// int temp = a;
// a = b;
// b = temp;
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// a = a + b; // a = 30
// b = a - b; // b = 10
// a = a - b; // a = 20
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// char e = 12;
// System.out.println(0 + e);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int s=0;
// for(int i=1; i<=5; i++) {
// for(int j=1; j<=i; j++) {
// s = s+ 1;
// System.out.print( "* ");
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int s=0;
// for(int i=1; i<=5; i++) {
// for(int j=1; j<=i; j++) {
// char a = 'A';

// a++;
// System.out.print(a + " ");
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 4;
// for(int i=1; i<=n; i++)
// {
// for(int j = n; j>=i; j--
// ) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 4;
// for(int i=1; i<=n; i++)
// {
// for(int j = 1; j<=n-i+1; j++
// ) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 4;
// for(int i=1; i<=n; i++)
// {
// for(int j = 1; j<=i; j++
// ) {
// System.out.print( "* ");
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 6;
// int k = 1;
// for(int i=1; i<=n; i++)
// {
// for(int j = 1; j<=i; j++
// ) {
// System.out.print( k + " ");
// k++;
// }

// System.out.println();
// }
// System.out.println(k);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 4;
// char ch = 'A';
// for(int i=1; i<=n; i++)
// {
// for(int j = 1; j<=i; j++
// ) {
// System.out.print( ch + " ");
// ch++;
// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// char n = 'Z';
// for(int i='A'; i<=n; i++)
// {
// for(char j = 'A'; j<=i; j++
// ) {
// System.out.print(j);

// }
// System.out.println();
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n = 4;

// for(int i = 0; i < n; i++) { // controls number of lines
// for(char j = 'A'; j <= 'A' + i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

//

// public class Javabasics {
// public static int printhello() {
// System.out.println("Hello World");
// System.out.println("Hello World");
// System.out.println("Hello World");
// return 1;
// }
// public static void main(String[] args) {
// printhello();
// printhello();

// }
// }

// import java.util.*;

// public class Javabasics {
// public static int fact(int n) {
// int fact = 1;

// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }

// // System.out.println("The factorial is: " + fact);
// return fact;

// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter n: ");

// int n = sc.nextInt();
// // int s = fact(n);
// System.out.println("The factorial is: " + fact(n));

// }
// }

// import java.util.*;
// public class Javabasics {
// public static void sum(int n1, int n2) {
// int sum = n1 + n2;
// System.out.println("The sum is: " + sum);
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Two n: ");

// int a = sc.nextInt();
// int b = sc.nextInt();
// sum(a,b);

// }
// }

//

// import java.util.*;
// public class Javabasics {
// public static int multiply(int n1, int n2) {
// int product = n1 * n2;
// return product;

// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Two n: ");

// int a = sc.nextInt();
// int b = sc.nextInt();
// int product = multiply(a,b);
// System.out.println("The Product is: " + product);
// }
// }

// public class Javabasics {
// public static void swap(int a, int b) {
// int temp = a;
// a=b;
// b=temp;
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// }
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// swap(a,b);
// System.out.println("The value of a is: " + a);
// System.out.println("The value of b is: " + b);
// }
// }

// public class Javabasics {
// public static void ChangeA(int a) {
// a = 50;
// System.out.println("The value of a inside function is: " + a);
// }
// public static void main(String[] args) {
// int a = 10;
// ChangeA(a);
// System.out.println("The value of a outside function is: " + a);

// }
// }

// public class Javabasics {
// public static int multipy(int a, int b) {
// return a * b;
// }
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// int product = multipy(a,b);
// System.out.println("The product is: " + product);
// int product2 = multipy(5,6);
// System.out.println("The product is: " + product2);

// }
// }

// public class Javabasics {
// public static int factorial(int n) {
// int fact = 1;
// for(int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// return fact;
// }
// public static int binomial(int n, int r){
// int num = factorial(n);
// int den = factorial(r) * factorial(n - r);
// int binomial = num / den;
// // System.out.println("The binomial coefficient is: " + binom);
// return binomial;
// }
// public static void main(String[] args) {
// int n = 10;
// int r = 2;
// binomial(n,r);
// int bino = binomial(n,r);
// System.out.println("The binomial coefficient is: " + bino);
// }
// }

// public class Javabasics {
// public static void mult(int a, int b) {
// System.out.println("The multiplication is: " + (a * b));
// }
// public static void mult(int a, int b ,int c) {
// System.out.println("The multiplication is: " + (a * b*c));

// }
// public static void mult(float a, float b) {
// System.out.println("The multiplication is: " + (a * b));
// }
// public static void main(String[] args) {
// mult(1.2f,3.4f);
// mult(1,2,3);
// }
// }

// prime no using function
// import java.util.*;
// public class Javabasics {
// public static boolean isPrime(int n) {
// if(n == 2) {
// return true;
// }
// for(int i = 2; i <= Math.sqrt(n); i++) {
// if(n % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter n: ");
// int n = sc.nextInt();
// boolean prime = isPrime(n);
// if(prime) {
// System.out.println("The number is prime");
// } else {
// System.out.println("The number is not prime");
// }
// }
// }

// public class Javabasics {
// public static boolean isPrime(int n) {
// if(n == 2) {
// return true;
// }
// for(int i = 2; i <= Math.sqrt(n); i++) {
// if(n % i == 0) {
// return false;
// }
// }
// return true;
// }
// public static void primerange(int n) {
// int count = 0;
// for(int i = 2; i <= n; i++) {
// if(isPrime(i)) { // if true then
// System.out.print(i + " ");
// count++;
// }
// }
// System.out.println("\nTotal prime numbers up to " + n + " are: " + count);
// }
// public static void main(String[] args) {
// primerange(100);
// }
// }

// public class Javabasics {

// public static int[] twoSum(int[] nums, int target) {
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {

// if (nums[i] + nums[j] == target) {
// return new int[]{i, j};
// }
// }
// }
// return new int[]{};
// }

// public static void main(String[] args) {
// int[] result = twoSum(new int[]{2, 6, 11, 15}, 9);

// if (result.length > 0) {
// System.out.println(result[0] + " " + result[1]);
// } else {
// System.out.println("No solution found");
// }
// }
// }

// -----------------------------------------------------------------------------

// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// System.out.println("Hello World" + a + b); // Java evaluates this left to
// right, and since "Hello World" is a String, everything after that becomes
// string concatenation, not addition.
// }
// }

// // Increment and Decrement Operator ++ and --
// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = ++a; // Unary plus, does not change the value of a for the assignment
// to b, but increments a before the assignment.
// System.out.println(a); // Now a is 11
// System.out.println(b); // b is assigned the value of a after pre-increment,
// }
// } // 11 11

// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = a++; // Post-increment, assigns the current value of a to b, then
// increments a.
// System.out.println(a); // Now a is 11
// System.out.println(b); // b is assigned the value of a before post-increment,
// which is 10
// }
// } // 11 10

// public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = a--; // Post-decrement, assigns the current value of a to b, then
// decrements a.
// System.out.println(a); // Now a is 9
// System.out.println(b); // b is assigned the value of a before post-decrement,
// which is 10
// }
// } // 9 10

// // public class Javabasics {
// public static void main(String[] args) {
// int a = 10;
// int b = --a; // Pre-decrement, decrements a before the assignment to b.
// System.out.println(a); // Now a is 9
// System.out.println(b); // b is assigned the value of a after pre-decrement,
// which is 9
// }
// } // 9 9

// A=A+1 ----- A+=1
// A=A-1 ----- A-=1
// A=A*1 ----- A*=1
// A=A/1 ----- A/=1
// A = A % 1 ----- A %= 1

// public class Javabasics {
// public static void main(String[] args) {
// int year = 2000;
// if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
// System.out.println(year + " is a leap year");
// }
// else {
// System.out.println(year + " is not a leap year");

// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int year = 2000;
// if (year % 400 == 0) {
// System.out.println(year + " is a leap year");
// }
// else if(year % 100 == 0) {
// System.out.println(year + " is not a leap year");
// }
// else if(year % 4 == 0) {
// System.out.println(year + " is a leap year");
// }
// else {
// System.out.println(year + " is not a leap year");
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {

// int x = 0;

// for(int i = 0; i < 5; i++) {
// x = i * 2;
// }

// // System.out.println(i); // works
// System.out.println(x); // works

// }}

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// for( ; true; ) {
// int n = sc.nextInt();

// if(n % 5 == 0) {
// break;
// }

// System.out.println(n);
// }

// System.out.println("Exited the loop");
// // System.out.println(n); // does not work because n is declared inside the
// loop and is not accessible outside of it.
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print ("Enter n: ");
// int n = sc.nextInt();
// boolean isPrime = true;
// if (n == 2) {
// System.out.println(n + " is a prime number");
// return; // we can return here because we have already determined that n is
// prime, so no need to check further.
// }
// for(int i = 2; i <= Math.sqrt(n); i++) {
// if(n % i == 0) {
// isPrime = false;
// break; // we can break here because we have already found a divisor, so no
// need to check further.
// }
// }
// if(isPrime) {
// System.out.println(n + " is a prime number");
// }
// else {
// System.out.println(n + " is not a prime number");
// }
// }
// }

// import java.util.*;
// public class Javabasics {
// public static void main (String args[]) {
// Scanner sc=new Scanner(System.in);
// int evenno = 0;
// int oddno = 0;
// System.out.println("how many numbers you want to enter: ");
// int n = sc.nextInt();

// for(int i=1 ; i<=n ; i++) {
// System.out.println("Enter a number: " + i);
// int num = sc.nextInt();
// if(num % 2 == 0) {
// evenno = evenno + num;
// }
// else {
// oddno = oddno + num;
// }
// }
// System.out.println("Sum of even numbers = " + evenno);
// System.out.println("Sum of odd numbers = " + oddno);
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int n =0 ;
// int fact =1;
// for(int i = n; i >= 1; i--) {
// fact = i * fact;
// }
// System.out.println("Factorial of " + n + " is: " + fact);
// }
// }

// alternate
// public class Javabasics {
// public static void main(String[] args) {
// int n = 5;
// int fact = 1;
// for(int i = 1; i <= n; i++) {
// fact = i * fact;
// }
// System.out.println("Factorial of " + n + " is: " + fact);
// }
// }

// Nested loop to print pattern

// public class Javabasics {
// public static void main(String[] args) {
// for(int i = 1; i<=5 ; i++) {
// for(char j = 65 ; j<i + 65 ; j++) {
// System.out.print(j + " ");
// }
// System.out.println(); //
// }
// }
// }
// A
// A B
// A B C
// A B C D
// A B C D E

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// for(int i = 1 ; i<=n ; i++)
// {
// for(int j =1 ; j<=n-i+1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// ****
// ***
// **
// *

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// for(int i = 1 ; i<=n ; i++)
// {
// for(int j =1 ; j<=i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// *
// * *
// * * *
// * * * *

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// for(int i = 1 ; i<=n ; i++)
// {
// for(int j =1 ; j<=i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// 1
// 12
// 123
// 1234

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// char ch = 'A';
// for(int i = 1; i<=n ; i++) {
// for(int j= 1 ; j<=i ; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();
// }
// }
// }

// A
// B C
// D E F
// G H I J

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// for(int i = 5 ; i>=1 ; i--) {
// for(char j = 'A' ; j<'A' + i ; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// A B C D E
// A B C D
// A B C
// A B
// A

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// char ch = 'A';
// for(int i = 4; i>=1 ; i--) {
// for(int j= 1 ; j<= i; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();
// }
// }
// }

// A B C D
// E F G
// H I
// J

// public class Javabasics {
// public static void main(String[] args) {
// int n =4;
// int ch = 1;
// for(int i = 1; i<=n ; i++) {
// for(int j= 1 ; j<=i ; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();
// }
// }
// }

// 1
// 2 3
// 4 5 6
// 7 8 9 10

// function
// public class Javabasics {
// public static void printHello() {
// System.out.println("Hello World");

// }
// public static void main(String[] args) {
// for(int i = 0; i < 5; i++) {
// printHello();
// }
// }
// }

// public class Javabasics {
// public static int printHello() {
// System.out.println("Hello World");
// return 245; // we can return any value here, but since the function is not
// being used to return a value, we can just return a dummy value.
// }
// public static void main(String[] args) {
// for(int i = 0; i < 5; i++) {
// printHello();
// }
// }
// }

// import java.util.Scanner;

// public class Javabasics {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// int a = sc.nextInt();
// System.out.print("Enter the second number: ");
// int b = sc.nextInt();

// sum(a ,b);
// }
// public static void sum(int a, int b) {
// int sum = a + b;
// System.out.println("The sum is: " + sum);
// }
// }

// import java.util.Scanner;

// public class Javabasics {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// int a = sc.nextInt();
// System.out.print("Enter the second number: ");
// int b = sc.nextInt();

// int sum = sum(a ,b);
// System.out.println("The sum is: " + sum);
// }
// public static int sum(int a, int b) {
// int sum = a + b;

// return sum; // we can return the sum if we want to use it later in the
// program, but since we are not using it, we can just return a dummy value or
// not return anything at all.
// }
// }

// public class Javabasics {
// public static void main(String[] args) {

// int year = 2024;

// if (year % 4 == 0) {

// if (year % 100 == 0) {

// if (year % 400 == 0) {
// System.out.println("It is a Leap Year");
// } else {
// System.out.println("It is not a Leap Year");
// }

// } else {
// System.out.println("It is a Leap Year");
// }

// } else {
// System.out.println("It is not a Leap Year");
// }
// }
// }

// --practice
// loop

// public class Javabasics {
// public static void main(String[] args) {
// // while loop
// int i = 0;
// while (i < 5) {
// System.out.println("Hello World");
// i++;
// }
// }
// }

// public class Javabasics {
// public static void main(String[] args) {
// int i = 1;
// while (i <= 10) {
// System.out.println(i);
// i++;
// }
// }
// }

// import java.util.*;

// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int i = 1;
// while (i <= n) {
// System.out.println(i);
// i++;
// }
// }
// }

// import java.util.*;

// public class Javabasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int i = 1;
// int sum = 0;
// while (i <= n) {
// System.out.print(i + "+" + sum + "= ");
// sum = sum + i;
// System.out.println(sum);
// i++;
// }
// System.out.println("The sum of the first 10 natural numbers is: " + sum);
// }
// }
