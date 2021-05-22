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
`/public/lab4/hurricanes.csv`. You should copy that file to your `labs/lab4/` directory
to read it in.

You will write the list sorted by name to a file.
Only print the number of the category, not the whole phrase that is in the file
for category.

### Sample output

A sample output file can be found at `/public/lab4/out.txt`.

### Requirements
* Write your program in a file called `lab4.c` in your
	`csci112-firstname-lastname/labs/lab4/` directory.
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare the content of your output file  with the sample
	output. You do not need to worry about trailing spaces.

### Hints
* In previous labs, we have used tabs (`\t`) to space our output. For this
	assignment, you may want to use padding instead. For example, if the
	character array `var` held `Montana`,
	`printf("%10s", var)` would print `   Montana`, so that the output took up
	exactly 10 characters. To print `Montana   ` (with the spaces on the right,
	we could do `printf("%-10s", var)`.
* Consider structuring your program like so: store each line in an array of
	strings. Sort it. (Or sort an array of pointers to strings in your original
	array.) Then use `strtok` only when you go to print out the lines in sorted
	order.

## Grading - 100 points
* 5 points – comments explaining what your program does
* 10 points – indent your code so it is readable
* 15 points – compiles successfully with -Wall – no warnings
* 5 points – does not use globals
* 10 points – successfully reads from file in same directory as your program
* 5 points – prints to a file in a pleasing manner and shows all the information
* 5 points – uses `fgets` to read in each line
* 5 points – stores each line in an array of strings
* 5 points – sorts the array
* 5 points – prints only the category number
* 5 points – uses at least 2 functions plus main
* 10 points - matches the sample output formatting exactly

## Grading turnaround
This lab will be graded with scores in Brightspace by 5pm on May 27th.
