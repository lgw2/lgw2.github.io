---
collection: teaching
title: "Classwork 7"
---

## Logistics
* Due: Monday, February 13th AoE.
* Submission instructions: make sure that the required file (`min.c`) is in your
	`/classwork/week5/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice using the conditional operator.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week5/mon/`, creating directories `week5` and `mon` if necessary.
* Inside this directory, create a file called `min.c`. In it, write a
	program solving the following problem.

Prompt the user to enter two characters. Use the **conditional operator** to find
the minimum (according to their ASCII codes) of the characters and print it
back to the user.

Note that the user should be able to input their characters separated by
whitespace if they would like.

For example, compiling and running your program should look like this:

```
[p19t655@csci112 mon]$ gcc -o min -Wall min.c
[p19t655@csci112 mon]$ ./min
Enter two characters: a A
Min is A
[p19t655@csci112 mon]$ ./min
Enter two characters: 6 n
Min is 6
[p19t655@csci112 mon]$ ./min
Enter two characters: y x
Min is x
[p19t655@csci112 mon]$ ./min
Enter two characters: P A
Min is A
```

Optionally (you will not be graded on this), you can try using redirection to
write your output to a file and/or read the input from a file.

Optionally (you will not be graded on this), you can store your `char`s in an
array.

### Hints
* It is standard to include a newline (`\n`) at the end of the last line of any
	file; thus, your final print statement should include a newline at the end.
	If you get the error `\ No newline at end of file` in your `diff` below,
	it's because you're missing the newline.
* You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall min.c
./exe < /public/classwork/week5/mon/test_input.txt > output.txt
diff -w -i ~/classwork/week5/mon/output.txt /public/classwork/week5/mon/expected_output.txt
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
