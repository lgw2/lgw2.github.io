---
collection: teaching
title: "Lab 1"
---

## Logistics
* Due: Friday, February 10th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab1.c` in your `~/csci112_spring2023/labs/lab1`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab1`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on Gradescope, so you can see comments and
	and detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it (i.e., by 6am on Sunday, February 12th) you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using `if` and/or `switch` statements.
* Practice using functions to organize your code.
* Get input from the user.
* Practice writing complicated output.

## Assignment

*This is adapted from problem 11, chapter 4 on page 234.*

The table below shows the normal boiling points of several substances.

|Substance|Normal Boiling Point (degrees Celsius)|
|:---|:---|
|Water|100|
|Mercury|357|
|Copper|1187|
|Silver|2193|
|Gold|2660|

Write a
program that prompts the user for the observed boiling point of a substance in
degrees Celsius, prints the number they entered with only two decimal places,
and then prompts them to custom an error percent. Then, identify the substance
if the observed boiling point is within that percent of the expected boiling
point. If the data input is outside of range for all of the boiling points in
the table, the program should
output the message `Substance unknown`.

For example, if the user selects an error percent of 5%,
your program should identify the substance that is
within 5% of the expected boiling point. If the data input is more than 5%
higher or lower than any of the boiling points in the table, print the above
message.

You should use a default percent of 5 if the user does not want to enter a
custom percent.


### Requirements
* **You must submit code that compiles and runs on the sample input below. Code
	that does not compile and run on the sample input will receive an automatic 0.**
* Write your program in a file called `lab1.c` in your
	`csci112_spring2023/labs/lab1/` directory.
* Your program must define and call a function `within_x_percent` that takes as
a parameter a reference value `ref`, a data value `data`, and a percentage
value `x` and returns 1 meaning true if `data` is within `x`% of `ref` --- that
is, (`ref - x% * ref`) $\leq$ `data` $\leq$  (`ref + x% * ref`). Otherwise
`within_x_percent` should return zero, meaning false. For example, the call
`within_x_percent(357, 323, 10)` would return 1 for true, since 10% of 357 is 35.7,
and 323 falls between 321.3 and 392.7.
* When telling the user what value they entered, only print two decimal places.
* When prompting the user to enter a custom error percent, accept `n` and `N`
	for no and `y` and `Y` for yes. For anything else, print `Error: bad input`
	and quit the program.
* If multiple substances are valid for the given temperature and error percent,
	print the substance with the lowest temperature that matches.

### Example output
```
[p19t655@csci112 lab1]$ pwd
/home/p19t655/csci112_spring2023/labs/lab1
[p19t655@csci112 lab1]$ gcc -o lab1 -Wall lab1.c
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 101
You entered 101.00
Custom error percent? n for no (5% default), y for yes: n
Substance is water
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 500
You entered 500.00
Custom error percent? n for no (5% default), y for yes: n
Substance unknown
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 400
You entered 400.00
Custom error percent? n for no (5% default), y for yes: y
Enter error percent: 10
You entered 10.00 percent
Substance unknown
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 400
You entered 400.00
Custom error percent? n for no (5% default), y for yes: y
Enter error percent: 15
You entered 15.00 percent
Substance is mercury
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 400
You entered 400.00
Custom error percent? n for no (5% default), y for yes: 15
Error: bad input
[p19t655@csci112 lab1]$ ./lab1
Observed boiling point (in deg. C)? 2200
You entered 2200.00
Custom error percent? n for no (5% default), y for yes: y
Enter error percent: 50
You entered 50.00 percent
Substance is silver
```


## Grading - 100 points
**If your code does not compile, has a runtime error on the inputs shown in the example output,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 5 points: includes comments explaining what your program does
* 5 points: code is indented so it is readable
* 10 points: compiles without warnings when using `-Wall`
* 10 points: the function `within_x_percent` is defined outside of `main`
* 10 points: the function `within_x_percent` is called to decide what
	substance it is
* 10 points: the function `within_x_percent` returns 1 if the `data` value is
	within `percent` of the `ref` value and 0 otherwise.
* 5 points: the user is prompted to give a custom error percent; if not, uses
	default of 5%
* 5 points: accepts `n` and `N`
	for no and `y` and `Y` for yes for giving a custom error percent
* 10 points: for anything else, prints `Error: bad input`
	and quit the program.
* 5 points: prints the entered temperature and entered percent with
	two decimal places
* 5 points: only prompts the user to enter a percent if they say they want to
	enter a custom percent
* 10 points: print the correct substance given the temperature and error bound
	(if multiple match, print the one with the smaller substance, or do what is
	described in the go beyond section below)
* 10 points: prints the message `Substance unknown` if the entered temperature
	is not within 5% of any of the substances' boiling points.


### Hints
* If you are having trouble reading in a `char`, you may need to add a space so
	that `scanf` doesn't consume whitespace from a previous `printf`. See [this
	stackoverlow
	post](https://stackoverflow.com/questions/13542055/how-to-do-scanf-for-single-char-in-c/13543113).
* To print a `%`, use the format `%%`. For example, `printf("5%%")` would print
	`5%`.
* Think about what `main` returns in order to quit the program early.

## Grading turnaround
This classwork will be graded within one week of its due date.

## Go beyond
Not required, but here are some things to try if you would like.
* If multiple substances are valid matches, print all of them (with nice
	formatting) instead of just the one with the smallest boiling point.
* You may notice that your code accepts any input for the yes/no question that
	starts with `y`, `Y`, `n`, or `N`, not just single letters. In a comment in
	your code, write why this is.
