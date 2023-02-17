---
collection: teaching
title: "Lab 3"
---

## Logistics
* Due: Friday, February 24th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab3.c` in your `~/csci112_spring2023/labs/lab3`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab3`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and
	and detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

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
number followed by that student's answers to each question. You may assume that
no more than 20 students took the exam, though you can write the program
without
that assumption.

An example input
file can be found in `/public/labs/lab3/testdata.txt`. It looks like this:

```
8 ccddabce
100 bcddabca
107 ccddcbab
112 ccddabcc
115 bbccabcd
120 cdcdabde
```
meaning that there were 8 questions on the exam and five students took it.

Your program should print out a report about the exam that shows the correct
answer for each question, the grade for each student (by ID and in the same
order that they were passed in), and a count of the number of students who
missed each question. For example, your program should output the following
given the provided `testdata.txt` file.
```
Question	 1 2 3 4 5 6 7 8
Answer		 c c d d a b c e

ID	Grade(%)
100	75.00
107	62.50
112	87.50
115	37.50
120	62.50

Question	 1 2 3 4 5 6 7 8
Missed by	 2 2 2 1 1 0 2 4
```

## Grading - 100 points
**If your code does not compile, has a runtime error on the inputs shown in the example output,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: code is indented so it is readable
* 10 points: compiles successfully with `-Wall` -- no warnings
* 10 points: prints the output in a pleasing manner
* 15 points: shows all information in output (true answers to every question, %
	grade for every student id, and number of students who missed each
	question)
* 15 points: output information is correct (true answers to every question, %
	grade for every student id, and number of students who missed each
	question)
* 10 points: uses an array to store the correct answers and the number of miissed answers
* 10 points: uses `%c` to read in the answers (not `%s`)
* 10 points: uses at least one function that takes an array as input
* 5 points: source code is in a commit with tag `lab3`
* 5 points: source code is in `csci112_spring2023/labs/lab3` directory

## Go beyond
* If you made an assumption about the number of students taking the exam, try
	to change your program to not use that assumption.

## Grading turnaround
This lab will be graded within one week of its due date.
