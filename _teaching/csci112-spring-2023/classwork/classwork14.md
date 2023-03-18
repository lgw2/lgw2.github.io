---
collection: teaching
title: "Classwork 14"
---

## Logistics
* Due: Monday, March 20th AoE.
* Submission instructions: make sure that the required file (`swap.c`) is in your
	`/classwork/week9/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using an array of pointers to store a different ordering of strings
	without making a copy

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week9/mon/`, creating directories `week9`
and `mon` if necessary.
* Copy the file `/public/classwork/week9/mon/swap.c` to your current directory.
* In `swap.c`, fill in the code described under `TODO`.


### Hints
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall swap.c
./exe < /public/classwork/week9/mon/example_input.txt > output.txt
diff -w -i ~/classwork/week9/mon/output.txt /public/classwork/week9/mon/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly,  this means that you will get full credit for the assignment.

## Grading turnaround

Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt`, refreshed every 5 minutes from 8am to 11am
on the class day, and then
every hour until 6am the following day. The 6am run is the final grade. Scores will be
uploaded to D2L by the next class period.
