---
collection: teaching
title: "Lab 2"
---

## Logistics
* Due: Friday, February 17th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab2.c` in your `~/csci112_spring2023/labs/lab2`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab2`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on Gradescope, so you can see comments and
	and detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it (i.e., by 6am on Sunday, February 12th) you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using `if` statements.
* Practice using loops.

## Assignment

*This is based on problem 7, chapter 5 on page 309.*

Write a program to process a collection of daily high temperatures. Your
program should count  the number of hot days (high temperature 85 or
higher), the number of pleasant days (high temperature 60-84), and the number
of cold days (high temperatures less than 60). Then, it should print a
visualization of those numbers (see sample output for an example) and the
average temperature.

### Notes
* Write your program in a file called `lab2.c` in your
	`csci112-spring2023/labs/lab2/` directory.
* You can assume that the user will only enter integers.
* To check your work quickly, you can run `./<your-executable> < /public/labs/lab2/input.txt`, which will input the numbers entered by the
	user in the example output below without you having to type them.

### Example output
```
[p19t655@csci112 lab2]$ ./a.out
Enter a high temp reading (-99 to quit)> 56
Enter a high temp reading (-99 to quit)> 76
Enter a high temp reading (-99 to quit)> 12
Enter a high temp reading (-99 to quit)> 34
Enter a high temp reading (-99 to quit)> 55
Enter a high temp reading (-99 to quit)> 99
Enter a high temp reading (-99 to quit)> 101
Enter a high temp reading (-99 to quit)> 90
Enter a high temp reading (-99 to quit)> 87
Enter a high temp reading (-99 to quit)> 43
Enter a high temp reading (-99 to quit)> -12
Enter a high temp reading (-99 to quit)> 9
Enter a high temp reading (-99 to quit)> -99

Hot days:	****
Pleasant days:	*
Cold days:	*******
Average temperature: 54.2
```

## Grading - 100 points
**If your code does not compile, has a runtime error on the inputs shown in the example output,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: code is indented so it is readable
* 10 points: compiles successfully with `-Wall` -- no warnings
* 10 points: the program stops collecting data when the user enters -99
* 10 points: -99 is not counted as a temperature
* 5 points: hot temperatures are counted correctly
* 5 points: pleasant temperatures are counted correctly
* 5 points: cold temperatures are counted correctly
* 10 points: data visualization is correct based on counts
* 15 points: the average computation is correct
* 10 points: the average temperatures is printed with exactly one decimal
	place

## Grading turnaround
This lab will be graded within one week of its due date.

## Go beyond
* Use functions to avoid repeated code when printing your visualization.
* Use the increment operator `++` and addition assignment `+=` when possible.
