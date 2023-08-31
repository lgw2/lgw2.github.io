---
collection: teaching
title: "Classwork 5"
---

## Logistics
* Due: Wednesday, September 6th AoE.
* Submission instructions: make sure that the required file (`remainder.c`) is in your
	`/classwork/week3/wed/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Write a function that takes in two inputs and returns one output.
* Use a function prototype and define your function below `main`.

## Assignment

* Log in to the server.
* From your home directory, navigate to `csci112_fall2023/classwork/week3/wed/`, creating directories `week3` and `wed` if necessary.
* **Copy the file with the starting code.** It's the file `cw5.c` in the directory `/public/classwork/week3/wed`. You will
	probably need to use the `cp` command, and maybe the `mv` command if you
	didn't rename your file when you copied it. See the [Linux notes from the
	first lecture]() for a review of those commands.

Prompt the user for two integers, one to use a dividend and one to be used as a
divisor. Write a function `rem` that takes in both integers and returns the
remainder when dividing the dividend by the divisor. In `main`, print the
dividend, divisor, and remainder. As usual, your output must exactly match the
sample. That is, you should exactly match the following for the input `12 4`:

Hint: The `%` (mod operator) computes the remainder. For example, `12 % 4` returns
	`0`, whereas `22 % 10` returns `2`.

* Compile your program to the executable file `exe` (or other filename of your
	choice) using `gcc -o exe -Wall hello_world.c`.
* Run your program using `./exe`.

* You can run the autograder by running
```
/public/classwork/week3/wed/autograder.sh
```

The file `autograder.txt` will be created with your score.

## Grading turnaround
Final scores will be run at 6am on the due date and scores will be
uploaded to D2L by the next class meeting.
