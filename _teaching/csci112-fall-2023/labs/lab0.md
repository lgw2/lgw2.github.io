---
collection: teaching
title: "Lab 0"
---

## Logistics
* Due: Friday, September 1.
* Submission instructions: make a commit with the tag `lab0` in your course
	repo on the server.

## Learning outcomes
* Make sure that your `git` repository is set up correctly.
* Stage, commit, and tag the state of your repository.
* Use prepocessor directives (`#include`, `#define`).
* Get input from the console.
* Do a basic calculation.
* Print and format output.
* Become familiar with the autograder for labs.

## Outside resources

On this assignment, there are NO RESTRICTIONS on the use of outside resources
for help in any way, including AI tools like ChatGPT. Please do not post your
completed assignment on the Discord, however, for those who would like to write
the code themselves without hints.

## Assignment

Write a program that estimates the temperature in a freezer (in degrees
Celsius) given the elapsed time (hours) since a power failure. Assume this
temperature ($T$) is given by

$$T=\frac{3t^2}{t+1} - 10$$

where $t$ is the time since the power failure. Your program should prompt the
user to enter how long it has been since the start of the power failure in
whole hours and minutes. Note that you will need to convert the elapsed time
into hours. For example, if the user entered 2 30 (2 hours 30 minutes), you
would need to convert this to 2.5 hours.

### Example output

### Hints

## Grading - 100 points
* 10 points – includes comments explaining what your program does
* 10 points – code is indented so it is readable
* 10 points – compiles successfully with `-Wall` – no warnings
* 5 points – discount is computed in own function
* 5 points - a separate function is used to print the results
* 20 points – uses proper math equations to compute taxes and discount
* 10 points – prints the output to exactly match the sample output
* 10 points – reads in the input to exactly match the sample
* 10 points – allows `y`, `Y`, `n`, `N` as input for military question
* 10 points – prints error message if any other input for military question, exactly matching example
* BONUS: 5 points - in a comment in your program, explain why your program can
	accept longer strings of characters as long as they begin with `y`, `Y`,
	`n`, or `N`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 13th.