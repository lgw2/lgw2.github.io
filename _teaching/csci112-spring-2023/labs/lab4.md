---
collection: teaching
title: "Lab 4"
---

## Logistics
* Due: Friday, March 10th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab4.c` in your `~/csci112_spring2023/labs/lab4`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab4`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using pointers.
* Practice reading and writing files.

## Assignment

The city of Bozeman charges water customers $$2.40 per hundred cubic feet (HCF)
of water used per month, up to 6 HCF. Additional water use is charged at $$3.31 per HCF.
Write a function `compute_charge`
that computes the total monthly charge for a customer based on the number of
HCF used that month. The function should also calculate the average cost per
HCF of the water (rounded to two decimal places), so `compute_charge` must also
take in two output parameters to send back these results.

## Grading - 100 points
**If your code does not compile, has a runtime error on the inputs shown in the example output,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 5 points: opens `/public/labs/lab4/usage.txt` for reading using `fopen`
* 5 points: opens `charges.txt` for writing using `fopen`
* 5 points: successfully reads input from file
* 5 points: successfully writes output to file
* 5 points: writes correct month and year
* 10 points: can accept any number of customers in input file
* 10 points: `compute_charge` takes in a double for HCF used, a pointer to a double for
	the charge, and a pointer to a double for the average
* 10 pooints: calls `compute_charge` to compute the charge and average cost
* 10 points: correctly computes the charge
* 5 points: correctly computes the average
* 5 points: correctly writes the id of the customer
* 5 points: closes both files
* 10 points: source code is in a commit with tag `lab4`
* 10 points: source code is in `csci112_spring2023/labs/lab4` directory

## Go beyond

## Grading turnaround
This lab will be graded within one week of its due date.
