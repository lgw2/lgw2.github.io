---
collection: teaching
title: "Classwork 2: Hello, world!"
---

## Logistics
* Due: Monday, January 23rd AoE (Tuesday 6am Bozeman time).
* Submission instructions: make sure that the required file (`hello_world.c`) is in your
	`/classwork/week2/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Write, compile, and run your first C program.

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week2/mon/`, creating directories `week2` and `mon` if necessary.
* Inside this directory, create a file called `hello_world.c`.
* Type or paste the following:

```c
#include <stdio.h>

int main(void) {

     // prints "Hello, world!"
     printf("Hello, world!\n");

     // exit with no errors
     return(0);
}
```
* Compile your program to the executable file `exe` (or other filename of your
	choice) using `gcc -o exe -Wall hello_world.c`.
* Run your program using `./<filename>` (`./exe` if you compiled into `exe`).

You can check that you will get full credit for this assignment by compiling
	your program, running it and saving its output to a file, and comparing
	that file to the example output. Specifically, do:
```
gcc -o exe -Wall hello_world.c
./exe > output.txt
diff ~/classwork/week2/mon/output.txt /public/classwork/week2/mon/expected_output.txt
```
You will see any warnings during compilation and any differences between your output and the expected output on the
screen. If nothing happens, the content of your output file exactly matches the
expected content and there were no warnings when compiling. As long as your file is in the correct place and named
correctly, this means that you will get full credit for the assignment.

## Grading turnaround
Preliminary results via autograder will be present in the appropriate classwork
directory in the `autograder.txt` file at the end of
class and refereshed at 5pm. Final grading will be run at 6am tomorrow and scores will be
uploaded to D2L by the next class period.
