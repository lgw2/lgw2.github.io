---
collection: teaching
title: "Classwork 17"
---

## Logistics
* Due: Wednesday, March 29th AoE.
* Submission instructions: make sure that the required files (`locations.c`, `coordinates.h`,`location.h`) are in your
	`/classwork/week10/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using header files

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week10/wed/`, creating directories `week10`
and `wed` if necessary.
* Copy your `locations.c` file from Monday's classwork, or copy the solution
	from `/public/classwork/week10/mon/solution.c` into a `locations.c` file.
* Move the `Location` struct definition to a header file called `location.h`.
* Move your other struct definition to a header file called `coordinates.h`.
* Make sure you include `location.h` and `coordinates.h` where they are needed!

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week10/wed/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
