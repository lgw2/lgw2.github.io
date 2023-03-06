---
collection: teaching
title: "Program 1"
---

## Logistics
* Due: Friday, March 24th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `program1.c` in your `~/csci112_spring2023/programs/program1`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `program1`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice input and output with strinigs
* Practice reading from files using `fgets`
* Practice sorting
* Practice tokenizing strings using `strtok`

## Assignment

You are to write a program that will read information about nobel prize winners
since 2002. Read the file `/public/programs/program1/nobel.csv'. Write the
winners in alphabetical order by first name to a file called `winners.txt` in
the same directory as your program. Write the first and last name, university,
and year. For example, the first line of `winners.txt` could look like:

```
Aaron Ciechanover of Technion - Israel Institute of Technology won in 2004
```

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 5 points: opens `/public/programs/program1/nobel.csv` for reading using `fopen`
* 5 points: opens `winners.txt` for writing using `fopen`
* 5 points: successfully reads input from file
* 5 points: successfully writes output to file
* 5 points: writes correct month and year
* 10 points: can accept any number of customers in input file
* 10 points: `compute_charge` takes in a double for HCF used, a pointer to a double for
	the charge, and a pointer to a double for the average
* 10 pooints: calls `compute_charge` to compute the charge and average cost for
	each customer
* 10 points: correctly computes the charge
* 5 points: correctly computes the average
* 5 points: correctly writes the ID of the customer
* 5 points: closes both files
* 10 points: source code is in a commit with tag `program1`
* 10 points: source code is in `csci112_spring2023/programs/program1` directory

## Go beyond

## Grading turnaround
This lab will be graded within one week of its due date.
