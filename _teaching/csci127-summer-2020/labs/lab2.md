---
collection: teaching
title: "Lab 2: Functions and Selection Statements"
venue: "May 22"
type: "Lab"
date: 2019-05-22
---

## Logistics
* Due: Friday, May 22nd no later than 5pm.
* Submission instructions: upload your solution,
entitled FirstName-LastName-Lab2.py
to the BrightSpace Lab 2 Dropbox.
* Deadline reminder: once this deadline passes, BrightSpace will no longer accept your Python
submission and you will no longer be able to earn credit. Thus, if you are not able to fully
complete the assignment, submit whatever you have before the deadline so that partial credit can be earned.

## Learning outcomes
* Gain experience writing a Python function.
* Gain experience writing Python selection statements.

## Assignment
* Download [taxes.py](https://lgw2.github.io/teaching/csci127-summer-2020/labs/taxes.py)
and rename it according to the instructions above.
* Modify the program by adding the missing function.
The missing function will use Python selection statements to calculate the amount
of tax that a single (unmarried) taxpayer owes using the table below.

If the missing function is implemented correctly,
[this output](https://lgw2.github.io/teaching/csci127-summer-2020/labs/taxes-output.txt) will appear.

Note: the federal tax is progressive.
For example, if a person has a taxable income of 15,000, the first 9,700 is taxed at a
rate of 10% and the remaining 5,300 is taxed at a rate of 12%.

|Rate|For Unmarried Individuals, Taxable Income Over|
|:---|:---|
|10%|$0|
|12%|$9,700|
|22%|$39,475|
|24%|$84,200|
|32%|$160,725|
|35%|$204,100|
|37%|$510,300|

## Grading - 10 points
* 7 points - Your program calculates the income tax for each of the seven test cases correctly
 (1 point each).
* 3 points - A function with the correct name (1 point), correct parameters (1 point)
and correct return value (1 point) is used in the solution.

## Grading turnaround
All labs graded with scores recorded in BrightSpace before office hours the
following class day.
