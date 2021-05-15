---
collection: teaching
title: "Lab 3"
---

## Logistics
* Due: Tuesday, May 18th no later than 11:59pm.
* Submission instructions: push a commit with the tag `lab3` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice using file redirection.
* Practice using arrays.

## Assignment

*This problem comes from problem 1, chapter 7 on page 445-446 of the book.*

Write a program to grade an n-question multiple-choice exam, where n is between
1 and 10. You receive the information about the exam from standard input (so you
should use `scanf`), but you should read it using file redirection instead of
typing the input.
The first line contains the number of questions followed by the correct
answer for each question. All of the following lines contain a student id
number followed by that student's answers to each question. An example input
file can be found in `/public/lab3/testdata.txt`. It looks like this:

```
8 ccddabce
100 bcddabca
107 ccddcbab
112 ccddabcc
115 bbccabcd
120 cdcdabcf
```
meaning that there were 8 questions on the exam and five students took it.

Your program should print out a report about the exam that shows the correct
answer for each question, the grade for each student (by ID and in the same
order that they were passed in), and a count of the number of students who
missed each question. For example, your program should output the following
given the provided `testdata.txt` file.
```
[p19t655@csci112 lab3]$ ./lab3 < testdata.txt 
Question	1 2 3 4 5 6 7 8 
Answer		c c d d a b c e 

ID	Grade(%)
100	75.00
107	62.50
112	87.50
115	37.50
120	50.00

Question	1 2 3 4 5 6 7 8 
Missed By	2 2 2 1 1 0 2 5 
```

### Requirements
* Write your program in a file called `lab3.c` in your
	`csci112-firstname-lastname/labs/lab3/` directory.
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare your output with the sample
	output. You do not need to worry about trailing spaces.

### Example output
```
```

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
This lab will be graded with scores in Brightspace by 5pm on May 19th.
