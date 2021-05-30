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
error function and you must have a separate function to translate the digits to
words.  You must store the words for each digit in a vector.
If the number in the tens place is one, throw a runtime error. If the user does
not give a command line argument, throw a runtime error as well.
You can assume the number given will not have more than 4 digits.

### Sample output
```
```

### Requirements
* Write your program in a file called `lab5.c` in your
	`csci112-firstname-lastname/labs/lab5/` directory.
* You must write the program using C++ constructs.

## Grading - 100 points

You will get a 0 if you don’t write the code with only C++ headers.

* 5 points – comments explaining what your program does
* 5 points – indent your code so it is readable
* 10 points – compiles successfully
* 10 points - used a vector to store the words for your number.
* 10 points – printed your vector of words in main
* 10 points – have a function (not main) that will build the vector of words
* 10 points - have an error function that will throw a runtime error with a descriptive message
* 10 points - pass the input number as a command line argument.
* 10 points - throw a runtime error if the number is not on the command line
* 10 points - throw a runtime error if the second digit of the number is a 1.
* 10 points - match the example output exactly

## Grading turnaround
This lab will be graded with scores in Brightspace by 5pm on Monday, June 7th.
