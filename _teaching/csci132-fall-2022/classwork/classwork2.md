---
collection: teaching
title: "Classwork 2"
---

## Logistics
* Due: Tuesday, May 11th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork2` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Write your first C program.
* Familiarize yourself with C's I/O commands.
* Write a program that interacts with a human user.
* Write expressions using arithmetic operators.

## Assignment

*This comes from problem 1, chapter 2 on page 102.*

Write a program that calculates mileage reimbursement for a salesperson at a
rate of $.35 per mile. Your program should interact with the user in this
manner:

```
MILEAGE REIMBURSEMENT CALCULATOR
Enter beginning odometer reading=> 13505.2
Enter ending odometer reading=> 13810.6
You traveled 305.4 miles. At $0.35 per mile, your reimbursement is $106.89.
```

### Requirements

Write your program in the `classwork` directory, inside another directory called
	`classwork2`, in  a file called `calculator.c`.
* Compile your program into an executable called `calculator` and run it using
	`./calculator`.

### Hints
* Develop your program in steps, checking that it compiles and runs after every
	change.
* Use comments to organize your program.
* Format your output to print only one or two decimal places using `%.mf` instead of `%f`, where
	`m` is the number of decimal places.

## Grading - 10 points
* 1 point - there is a file called `calculator.c` in your
	`classwork/classwork2` directory.
* 9 points - it can be compiled and runs.

Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork2`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 11th).
