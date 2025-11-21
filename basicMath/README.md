# Basic Math Problems in Java

This README contains explanations and logic for a set of classic basic math problems commonly used in DSA and Java practice. Each topic includes the problem description and the logic behind the solution.

---

## 1. Check Armstrong Number

An Armstrong number is a number for which the sum of each digit raised to the power of the total number of digits equals the number itself.

### Logic

1. Count the number of digits in the number.
2. Extract each digit.
3. Raise the digit to the power of the total digits.
4. Add all powered digits together.
5. If the total equals the original number, it is Armstrong.

---

## 2. Check Perfect Number

A perfect number is a number for which the sum of all its proper divisors (excluding the number itself) equals the number.

### Logic

1. Loop from 1 to n/2.
2. Check if the number is divisible by the current loop value.
3. Keep a running sum of all divisors.
4. If sum equals the number, it is perfect.

---

## 3. Check Prime Number

A prime number is a number greater than 1 that has no divisors other than 1 and itself.

### Logic

1. If number < 2, not prime.
2. Check divisibility from 2 to sqrt(n).
3. If any divisor divides the number, it is not prime.
4. If none divide, it is prime.

---

## 4. Count Digits in a Number

### Logic

1. Repeatedly divide the number by 10.
2. Each division removes the last digit.
3. Count how many times this happens until number becomes 0.

---

## 5. GCD of a Number (Euclid's Algorithm)

### Logic

1. Take two numbers: n1 and n2.

2. While both numbers are greater than 0:

- If n1 > n2, replace
n1=n1%n2

- Else replace n2=n2%n1
3. Repeating this process keep reducing the numbers.
4. Loop continues until one number becomes 0.

5. The number which is not zero at the end is the GCD.

---

## 6. Largest Digit in a Number

### Logic

1. Extract each digit using n % 10.
2. Compare with a variable tracking the maximum digit found.
3. Update max if current digit is larger.
4. Remove the last digit using n / 10.

---

## 7. LCM of Two Numbers (Using Euclid)

### Logic

1. First find GCD using Euclid's algorithm.
2. Use formula:
   LCM = (a * b) / GCD

---

## 8. LCM of Two Numbers (Brute Force)

### Logic

1. Start from the maximum of the two numbers.
2. Increment until a number divisible by both is found.
3. The first such number is the LCM.

---

## 9. Palindrome Number

A number is palindrome if it reads the same forward and backward.

### Logic

1. Reverse the number.
2. Compare reversed number with original.
3. If equal, it's a palindrome.

---

## 10. Print Fibonacci Series

### Logic

1. Start with first two numbers: 0 and 1.
2. Next number = sum of previous two.
3. Move the window forward.
4. Continue until N terms.

---

## 11. Reverse a Number

### Logic

1. Extract last digit using n % 10.
2. Append it to reversed number: rev = rev * 10 + digit.
3. Remove last digit using n = n / 10.
4. Continue until number becomes 0.

---

## 12. Sum of Digits of a Number

### Logic

1. Extract digits one by one using n % 10.
2. Add the digit to the sum.
3. Remove last digit using n = n / 10.
4. Continue until number becomes 0.

---

This README contains the logical foundation for all basic math problems you can implement in Java for improving your DSA fundamentals.