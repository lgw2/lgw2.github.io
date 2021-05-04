---
collection: teaching
title: "Lab 2"
---

## Logistics
* Due: Sunday, May 16th no later than 11:59pm.
* Submission instructions: push a commit with the tag `lab2` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice using `if` statements.
* Practice using loops.

## Assignment

*This is based on problem 7, chapter 5 on page 309.*

Write a program to process a collection of daily high temperatures. Your
program should count and print the number of hot days (high temperature 85 or
higher), the number of pleasant days (high temperature 60-84), and the number
of cold days (high temperatures less than 60). Then, it should print the
average temperature.

### Requirements
* Write your program in a file called `lab2.c` in your
	`csci112-firstname-lastname/labs/lab2/` directory.
* You can assume that the user will only enter integers.
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare your output with the sample
	output. Don't worry about trailing spaces.

### Example output
```
[p19t655@csci112 lab2]$ ./lab2
Enter a high temp reading (-99 to quit)> 100
Enter a high temp reading (-99 to quit)> 0
Enter a high temp reading (-99 to quit)> 50
Enter a high temp reading (-99 to quit)> -99

Hot days:	1
Pleasant days:	0
Cold days:	2

The average temperature was 50.00 degrees.
[p19t655@csci112 lab2]$ ./lab2
Enter a high temp reading (-99 to quit)> 52
Enter a high temp reading (-99 to quit)> 62
Enter a high temp reading (-99 to quit)> 68
Enter a high temp reading (-99 to quit)> 74
Enter a high temp reading (-99 to quit)> 59
Enter a high temp reading (-99 to quit)> 45
Enter a high temp reading (-99 to quit)> 41
Enter a high temp reading (-99 to quit)> 58
Enter a high temp reading (-99 to quit)> 60
Enter a high temp reading (-99 to quit)> 67
Enter a high temp reading (-99 to quit)> 65
Enter a high temp reading (-99 to quit)> 78
Enter a high temp reading (-99 to quit)> 82
Enter a high temp reading (-99 to quit)> 88
Enter a high temp reading (-99 to quit)> 91
Enter a high temp reading (-99 to quit)> -99

Hot days:	2
Pleasant days:	8
Cold days:	5

The average temperature was 66.00 degrees.
```

## Grading - 100 points
* 10 points – includes comments explaining what your program does
* 10 points – code is indented so it is readable
* 20 points – compiles successfully with `-Wall` – no warnings
* 10 points - the program stops collecting data when the user enters -99, and
	-99 is not counted as a temperature
* 5 points - hot temperatures are counted correctly
* 5 points - pleasant temperatures are counted correctly
* 5 points - cold temperatures are counted correctly
* 20 points - the average computation is correct
* 5 points - the average temperatures is printed with exactly two decimal
	places
* 10 points – prints the output to exactly match the sample output

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 17th.
