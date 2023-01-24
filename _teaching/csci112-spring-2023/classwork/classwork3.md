---
collection: teaching
title: "Classwork 3"
---

## Logistics
* Due: Wednesday, January 25th AoE.
* Submission instructions: make sure that the required file (`gotham.c`) is in your
	`/classwork/week2/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Use a function to organize your program.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week2/wed/`, creating directories `week2` and `wed` if necessary.
* Inside this directory, create a file called `gotham.c`. In it, write a
	program solving the following problem:

*This comes from problem 13, chapter 3 on page 171.*

After studying the population growth of Gotham City in the last decade of the
20th century, we have modeled Gotham's population as

```
P(t) = 52.966 + 2.184t
```
where `t` is years after 1990, and `P` is population in thousands. Thus, `P(0)`
represents the population in 1990, which was 52.966 thousand people. Write a
program that defines a function named `get_population` that takes in an `int` for the
years after 1990 and returns a `double` for the population (in thousands). Your program should call
the function and interact with the user as follows:
```
Enter a year after 1990> 2015
Predicted Gotham City population for 2015 (in thousands):
107.566000
```
*Note that there is a new line at the end of the last line!*

### Hints
* Develop your program in steps, checking that it compiles and runs after every
	significant change.
* Use comments to organize your program.
* It is standard to include a newline (`/n`) at the end of the last line of any
	file; thus, your final print statement should include a newline at the end.
	If you get the error `\ No newline at end of file` in your `diff` below,
	it's because you're missing the newline.
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall gotham.c
./exe < /public/classwork/week2/wed/test_input.txt > output.txt
diff ~/classwork/week2/wed/output.txt /public/classwork/week2/wed/expected_output.txt
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
