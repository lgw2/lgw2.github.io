---
collection: teaching
title: "Classwork 22"
---

## Logistics
* Due: Wednesday, April 26th AoE.
* Submission instructions: make sure that the required file (`find_and_delete.c`) is in your
	`/classwork/week14/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice writing a linked list function

## Assignment

If on campus and connected to a MSU network:
* Log in to the server.
* From your home directory, navigate to `classwork/week14/wed/`, creating directories `week14`
and `wed` if necessary.
* Copy the `find_and_delete.c` file from `/public/classwork/week14/wed` and fill in
	`delete_digit` so that it finds the node with the given integer value and
    deletes it from the list. You are *not* required to free the memory. (You
    will get practice with this on Lab 7.) However, do be sure that you deal
    with the case when the node to delete is the first one!

If off campus:
* Copy the code below. Using a C compiler of your choice (if you don't have
	one, use https://www.jdoodle.com/c-online-compiler/), fill in the
	`create_new_digit` function as described above so that the program prints
```
List is:
1->4->9->16->25->36->49->64->81->
List is:
4->9->16->25->36->49->
```
* In a DM to Lucy on Discord, copy your code. Surround your code with three
    backticks (\`\`\`) on the first line and last line so that Discord doesn't
    think asterisks are meant to italicize.

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week14/wed/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

For those who DM their code, if your program has the output
```
List is:
1->4->9->16->25->36->49->64->81->
List is:
4->9->16->25->36->49->
```
you will get full credit.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
