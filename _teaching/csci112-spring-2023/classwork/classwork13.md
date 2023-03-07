---
collection: teaching
title: "Classwork 13"
---

## Logistics
* Due: Wednesday, March 8th AoE.
* Submission instructions: make sure that the required file (`tokenize.c`) is in your
	`/classwork/week8/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using `strtok` to tokenize a string.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week8/wed/`, creating directories `week8`
and `wed` if necessary.
* Copy the file `/public/classwork/week8/wed/tokenize.c` to your current directory. That
	is, run
	```
	cp /public/classwork/week8/wed/tokenize.c .
	```
* In `tokenize.c`, fill in the code described under `TODO`.


### Hints
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall tokenize.c
./exe > output.txt
diff -w -i ~/classwork/week8/wed/output.txt /public/classwork/week8/wed/expected_output.txt
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
