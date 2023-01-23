---
collection: teaching
title: "Lecture 1: Intro to C; more Linux & vim"
---

## About the C programming language

C was developed in 1972 by Dennis Richie. Why do we still use it (and teach
it)?
* Most common programming languages today are based on C.
* It has fast runtime performance.
* A lot of software that is still used today is written in C --- both software
	that was developed in the past and software that was developed recently.
* It allows unchecked access to computer memory.

## Creating an executable C program

C (like Java, Python, and likely all other programming languages that you have
used) is a high-level programming language, meaning that it is abstracted away
from the details of the computer, using more natural language. High-level
languages deal with things like variables, functions, arrays, etc., whereas
low-level programming languages deal with things like registers, memory
addresses, and call stacks --- basic parts of a computer and its operating
system.

Because C is a high-level programming language, in order to be run, it is first
compiled into machine code that can be directly executed by the computer.

```
insert image from book
```

For now, we will write our C source code in a single file (by convention, with the
file extension `.c`) and compile them directly into executable files. We now
explain each part of the command we can use to compile our files:
* We use the `gcc` compiler
* with the `-o`option to specify the name of the executable to create.
If  you don't use `-o`, your executable will be called `a.out`.
* In this course, we also use the `-Wall` flag to specify that we want warnings to be displayed.
* Finally, we include the file containing the source code.

Thus, to compile C source code in `hello_world.c` to an executable file `hello_world`,
we can run
```
gcc -o hello_world -Wall hello_world.c
```

## Basic elements of a C program

```
insert image from book
```
