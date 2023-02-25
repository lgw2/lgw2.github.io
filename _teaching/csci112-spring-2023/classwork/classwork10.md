---
collection: teaching
title: "Classwork 10"
---

## Logistics
* Due: Monday, February 27th AoE.
* Submission instructions: make sure that the required file (`sort_ints.c`) is in your
	`/classwork/week7/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice sorting arrays using selection sort.
* Practice adding to existing code.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week7/mon/`, creating directories `week7` and `mon` if necessary.
* From inside your `/classwork/week7/mon` directory, copy the file
	`/public/examples/chap7/sort_ints.c` into a file called `sort_ints.c`. That
	is, run
```
cp /public/examples/chap7/sort_ints.c .
```
* Compile and run `sort_ints.c`, redirecting the input to the file
	`/public/examples/chap7/numbers.txt`. That is, if you compile your source code into an
	executable called `sort`, you would run `sort <
	/public/examples/chap7/numbers.txt`. Notice that the program does not
	currently sort the input.
* Edit the `SelectionSort` function so that it implements selection sort on an
	integer array. You will want to look at the rest of the code and the
	comments to understand what the program is doing.
* Note that you should *not* edit any other function, and you should keep the
	call to `Print` at the end of the outer for loop in `SelectionSort` so that you print the
	array.

### Hints
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall sort_ints.c
./exe < /public/examples/chap7/numbers.txt > output.txt
diff -w -i ~/classwork/week7/mon/output.txt /public/classwork/week7/mon/expected_output.txt
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
