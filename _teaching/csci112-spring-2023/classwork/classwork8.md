---
collection: teaching
title: "Classwork 8"
---

## Logistics
* Due: Monday, May 24th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork8` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice using pointers to pass by reference to a function.

## Assignment

Write a program called `classwork8.c` that reads in three doubles from standard input.

In a function defined outside of `main`, take those three numbers and compute
their sum and average. This can be done by passing references to your sum and
average variables that are defined inside of main.

Finally, print both the sum and the average.

For example, a run of your program may look like this:

```
[p19t655@csci112 classwork8]$ gcc -o classwork8 -Wall classwork8.c 
[p19t655@csci112 classwork8]$ ./classwork8 
Enter a number> 4.5
Enter a number> -10.0
Enter a number> 0.1
sums=-5.40. avg=-1.80.
```


## Grading - 10 points
* 1 point - there is a file called `classwork8.c` in your
	`classwork/classwork8/` directory.
* The file compiles and runs.
* Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork8`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 24th).
