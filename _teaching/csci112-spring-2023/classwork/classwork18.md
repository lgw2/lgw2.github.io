---
collection: teaching
title: "Classwork 18"
---

## Logistics
* Due: Monday, April 3rd AoE.
* Submission instructions: make sure that the required files (`lab3.c`, `lab3.h`,`print.c.`, `read.c`, `Makefile`) are in your
	`/classwork/week11/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice writing Makefiles

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week11/mon/`, creating directories `week11`
and `mon` if necessary.
* Copy `lab3.c`, `lab3.h`, `print.c`, and `read.c` from
	`/public/classwork/week11/mon/`, or take the solution file from
	`/public/labs/lab3/` and split it into those four files.
* Write a makefile in a file called `Makefile` that builds the executable
	`lab3`. It should have four rules: one to link the three object files, and
	one to compile the object file for each C file. If you would like, you can
	copy `/public/classwork/week11/mon/Makefile` to get you started.
* Remember that Lab 3 takes in an input file via redirection. To test your
	executable, you will need to run
```
./lab3 < /public/labs/lab3/testdata.txt
```

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week11/mon/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

You can see the output that `make` got when it was run by the autograder in `tmp_make_output.txt`. Looking at this may help if you are not getting full credit due to a `make` issue.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
