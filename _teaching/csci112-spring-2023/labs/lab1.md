---
collection: teaching
title: "Lab 1"
---

## Logistics
* Due: Friday, February 10th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab1.c` in your `~/csci112_spring2023/labs/lab1`
	directory, and that the file you want us to grade has been committed and
	tagged as `lab1`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it (i.e., by 6am on Sunday, February 12th) you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using `if` and/or `switch` statements.
* Practice using functions to organize your code.
* Get input from the user.
* Practice writing complicated output.

## Assignment

*This is adapted from problem 11, chapter 4 on page 234.*

The table below shows the normal boiling points of several substances. Write a
program that prompts the user for the observed boiling point of a substance in
degrees Celcius and identifies the substance if the observed boiling point is
within 5% of the expected boiling point. If the data input is more than 5%
higher or lower than any of the boiling points in the table, the program should
output the message `Substance unknown`.


|Substance|Normal Boiling Point (degrees Celcius)|
|:---|:---|
|Water|100|
|Mercury|357|
|Copper|1187|
|Silver|2193|
|Gold|2660|


### Requirements
* **You must submit code that compiles and runs on the sample input below. Code
	that does not compile and run will receive an automatic 0.**
* Write your program in a file called `lab1.c` in your
	`csci112_spring2023//labs/lab1/` directory.
* Your program must define and call a function `within_x_percent` that takes as
a parameter a reference value `ref`, a data value `data`, and a percentage
value `x` and returns 1 meaning true if `data` is within `x`% of `ref` --- that
is, (`ref - x% * ref`) $\leq$ `data` $\leq$  (`ref + x% * ref`). Otherwise
`within_x_percent` should return zero, meaning false. For example, the call
`within_x_percent(357, 323, 10)` would return 1 for true, since 10% of 357 is 35.7,
and 323 falls between 321.3 and 392.7.
* When telling the user what value they entered, only print two decimal places.

* Use a separate function to print the results. (This function can call the
	function that computes the discount if you like.)

### Example output
```
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in degrees Celcius)? 104.5
The substance is most likely water. Water's normal boiling point is 100 degrees
Celcius.
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in degrees Celcius)? 104.5
Identified substance: water
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$115
In military (y or n)?		n
Sales tax (5%):			$5.75
Total:				$120.75
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$20
In military (y or n)?		x
Error: bad input
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$20
In military (y or n)?		No
Sales tax (5%):			$1.00
Total:				$21.00
```

### Hints
* If you are having trouble reading in a `char`, you may need to add a space so
	that `scanf` doesn't consume whitepsace from a previous `printf`. See [this
	stackoverlow
	post](https://stackoverflow.com/questions/13542055/how-to-do-scanf-for-single-char-in-c/13543113).
* Use `\t` to add tabs to your output.
* To print a `%`, use the format `%%`. For example, `printf("5%%")` would print
	`5%`.

## Grading - 100 points
* 10 points – includes comments explaining what your program does
* 10 points – code is indented so it is readable
* 10 points – compiles without warnings when using `-Wall`
* 10 points – the function `within_x_percent` is defined outside of `main`.
* 10 points – the function `within_x_percent` is called to decide what
	substance it is.
* 20 points – the function `within_x_percent` returns 0 if the `data` value is
	within `percent` of the `ref` value and 1 otherwise.
* 20 points – the
* 10 points – prints the message `Substance unknown` if the entered temperature
	is not within 5% of any of the substances' boiling pooints.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 13th.
