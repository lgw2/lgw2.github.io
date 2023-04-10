---
collection: teaching
title: "Lab 7"
---

## Logistics
* Due: Friday, April 28th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab7.c` in your `~/csci112_spring2023/labs/lab7`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab7`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using pointers to create a linked list
* Practice using `malloc` and `free` to dynamically allocate and deallocate
	memory.

## Assignment

Write a struct called an `Exhibit` that holds information about exhibits in a
zoo, and can also be used as a node in a linked list containing an arbitrary
number of `Exhibit` nodes. Then, write functions to create and return a new
`Exhibit`, add to the list at the front, delete a given exhibit from the list,
and print the whole list.

### Program specification

Your program must include the following structs and functions with exactly the specified
inputs and return types. You may optionally start with the code in
`/public/labs/lab7/lab7_starter.c`, which has the correct function headers.
* struct `Exhibit` with data members the name of the exhibit and the next
	exhibit
* function `print_exhibits`
* function `create_new_exhibit` which must use `malloc` to create an exhibit on
	the heap
* function `insert_exhibit_at_front`
* function `delete_exhibit` which must use `free` to free the memory on the
	heap

### Hints

### Sample run

You don't need to match the output format.

```
[p19t655@csci112 lab7]$ make
gcc -c lab7.c -Wall
gcc -c funcs.c -Wall
gcc lab7.o funcs.o -o lab7
[p19t655@csci112 lab7]$ ./lab7
How many exhibits would you like to add? > 3
Enter exhibit name > Seashore
Enter exhibit name > Riverside
Enter exhibit name > Lakeshore

Lakeshore->Riverside->Seashore->
How many exhibits would you like to delete? > 1
Enter exhibit name > Riverside

Lakeshore->Seashore->
How many exhibits would you like to add? > 1
Enter exhibit name > Jungle

Jungle->Lakeshore->Seashore->
```

## Test data

There are test files and sample outputs in the `/public/labs/lab7` directory.

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: struct `Exhibit` is implemented as described
* 10 points: function `print_exhibits` is implemented as described
* 5 points: function `create_new_exhibit` is implemented as described (with or without
	`malloc`)
* 5 points: function `create_new_exhibit` correctly uses `malloc` to allocate memory on the heap
* 10 points: function `insert_exhibit_at_front` is implemented as described
* 15 points: function `delete_exhibit` is implemented as described (with or without
	`free`)
* 5 points: function `delete_exhibit` correctly uses `free` to free the memory allocated for the deleted node
* 5 points: prompts the user
* 5 points: uses at least one header file and at least two C source code files
* 5 points: provides a Makefile that correctly encodes the dependencies between
    the files and can successfully compile it
* 5 points: source code is in a commit with tag `lab7`.
* 5 points: source code is in `csci112_spring2023/labs/lab7` directory.

## Go beyond
* Implement your `print_exhibits` function recursively.
* Use TBD to check that your program has no memory leaks.

## Grading turnaround
This lab will be graded within one week of its due date.

