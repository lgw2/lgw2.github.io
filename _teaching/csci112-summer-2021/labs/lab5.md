---
collection: teaching
title: "Lab 5"
---

## Logistics
* Due: Friday, June 4th no later than 11:59pm.
* Submission instructions: push a commit with the tag `lab5` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Write a C++ program
* Create a simple runtime error
* Work with a vector of strings

## Assignment

You are to write a program in C++ that will take the number given on the
command line and write it in words. You must have a separate
error function and you must have at least one separate function to translate the digits to
words. You must store the words for each digit in a vector.
If the number in the tens place is one, throw a runtime error. If any of the
numbers entered is 0, throw a runtime error. 
You can assume the number given will not have more than 4 digits.

### Sample output
```
[p19t655@csci112 lab5]$ ./process 123
Number 123 is written as one hundred twenty three 
[p19t655@csci112 lab5]$ ./process4375
-bash: ./process4375: No such file or directory
[p19t655@csci112 lab5]$ ./process 123
Number 123 is written as one hundred twenty three 
[p19t655@csci112 lab5]$ ./process 4375
Number 4375 is written as four thousand three hundred seventy five 
[p19t655@csci112 lab5]$ ./process 5
Number 5 is written as five 
[p19t655@csci112 lab5]$ ./process 14
Oops! Entered a 1 in the tens place
[p19t655@csci112 lab5]$ ./process 440
Oops! Entered a 0 in the number
[p19t655@csci112 lab5]$ ./process 0
Oops! Entered a 0 in the number
[p19t655@csci112 lab5]$ ./process 0141
Oops! Entered a 0 in the number
```

### Requirements
* Write your program in a file called `lab5.c` in your
	`csci112-firstname-lastname/labs/lab5/` directory.
* You must write the program using C++ constructs.

## Grading - 100 points

* 5 points – comments explaining what your program does
* 5 points – indent your code so it is readable
* 10 points – compiles successfully
* 10 points - used a vector to store the words for your number.
* 10 points – have at least one function beside main
* 10 points - have an error function that will throw a runtime error with a descriptive message
* 10 points - pass the input number as a command line argument.
* 10 points - throw a runtime error if the second digit of the number is a 1.
* 10 points - throw a runtime error if any digit is a zero
* 10 points - use `cout` and `cin`, not `printf` and `scanf`
* 10 points - match the example output exactly

## Grading turnaround
This lab will be graded with scores in Brightspace by 5pm on Monday, June 7th.
