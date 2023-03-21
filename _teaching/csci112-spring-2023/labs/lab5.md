---
collection: teaching
title: "Lab 4"
---

## Logistics
* Due: Friday, March 31st AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab5.c` in your `~/csci112_spring2023/labs/lab5`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab5`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using structure data types
* Gain a basic understanding of how floating point data works

## Assignment

*The following description of floating point numbers is based off of the
description on pages 56-57 of the textbook.*

All data in computer memory is represented as strings of 0's and 1's. In order
to store fractional values over a very large range, from very large to very small, we
typically store fractional numbers as *floating point numbers*. In this
assignment, you will define a `struct` data type to represent floating point
numbers and functions that perform basic operations on them.

### Floating point numbers

The storage of a `double` is divided into three parts: the sign (`0` for
positive numbers, `1` for negative numbers), the mantissa (represnting a
fractional number), and the exponent (an integer).

Note that in reality floating point numbers are represented in binary. For the
purpose of this assignment, we represent our floating point numbers in base 10,
or decimal, so we use a normal `int` to represent the exponent and a `double`
to represent the mantissa.

### Adding, subtracting, and multiplying

### Specification

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: source code is in a commit with tag `lab5`
* 10 points: source code is in `csci112_spring2023/labs/lab5` directory

## Grading turnaround
This lab will be graded within one week of its due date.
