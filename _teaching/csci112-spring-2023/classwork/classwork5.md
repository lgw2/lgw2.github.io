---
collection: teaching
title: "Classwork 5"
---

## Logistics
* Due: Wednesday, February 1st AoE.
* Submission instructions: make sure that the required file (`remainder.c`) is in your
	`/classwork/week3/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Write a function that takes in two inputs and returns one output.
* Use a function prototype and define your function below `main`.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week3/wed/`, creating directories `week2` and `wed` if necessary.
* Inside this directory, create a file called `remainder.c`. In it, write a
	program solving the following problem.

Prompt the user for two integers, one to use a dividend and one to be used as a
divisor. Write a function `rem` that takes in both integers and returns the
remainder when dividing the dividend by the divisor. In `main`, print the
dividend, divisor, and remainder.

```
Please enter two integers separated by white space: 12 4
When dividing 12 by 4, we get a remainder of 0.
```

Use a function prototype and define your function below main, like this:

```c
// function prototype for rem here

int main(void) {
	// call rem in here
}

// define rem here
```

### Hints
* The `%` (mod operator) computes the remainder. For example, `12 % 4` returns
	`0`, whereas `22 % 10` returns `2`.
* Develop your program in steps, checking that it compiles and runs after every
	significant change.
* It is standard to include a newline (`\n`) at the end of the last line of any
	file; thus, your final print statement should include a newline at the end.
	If you get the error `\ No newline at end of file` in your `diff` below,
	it's because you're missing the newline.
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall remainder.c
./exe < /public/classwork/week3/wed/test_input.txt > output.txt
diff -w ~/classwork/week3/wed/output.txt /public/classwork/week3/wed/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly, this means that you will get full credit for the assignment.

## Grading turnaround
Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt`, refreshed every 5 minutes during class and
every hour until 6am the following day. The 6am run is the final grade. Scores will be
uploaded to D2L by the next class period.
