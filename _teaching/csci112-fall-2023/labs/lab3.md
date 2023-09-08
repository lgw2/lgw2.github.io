---
collection: teaching
title: "Lab 3"
---

## Logistics
* Due: Friday, September 15th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab3.c` in your `~/csci112_fall2023/labs/lab3`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab3`. (You should have set up your `git` repo and practiced tagging a commit in [Classwork 4](https://lgw2.github.io/teaching/csci112-fall-2023/classwork/classwork4/).)

## Outside resources

On this assignment, you may not use the the internet or generative AI such as
ChatGPT to solicit solutions to the programming part of the assignment. If you
are having trouble writing your program, please go to lab (Fridays, 12-4 in
Roberts 111) or post in Discord to
get help.

However, you may use those resources for help with navigating the Linux
terminal, using vim, and using git, although you may get better answers to your
questions by going to lab or posting on Discord anyway.

## Learning outcomes
* Practice using `if` and/or `switch` statements.
* Practice using functions to organize your code.
* Get input from the user.
* Practice writing complicated output.

## Assignment

As a software developer for a chemistry lab, you have been asked to write a
program that helps chemists identify a substance given its boiling point. Here
is a table of the substances that your lab is interested, and their boiling
points:

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

Because your boss anticipates that you and your fellow software engineers will
need to write many programs that check whether a given value is inside some
range, they have asked that you write and call a specific function that can be reused in other programs.

Your program must define and call a function `within_x_percent` that takes as
a parameter a reference value `ref`, a data value `data`, and a percentage
value `x` and returns 1 meaning true if `data` is within `x`% of `ref` --- that
is, (`ref - x% * ref`) $\leq$ `data` $\leq$  (`ref + x% * ref`). Otherwise
`within_x_percent` should return zero, meaning false. For example, the call
`within_x_percent(357, 323, 10)` would return 1 for true, since 10% of 357 is 35.7,
and 323 falls between 321.3 and 392.7. **You must use this function to decide
what the substance is.**

### Input/output format

For this assignment, you must match the output format exactly, and take input
from the user precisely as described.

For each of the three days, you must prompt the user for the number of hours
they worked and the wage for that day.

After receiving information about the hours worked and wage for each day,
report the total pay that you are owed.

Thus, a full run of your program would look like this if you entered `3`,
`21.40`, `5`, `25`, `8`, and `33.33`:

```
Enter hours worked on day 1: 3
Enter hourly wage on day 1: $21.40
Enter hours worked on day 2: 5
Enter hourly wage on day 2: $25
Enter hours worked on day 3: 8
Enter hourly wage on day 3: $33.33

Your total pay is $455.84
```

You can assume that the hours worked will always be a whole number.

## Grading--100 points
* 5: source file exists with correct name in correct location
* 10: source file compiles
* 5: source file compiles without warnings
* 10: defines function `within_x_percent` to take in three doubles and return an
	int
* 10: the function `within_x_percent` returns 1 if the `data` value is within
	`percent` of the `ref` value and 0 otherwise
* 10: calls function `within_x_percent` decide what the substance is
* 5: the user is prompted to give a custom error percent; if not, uses default
	of 5%
* 5: accepts `n` and `N` for no and `y` and `Y` for yes for giving a custom
	error percent
* 10: for everything else, prints `Error: bad input` and quits the program
* 5: prompts to user match exactly
* 5: outputs to user match exactly
* 10: prints the correct substance given the temperature and error bound. If
	multiple match, prints the one with the smaller boiling point.
* 10: prints the message `Substance unknown` if the entered temperature is not
	within the given percent of any of the substances' boiling points.

### Autograder

An autograder for this assignment will be available before the due date.

## Grading turnaround
Scores will be uploaded to D2L by class time on Wednesday, Septmber 20th.
