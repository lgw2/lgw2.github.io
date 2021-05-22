---
collection: teaching
title: "Program 2"
---

## Logistics
* Due: Sunday, May 30th no later than 11:59pm.
* Submission instructions: push a commit with the tag `program2` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Manipulate strings
* Create and use `structs`
* Practice using arrays
* Read from a file
* Create a header file
* Use a makefile to compile multiple sources

## Assignment

Create a program that reads in a list of CSCI classes from a file.  Store the
list in an array of data structures. Then, allow the user to have a number of
options to query the list of classes and get information about them. You must
include the following options:
* Quit
* Print all classes
* Print all classes by course id (e.g., `CSCI 112`)
* Print all classes under a certain number of seats

You should also add at least one more option that is different from all the
options listed above.

### Sample input and output

### Hints
* You can use `gets` to read in input with spaces without a newline character.
	`fgets` also reads input with spaces, but it keeps the newline. `gets` is
	deprecated in newer C compilers, but you can use it for this assignment.
* If `gets` (or `fgets`) is not allowing you to enter input, it may be
	consuming a previous newline left behind from a `scanf`. To fix this, you
	can add a `getchar()` before your `gets`.
* Remember that string assignment must be done with `strcpy` (unless it's in a
	variable declaration/initialization).
* Start early!

### Requirements

## Grading - 100 points
* 5 points – comments explaining what your program does
* 5 points - code is indented so that it is readable
* 5 points - there are no global variables
* 10 points – compiles successfully with -Wall – no warnings except for about
	`get`
* 5 points – successfully reads in and uses a command line parameter
* 5 points - has error msg if no command line parameter
* 10 points – reads all input into a 2 dimensional array of size command line number x 4
* 5 points - the array is of `unsigned char` data type
* 5 points – compiles and links  with makefile
* 5 points - four functions are stored in different files
* 10 points – computes the number of networks for class A, B, C correctly.
* 15 points – identifies the largest networks for class A, B, C correctly,
	prints the largest network, and prints the correct largest count
* 5 points – sorts addresses in order to count them
* 10 points - correctly implements a sorting algorithm
* BONUS 5 points - uses a different sorting algorithm other than selection sort
	(which was shown in the lecture video)

## Grading turnaround
This program will be graded with scores in Brightspace by 5pm on May 25th.
