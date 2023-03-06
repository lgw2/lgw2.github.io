---
collection: teaching
title: "Classwork 12"
---

## Logistics
* Due: Wednesday, March 8th AoE.
* Submission instructions: make sure that the required file (`tokenize.c`) is in your
	`/classwork/week8/wed1/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using `strtok` to tokenize a string.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week8/mon/`, creating directories `week8`
and `mon` if necessary.
* Copy the file `/public/classwork/sum_and_average.c` to your current directory. That
	is, run
	```
	cp /public/classwork/week8/mon/sum_and_average.c .
	```
* In `sum_and_average.c`, complete the `sum_n_average` function so that it assigns
	the sum and and average of the array to the variables pointed to by `sum`
	and ` avg`.
* in `main`, call the `sum_n_average` function to compute the values for `sum`
	and `average`.


### Hints
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall sum_and_average.c
./exe < /public/classwork/week8/mon/example_input.txt > output.txt
diff -w -i ~/classwork/week8/mon/output.txt /public/classwork/week8/mon/expected_output.txt
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
