---
collection: teaching
title: "Classwork 7"
---

## Logistics
* Due: Wednesday, February 8th AoE.
* Submission instructions: make sure that the required file (`loops.c`) is in your
	`/classwork/week4/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using nested loops.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week4/wed/`, creating directories `week4` and `wed` if necessary.
* Inside this directory, create a file called `loops.c`. In it, write a
	program solving the following problem.

Prompt the user to enter a small positive integer. Based on that number, print
a pattern like the following:

```
Enter a positive integer: 5
0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5
```

or the following:

```
Enter a positive integer: 8
0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5
0 1 2 3 4 5 6
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7 8
```


### Hints
* It is standard to include a newline (`\n`) at the end of the last line of any
	file; thus, your final print statement should include a newline at the end.
	If you get the error `\ No newline at end of file` in your `diff` below,
	it's because you're missing the newline.
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall loops.c
./exe < /public/classwork/week4/wed/test_input.txt > output.txt
diff -w -i ~/classwork/week4/wed/output.txt /public/classwork/week4/wed/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly, this means that you will get full credit for the assignment.

## Grading turnaround
Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt`, refreshed every 5 minutes from 8am to 11am
on the class day, and then
every hour until 6am the following day. The 6am run is the final grade. Scores will be
uploaded to D2L by the next class period.
