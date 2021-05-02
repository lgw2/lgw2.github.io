---
collection: teaching
title: "Classwork 3"
---

## Logistics
* Due: Wednesday, May 12th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork3` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Use a function to organize your program.

## Assignment

*This comes from problem 13, chapter 3 on page 171.*

After studying the population growth of Gotham City in the last decade of the
20th century, we have modeled Gotham's population as

```
P(t) = 52.966 + 2.184t
```
where `t` is years after 1990, and `P` is population in thousands. Thus, `P(0)`
represents the population in 1990, which was 52.966 thousand people. Write a
program that defines a function named `population` that predicts Gotham's
population in the year provided as an input argument. Your program should call
the function and interact with the user as follows:
```
Enter a year after 1990> 2015
Predicted Gotham City population for 2015 (in thousands):
107.566
```

### Requirements

Write your program in the `classwork` directory, inside another directory called
	`classwork3`, in  a file called `population.c`.
* Compile your program into an executable called `population` and run it using
	`./population`.

### Hints
* Develop your program in steps, checking that it compiles and runs after every
	significant change.
* Use comments to organize your program.

## Grading - 10 points
* 1 point - there is a file called `population.c` in your
	`classwork/classwork3` directory.
* 9 points - it can be compiled and runs.

Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork3`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 12th).
