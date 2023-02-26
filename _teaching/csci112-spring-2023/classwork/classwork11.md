---
collection: teaching
title: "Classwork 11"
---

## Logistics
* Due: Wednesday, March 1st AoE.
* Submission instructions: make sure that the required file (`read_file.c`) is in your
	`/classwork/week7/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice reading and writing using a file pointer in C.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week7/wed/`, creating directories `week7` and `wed` if necessary.
* Create a file called `read_file.c`, and inside it write a C program that does
	the following:

Use `fopen` to open the file `/public/classwork/week7/wed/input.txt`, read the
doubles it contains, and print their maximum value to a file called `max.txt`
in the same directory as your `read_file.c` file. You can assume that the input
file contains exactyly 5 doubles.

### Hints
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall read_file.c
./exe
diff -w -i ~/classwork/week7/wed/max.txt /public/classwork/week7/wed/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly,  this means that you will get full credit for the assignment.

## Grading turnaround
Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt`, refreshed every 2 minutes from 8am to 11am
on the class day, and then
every hour until 6am the following day. The 6am run is the final grade. Scores will be
uploaded to D2L by the next class period.
