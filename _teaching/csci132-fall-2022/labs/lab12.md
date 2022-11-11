---
collection: teaching
title: "Lab 12"
---

## Logistics
* Due: on Thursday, November 17th anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* Understand binary search
* Write a recursive algorithm in Java

## Assignment

In this assignment, you will complete the `binarySearch` methods and the
`multiply` methods in the [starter code file](https://lgw2.github.io/teaching/csci132-fall-2022/labs/RecursiveAlgs.java). The `main` method of the starter
code has some tests so that you can ensure that your implementations are
correct. You do not need to modify the `main` method.

### Binary search

The `main` method of the starter code calls a two-parameter `binarySearch`
method. In this method, you should call your own `private binarySearch` method,
which will have a different method signature than the public `binarySearch`. It
should return true if the `target` integer is in `data` and false otherwise.
You can assume that `data` is already sorted. You are not required to check the
validity of the input. You can consult the book for a sample.

In addition to returning a boolean, your `binarySearch` method should print out
the total number of calls made to the method.

You can start by copying the book's `binarySearch` method if you want. However, you will need to add
code to print out the number of calls to the method.
* [p197.jpeg](https://lgw2.github.io/teaching/csci132-fall-2022/labs/p197.jpeg)

### Recursive multiply

This is based on problem C-5.13 from the book.

Complete the `recursiveMultiply` method so that it returns the product of two
positive integers `m` and `n` using only addition and subtraction. You do not
need to check that `m` and `n` are positive, but you can assume that they
always are.

### Sample output
```
Result computed using 1 call(s) to binarySearch
true
0 in [0] is true
Result computed using 8 call(s) to binarySearch
false
100 in [0,...,99] is false
Result computed using 5 call(s) to binarySearch
true
77 in [0,...,99] is true
Result computed using 9 call(s) to binarySearch
true
4 in the length 1000 array is true
Result computed using 11 call(s) to binarySearch
false
5004 in the length 1000 array is false
Result computed using 14 call(s) to binarySearch
false
2001 in the length 10000 array is false
Result computed using 11 call(s) to binarySearch
true
16301 in the length 10000 array is true
Result computed using 14 call(s) to binarySearch
false
-1 in the length 10000 array is false
Result computed using 17 call(s) to binarySearch
true
4 in the length 100000 array is true
Result computed using 16 call(s) to binarySearch
true
200000 in the length 100000 array is true
Result computed using 18 call(s) to binarySearch
false
4438923 in the length 100000 array is false

5 times 4 is 20
1 times 7 is 7
9 times 10 is 90
```

## Grading - 10 points
### Binary search
* 1 point - `binarySearch` with two parameters calls a private `binarySearch`
	(likely with more parameters)
* 2 points - correct true/false value for all tests
* 2 points - correct number of calls for all tests

### Recursive multiply
* 5 points - method is recursive and all tests get correct value

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, November
22nd.
