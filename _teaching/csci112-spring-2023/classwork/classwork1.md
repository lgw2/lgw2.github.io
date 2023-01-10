---
collection: teaching
title: "Classwork 1: Getting started with Linux, vim, and the course server"
---

## Logistics
* Due: Friday, January 20th AoE (Saturday 6am Bozeman time).
* Submission instructions: make sure that the required file is in your
	`/classwork/week1/fri/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Be able to `ssh` into the course server and use basic Linux commands to
	navigate and perform basic tasks.
* Be able to read and edit files using vim.
* Understand how you will complete classwork assignments in this course.

## Assignment

* If on Windows, download [Cygwin](https://www.cygwin.com/) (see
	"Installing Cygwin" section), open it, and use as you would the Mac/Linux
	terminal in the next step.
* Log in to the server: open a terminal window and type

```
ssh [netid]@csci112.cs.montana.edu
```

* Enter your netid password when prompted.
* Use `mkdir` to create a `classwork` directory.
* Use `cd` to navigate into the `classwork` directory.
* Repeat the same process to create a `week1` directory and navigate into it.
* Create another directory inside `week1` called `fri` and navigate into that.
* Inside `fri`, use `vim` (or a text editor of your choice) to create a file
	called `example.txt`. Inside it, write the text `Hello, world!`.
* You can check that you will get full credit for this assignment by running
```
diff example.txt /public/classwork/week1/fri/expected_output.txt
```
You will see any differences between your file and the expected file on the
screen. If nothing happens, the content of your file exactly matches the
expected content. As long as your file is in the correct place and named
correctly, this means that you will get full credit for the assignment.

## Grading turnaround
TBD.
