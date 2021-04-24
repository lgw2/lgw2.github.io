---
collection: teaching
title: "Classwork 1: Hello, World!"
venue: "May 10"
type: "Classwork"
date: 2021-05-10
---

## Logistics
* Due: Monday, May 10th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork1` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Be able to use the course Slack workspace to communicate with the instructor
	and your classmates.
* Understand the course format and the resources that are available for you to
	succeed.
* Be able to use git to version control your work.
* Be able to `ssh` into the course server and use basic Linux commands to
	navigate and perform basic tasks.
* Be able to read and edit files using vim.
* Understand the general course structure and the resources available to help
	you succeed.
* Write, compile, and run a basic C program.

## Assignment

### Part 1: Introduce yourself and explore the syllabus
* Post in the `#random` channel on Slack introducing yourself to the class. At
minimum, tell us your preferred name, your major (or intended major), and one
thing you are looking forward to during the course (can be course-related or
just something you've got going on during May or June).
* In a direct message to Lucy on Slack, send answers to the following
	questions:
	1. What time is classwork due?
	2. What time are labs and programs due?
	3. What is your github username?
	4. What part of the course makes up the most of your grade?
	5. Someone asks you for help with a lab because they are getting an error they don't understand.
	Is either of the following is okay?
	   (a) For them to send you a copy of their code for you to debug, or (b)
	   To get on a video call with them, have them share their screen, and show
	   their code to you while you talk them through debugging it?

### Part 2:
* Create a git repository named `csci112-2021-firstname-lastname` and clone it
	in your `/home/netid/` directory.
* Inside the `csci112-2021-firstname-lastname` directory, create
	following directories: `classwork`, `labs`, and `programs`.
* Inside the `classwork` directory, create another directory called
	`classwork1`. Inside that directory, create a file called `cw.c`.
	In that file, put the following:

```
#include <stdio.h>
/* <put your name>
* Classwork 1, CSCI 112
* <current date>
*/

int main(void) {
	// prints “Hello World”
	printf(“Hello World\n”);
	// exit with no errors
	return(0);
}
```
* Compile your program into an executable called `cw` and run it using `./cw`.

## Grading - 10 points
* 1 point - there is a directory called `csci112-2021-firstname-lastname` in
	your `/home/netid/` directory on the course server, containing the three
	directories listed above.
* 5 points -
* 2 points - there is a post in the #random channel on Slack including the
	information described above.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 10th).
