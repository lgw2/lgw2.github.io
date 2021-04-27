---
collection: teaching
title: "Lab 1"
---

## Logistics
* Due: Wednesday, May 12th no later than 11:59pm.
* Submission instructions: push a commit with the tag `lab1` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Write your first C program.
* Practice using `if` statements.
* Practice using functions to organize your code.
* Get input from the user.
* Practice writing complicated output.

## Assignment

*This comes from problem 1, chapter 4 on page 232-233.*

A store provides discounts for the military based on the amount.
In this program, you will prompt the user for the dollar amount purchased and whether they are in the military or not.
It will then determine the discount, sales tax cost and total.
It will print out this information in a neat way.

If a person is in the military, they get a 15% discount if they spend $150 or more.
The discount for military is 10% otherwise.
If they are not in the military, they get no discount. Everyone pays a 5% sales
tax on purchases of any amount.

### Requirements
* Write your program in a file called `lab1.c` in your
	`csci112-firstname-lastname/labs/lab1/` directory.
* Do not use globals.
* Accept only `n`, `N`, `y`, and `Y` for input as to whether the person is in
	the military or not. For any other input, print `Error: bad input` and end
	the program.
* You may assume your user will always enter an integer when prompted for the
	dollar amount of their purchase.
* Use a separate function to compute the discount.
* Use a separate function to print the results. (This function can call the
	function that computes the discount if you like.)

### Example output
```
TODO
```

### Hints
* Use `\t` to add tabs to your output.
* To print a `%`, use the format `%%`.

## Grading - 100 points
* 10 points – includes comments explaining what your program does
* 10 points – code is indented so it is readable
* 20 points – compiles successfully with `-Wall` – no warnings
* 20 points – uses proper math equations to compute taxes and discount
* 5 points – prints the output to exactly match the sample output
* 5 points – reads in the input to exactly match the sample
* 10 points – allows `y`, `Y`, `n`, `N` as input for military question
* 10 points – prints error message if any other input for military question, exactly matching example

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 13th.
