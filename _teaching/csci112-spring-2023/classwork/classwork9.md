---
collection: teaching
title: "Classwork 9"
---

## Logistics
* Due: Wednesday, February 15th AoE.
* Submission instructions: make sure that the required file (`2d.c`) is in your
	`/classwork/week5/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using two-dimensional arrays.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week5/wed/`, creating directories `week5` and `wed` if necessary.
* Inside this directory, create a file called `2d.c`. In it, write a
	program solving the following problem.

Write a program that creates a 3 by 5 array of integers and uses it to store data from
`stdin`. Specifically, you should use `scanf` to read the integers. For
example, you may get input that looks like this:

```
12 15 19 0 4
17 16 13 21 4
22 27 30 32 12
```

You can assume that there will be exactly 3 rows (the first dimension of
your array) and exactly 5 columns (the second dimension of your array) in
the input.

After saving the data in the array, print the sum of the numbers in each row.

You can use redirection (`<`) with the file in `/public/classwork/week5/wed/input.txt` to test your
program as you are developing it. Specifically, if you compiled your source
code into a file called `exe`, you would run

```
./exe < /public/classwork/week5/wed/input.txt
```

For example, compiling and running your program should look like this:

```
[p19t655@csci112 wed]$ gcc -o exe -Wall 2d.c
[p19t655@csci112 wed]$ ./exe < /public/classwork/week5/wed/input.txt
Row 0 has total 50.
Row 1 has total 71.
Row 2 has total 123.
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
gcc -o exe -Wall 2d.c
./exe < /public/classwork/week5/wed/test_input.txt > output.txt
diff -w -i ~/classwork/week5/wed/output.txt /public/classwork/week5/wed/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly, and you used a 3 by 5 array, this means that you will get full credit for the assignment.

You can check that you used a 3 by 5 array by running
```
grep "\[3]\[5]" 2d.c
```
If you see some output (likely something like this)
```
    int nums[3][5];
```
then you are using a 3 by 5 array. If you see no output, something is wrong.

## Grading turnaround
Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt`, refreshed every 5 minutes from 8am to 11am
on the class day, and then
every hour until 6am the following day. The 6am run is the final grade. Scores will be
uploaded to D2L by the next class period.
