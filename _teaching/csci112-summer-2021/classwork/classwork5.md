---
collection: teaching
title: "Classwork 5"
---

## Logistics
* Due: Monday, May 17th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork5` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice using file redirection to read input from a file.

## Assignment
Write a program that reads in an unknown number of integers from a file and
prints their sum.

Using the two example input files from `/public/classwork5/`, running your
program could look like

```
[p19t655@csci112 classwork5]$ ./add_nums < nums1.txt
Finished reading file.
Sum was 210.
[p19t655@csci112 classwork5]$ ./add_nums < nums2.txt
Finished reading file.
Sum was 236.
```

but for classwork assignments you are not required to match the output
formatting.

### Requirements

* Write your program in the `classwork` directory, inside another directory called
	`classwork5`, in  a file called `add_nums.c`.
* Copy two input files from the public directory into your `classwork5`
	directory so that you can use them as test inputs by running `cp
	/public/classwork5/nums* .`

## Grading - 10 points
* 1 point - there are three files in your `classwork5` directory: `add_nums.c`, `nums1.txt`, and `nums2.txt`.
* 9 points - `add_nums.c` compiles without errors and runs.
* Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork5`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 17th).
