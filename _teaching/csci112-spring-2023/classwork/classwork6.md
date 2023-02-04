---
collection: teaching
title: "Classwork 6"
---

## Logistics
* Due: Monday, February 6th AoE.
* Submission instructions: make sure that the required file (`grade.c`) is in your
	`/classwork/week4/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using a `switch` statement.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week4/mon/`, creating directories `week4` and `mon` if necessary.
* Inside this directory, create a file called `grade.c`. In it, write a
	program solving the following problem.

Prompt the user for their grade. Then, using a `switch` statement, report back
the minimum points they earned in the course. (Consult the [grades section of the syllabus]( https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#grading). You should allow both capital and lowercase letters for grades A, B, C, and D. You must match the output
formatting below and you must use a `switch` statement.

```
[p19t655@csci112 mon]$ ./exe
Enter the grade you got: 5
You earned an unknown number of points in the class.
[p19t655@csci112 mon]$ ./exe
Enter the grade you got: A
You earned at least 93 points in the class.
[p19t655@csci112 mon]$ ./exe
Enter the grade you got: f
You earned an unknown number of points in the class.
[p19t655@csci112 mon]$ ./exe
Enter the grade you got: d
You earned at least 63 points in the class.
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
gcc -o exe -Wall grade.c
./exe < /public/classwork/week4/mon/test_input1.txt > output.txt
diff -w -i ~/classwork/week4/mon/output.txt /public/classwork/week4/mon/expected_output1.txt
./exe < /public/classwork/week4/mon/test_input2.txt > output.txt
diff -w -i ~/classwork/week4/mon/output.txt /public/classwork/week4/mon/expected_output2.txt
./exe < /public/classwork/week4/mon/test_input3.txt > output.txt
diff -w -i ~/classwork/week4/mon/output.txt /public/classwork/week4/mon/expected_output3.txt
./exe < /public/classwork/week4/mon/test_input4.txt > output.txt
diff -w -i ~/classwork/week4/mon/output.txt /public/classwork/week4/mon/expected_output4.txt
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
