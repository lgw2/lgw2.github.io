---
collection: teaching
title: "Lab 4"
---

## Logistics
* Due: Wednesday, May 26th no later than 11:59pm.
* Submission instructions: push a commit with the tag `lab4` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice working with strings.
* Practice reading to and writing from a file.

## Assignment

*This problem comes from problem 1, Chapter 8 on pages 515-516 of the textbook.*

You are to write a program that will read the names of hurricanes that affected
Florida, their categories, and their date from the file
`/public/lab4/hurricanes.csv`.  You will write the list sorted by name to a file.
Only print the number of the category, not the whole phrase that is in the file
for category.



### Requirements
* Write your program in a file called `lab4.c` in your
	`csci112-firstname-lastname/labs/lab4/` directory.
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare your output with the sample
	output. You do not need to worry about trailing spaces.

### Hints
* In previous labs, we have used tabs (`\t`) to space our output. For this
	assignment, you may want to use padding instead. For example, if the
	character array `var` held `Montana`,
	`printf("%10s", var)` would print `   Montana`, so that the output took up
	exactly 10 characters. To print `Montana   ` (with the spaces on the right,
	we could do `printf("%-10s", var)`.

## Grading - 100 points
* 10 points – includes comments to explain what the program does
* 10 points – code is indented so that it is readable
* 15 points – compiles successfully with -Wall – no warnings
* 5 points - Uses `\t` for spacing in output
* 20 points – matches the output format exactly
* 5 points – reads in the input correctly
* 5 points – computes each student’s grade correctly
* 10 points – prints the number of students who missed a question correctly
* 10 points – uses arrays to store the right answers and the missed number of answers
* 10 points – uses at least 2 functions in addition to main

## Grading turnaround
This lab will be graded with scores in Brightspace by 5pm on May 27th.
