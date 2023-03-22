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
to store fractional values over a very large range of values with high precision, from very large (say, the diameter of the Milky Way, 10^18 kilometers),
to very small (say, the mass of an electron, 10^-27 grams), we
typically store fractional numbers as *floating point numbers*. In this
assignment, you will define a `struct` data type to represent floating point
numbers and functions that perform basic operations on them.

### Floating point numbers

The storage of a floating point number is divided into three parts: the sign (`0` for
positive numbers, `1` for negative numbers), the mantissa (represnting a
fractional number between 0.1 and 1 or -.1 and -1), and the exponent (representing the
integer to which we raise a factor of 10).

For example, the number 18.1 has a sign of `0`, a mantissa of `.181`, and an
exponent of `2` in our description. The number -0.0000786 has a sign of `1`, a
mantissa of `.786`, and an exponent of `-4`.

Note that in reality floating point numbers are represented in binary. For the
purpose of this assignment, we represent our floating point numbers in base 10,
or decimal, so we use a normal `int` to represent the exponent and a `double`
to represent the mantissa.

### Adding floating point numbers

To add floating point numbers, we need to think about exponent rules. For
example, to add .4x10^3 and .91x10^-2, we first need to convert the numbers to the
same exponent. We could choose to convert the second number to have the same
exponent as the first, so we would represent it as 0.0000091x10^3. Then, we can
add the two to get 0.4100091x10^3.

Recall that valid floating point numbers can only have mantissas between .1 and 1. If we add,
for example, 0.7x10^2+0.8x10^2, the resulting floating point number has a
mantissa of 0.15 and an exponent of 3.

Remember to deal with the sign of the numbers as well!

### Hints

* Remember that you can add a space to your `scanf` format string so that `%c`
	doesn't read in whitespace.
* The math library (use with `#include <math.h>`) has useful functions like
	`pow(a,b)` to raise `a` to the power of `b` and `fabs(a)` to return the
	absolute value of `float` or `double` `a`. (For `int` `a`, the function is
	`abs(a)`.)
* If you want to use the `math.h` library, remember to compile with `-lm`.
* Recall that structs are passed by value as a default, unlike arrays and
	strings. To pass by reference, use `&` when calling the function.

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: implement the function `scan_float_pt_t` as described above
	(recall that it must take in a pointer to a `float_pt_t`).
* 10 points: implement the function `print_float_pt_t` as described above.
* 10 points: implement the function `add_float_pt_t` as described above.
* 10 points: read in the 10 floating point numbers from `/public/labs/lab5/input.txt`
	and store them in an array of type `float_pt_t`.
* 10 points:
* 10 points: source code is in a commit with tag `lab5`
* 10 points: source code is in `csci112_spring2023/labs/lab5` directory

## Go beyond
* Implement subtraction, multipliication, and division for your floating point
	numbers.
* Think about

## Grading turnaround
This lab will be graded within one week of its due date.
