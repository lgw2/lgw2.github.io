---
collection: teaching
title: "Classwork 10"
---

## Logistics
* Due: Wednesday, May 26th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork10` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice using pointers to pass by reference to a function.

## Assignment

Write a program called `classwork10.c` containing an enumerated type for the
months of the year. Call the type `months_t`.

Have a user enter an integer 1-12 for the month. Then, using a `switch`
statement, print out a message to the user telling them which month it is,
using the values from `months_t` as the switch cases. For example, if `january`
was the first value in your enumerated type, your code should contain
```
case january:
	printf("The month is January.\n");
	break;
```
or something similar.

## Grading - 10 points
* 1 point - there is a file called `classwork10.c` in your
	`classwork/classwork10/` directory.
* The file compiles and runs.
* Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork10`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 26th).
