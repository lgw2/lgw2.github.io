---
collection: teaching
title: "Classwork 17"
---

## Logistics
* Due: Wednesday, October 18th AoE.
* Submission instructions: make sure that the required file (`point.c`) is in your
	`csci112_fall2023/classwork/week9/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using header files

## Assignment

* Log in to the server.
* From your home directory, navigate to `/csci112_fall2023/classwork/week9/wed/`, creating directories `week9`
and `wed` if necessary.
* Copy the `point.c` file from `/public/classwork/week9/` to your directory.

Fill in the missing function `change_x` so that it changes the value of the `x`
field in a point that is passed in. Make sure that you define the function to
match the calls in `change_x` in `main`.

After you add the function, compiling and running your program should look like
this:

```
[p19t655@csci112 wed]$ gcc point.c -Wall
[p19t655@csci112 wed]$ ./a.out
(3.14,3.56)
(3.14,-10.46)
```

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week9/wed/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
