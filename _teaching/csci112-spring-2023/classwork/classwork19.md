---
collection: teaching
title: "Classwork 19"
---

## Logistics
* Due: Wednesday, April 5th AoE.
* Submission instructions: make sure that the required file (`hi.c`) is in your
	`/classwork/week11/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using header files

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week11/wed/`, creating directories `week11`
and `wed` if necessary.
* Write a C program in the file `hi.c` that takes one argument from the command line and prints
	`Hello, <arg>`! For example, if you run it with the input `Champ`, it
	should look like this:
```
[p19t655@csci112 wed]$ gcc -o hi -Wall hi.c
[p19t655@csci112 wed]$ ./hi Champ
Hello, Champ!
```


## Autograder

You can run the autograder yourself by running
```
/public/classwork/week11/wed/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
