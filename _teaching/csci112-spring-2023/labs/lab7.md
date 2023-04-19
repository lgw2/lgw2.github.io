---
collection: teaching
title: "Lab 7"
---

## Logistics
* Due: Friday, April 28th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in your `~/csci112_spring2023/labs/lab7`
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

Write a struct called an `Exhibit` that holds information about an exhibit in a
zoo, and can also be used as a node in a linked list containing an arbitrary
number of `Exhibit` nodes stored on the heap. Then, write functions to create and return a new
`Exhibit`, add to the list at the front, delete a given exhibit from the list,
and print the whole list. At the end of your `main` function, you should free
the entire list. **If you would like, you can use a pre-written `main` and
header file containing the function prototypes and `Exhibit` definition, found in `/public/labs/lab7` in the files
`lab7.c` and `lab7.h`, respectively. In this case, you just need to provide the
`funcs.c` file (and a Makefile).** If you would like to write your own `main`
and your own header file, that is also fine.

### Program specification

Your program must include the following structs and functions with exactly the specified
inputs and return types. **These are already in the `/public/labs/lab7/lab7.h`
file** if you want to use it.
* Struct `Exhibit` with fields for the name of the exhibit and the next
	exhibit (a pointer to an `Exhibit`).
* Function `print_exhibits` that takes in a pointer to an Exhibit and
	prints out the entire list starting from that node.
* Function `create_new_exhibit` which takes in an exhibit name and returns a
	pointer to an exhibit with that name. It must use `malloc` to allocate
	space for the new exhibit on the heap.
* Function `insert_exhibit_at_front` which takes in a double pointer to an
	`Exhibit` (for the start of the list) and a pointer to the exhibit to be
	added, and adds the new exhibit to the front.
* Function `delete_exhibit` which takes in a double pointer to an `Exhibit` (for the start of the list) and an exhibit name and removes an exhibit with that name from the list. It must
use `free` to free the memory on the heap for the deleted node.
* Function `delete_all` which takes in a pointer to an `Exhibit` (for the start of the list) and uses `free` to free the memory for the entire
	list.

### Hints
* Follow the implementations of print, insert at front, delete, and delete all
	for linked lists from class.
* You can check for memory leaks using `valgrind`. For example, run
```
valgrind --leak-check=full \
         --show-leak-kinds=all \
         --track-origins=yes \
         --verbose \
         --log-file=valgrind-out.txt \
         ./lab7 < /public/labs/lab7/test1.txt
```
and check the `valgrind-out.txt` file. At the bottom of the file you will find
information about whether you have memory leaks. If you do, check that you are freeing all of the memory you allocate! See [this stack overflow post](https://stackoverflow.com/questions/5134891/how-do-i-use-valgrind-to-find-memory-leaks) if you would like to know more about valgrind.

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
* 5 points: function `create_new_exhibit` is implemented as described
	(excluding `malloc`)
* 5 points: function `create_new_exhibit` correctly uses `malloc` to allocate memory on the heap
* 10 points: function `insert_exhibit_at_front` is implemented as described
* 10 points: function `delete_exhibit` is implemented as described (excluding
	`free`)
* 5 points: function `delete_exhibit` correctly uses `free` to free the memory allocated for the deleted node
* 5 points: function `delete_all` successfully deletes all nodeds from the
	list
* 5 points: function `delete_all` correctly uses `free` to free the memory allocated for the all remaining nodes and is called at the end of `main`
* 5 points: program prompts the user as in the sample
* 5 points: uses at least one header file and at least two C source code files
* 5 points: provides a Makefile that correctly encodes the dependencies between
    the files and can successfully compile it
* 5 points: source code is in a commit with tag `lab7`.
* 5 points: source code is in `csci112_spring2023/labs/lab7` directory.

## Go beyond
* Implement your `print_exhibits` and `delete_all` functions recursively.

## Grading turnaround
This lab will be graded within one week of its due date.
