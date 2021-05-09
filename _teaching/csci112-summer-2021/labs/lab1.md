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
* Practice using `if` and/or `switch` statements.
* Practice using functions to organize your code.
* Get input from the user.
* Practice writing complicated output.

## Assignment

*This comes from problem 1, chapter 4 on page 232-233.*

A store provides discounts for the military based on the dollar amount of the
purchase.
In this program, you will prompt the user for the dollar amount purchased and whether they are in the military or not.
The program will then determine the discount, sales tax cost and total.
It will print out this information in a neat way.

If a person is in the military, they get a 15% discount if they spend $150 or more.
The discount for military is 10% otherwise.
If they are not in the military, they get no discount. Everyone pays a 5% sales
tax on purchases of any amount, but the 5% sale tax is applied after any
discount.

### Requirements
* Write your program in a file called `lab1.c` in your
	`csci112-firstname-lastname/labs/lab1/` directory.
* Accept only `n`, `N`, `y`, and `Y` for input as to whether the person is in
	the military or not. For any other input, print `Error: bad input` and end
	the program. (Note: actually, as long as you are using only the data types
	that we have learned about so far (`int`, `double`, and `char`,
	you can accept any inputs beginning with
	those four characters; for example, `no` would also work. If you can
	explain why this is, you can get extra credit. See the Grading section.)
* Use a separate function to compute the discount.
* Use a separate function to print the results. (This function can call the
	function that computes the discount if you like.)
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare your output with the sample
	output. Don't worry about trailing spaces.

### Example output
```
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$217
In military (y or n)?		y
Military discount (15%):	$32.55
Discounted total:		$184.45
Sales tax (5%):			$9.22
Total:				$193.67
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$80
In military (y or n)?		Y
Military discount (10%):	$8.00
Discounted total:		$72.00
Sales tax (5%):			$3.60
Total:				$75.60
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
* To print a `%`, use the format `%%`. For example, `printf(5%%)` would print
	`5%`.

## Grading - 100 points
* 10 points – includes comments explaining what your program does
* 10 points – code is indented so it is readable
* 20 points – compiles successfully with `-Wall` – no warnings
* 20 points – uses proper math equations to compute taxes and discount
* 5 points – prints the output to exactly match the sample output
* 5 points – reads in the input to exactly match the sample
* 10 points – allows `y`, `Y`, `n`, `N` as input for military question
* 10 points – prints error message if any other input for military question, exactly matching example
* BONUS: 5 points - in a comment in your program, explain why your program can
	accept longer strings of characters as long as they begin with `y`, `Y`,
	`n`, or `N`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 13th.
