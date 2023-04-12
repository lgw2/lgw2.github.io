---
collection: teaching
title: "Lab 6"
---

## Logistics
* Due: Friday, April 28th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab6.c` in your `~/csci112_spring2023/labs/lab6`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab6`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.
* Deadline reminder: per the [late assignment policy](https://lgw2.github.io/teaching/csci112-spring-2023/syllabus/#late-assignment-policies), if you submit after the deadline but within 24 hours of it you will receive a 25% penalty. If you submit within 48 hours you will receive a 50% penalty. After that, no submissions will be accepted.

## Learning outcomes
* Practice using command line arguments
* Practice splitting your C program into separate header and C files
* Practice using `make` and writing Makefiles
* Practice passing structs by reference
* Practice using the math library

## Assignment

You will write a simple role playing game simulator, in which two characters
fight one round. Your program should take the character info (name, experience
points, and health points) as arguments on the command line, store the
information about each character in a `Character` struct, and call a `fight`
function that takes in pointers to the two characters and modifies them based
on the result of the fight.

When two characters fight, this is what should happen:
* If the characters have equal XP, nothing.
* Otherwise, the character with higher XP is the winner and the character with
	lower XP is the loser. The winner deals the difference in XP damage to the
	loser's HP. The winner's XP increases by adding the log base 10 (`log10`
	function from `math.h`). The loser's XP increases by multiplying by 1.5. If
	you store XP as an int, you may round however you like.
* If the loser's HP goes to 0 (or smaller), add "(deceased)" to their name.

### Program specification

You have some flexibility on the implementation of this program, but you must
include the following:
* a `Character` struct with fields for name, XP, and HP
* a `fight` function that takes as input two pointers to `Character` structs
	and modifies the structs that the pointers point to if needed
* a call to the `log10` function from the `math.h` library
* at least two `.c` files and one `.h` file
* a Makefile that correctly encodes the dependencies of your program and can be
	used to create an executable called `lab6`

For creating the structs and printing them, you may choose to use separate
functions if you would like, but the details are up to you.

### Hints
* remember to compile with `lm` when you use the math library.
*

### Sample run

You don't need to match the output format.

```
[p19t655@csci112 lab6]$ ls
funcs.c  lab6.c  lab6.h  Makefile
[p19t655@csci112 lab6]$ make
gcc -c lab6.c -Wall
gcc -c funcs.c -Wall -lm
gcc -o lab6 lab6.o funcs.o -lm
[p19t655@csci112 lab6]$ ./lab6 Bowser 10 10 Mario 5 5
### LET'S FIGHT ###
Bowser (10 XP, 10 HP) vs. Mario (5 XP, 5 HP)
Bowser deals 5 damage to Mario

Result is:
Bowser (11 XP, 10 HP)
Mario (deceased) (7 XP, 0 HP)
[p19t655@csci112 lab6]$ ./lab6 Bowser 22 100 Mario 35 100
### LET'S FIGHT ###
Bowser (22 XP, 100 HP) vs. Mario (35 XP, 100 HP)
Mario deals 13 damage to Bowser

Result is:
Bowser (33 XP, 87 HP)
Mario (36 XP, 100 HP)
[p19t655@csci112 lab6]$ ./lab6 Bowser 22 100 Mario 22 100
### LET'S FIGHT ###
Bowser (22 XP, 100 HP) vs. Mario (22 XP, 100 HP)

It's a tie!

Result is:
Bowser (22 XP, 100 HP)
Mario (22 XP, 100 HP)
[p19t655@csci112 lab6]$ ./lab6 Bowser 40 100 Mario 22 100
### LET'S FIGHT ###
Bowser (40 XP, 100 HP) vs. Mario (22 XP, 100 HP)
Bowser deals 18 damage to Mario

Result is:
Bowser (41 XP, 100 HP)
Mario (33 XP, 82 HP)
```

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 10 points: correctly take in 6 arguments on the command line. These should
	be, in this order: name of character 1, XP of character 1, HP of character 1, name of
	character 2, XP of character 1, HP of character 2.
* 5 points: define the `Character` struct as described
* 5 points: create two `Character` structs from the information passed from
	the command line.
* 10 points: implement the `fight` function to take in two pointers to
	`Character` structs
* 10 points: modify the two `Character` structs in the `fight` function by
	following the pointers
* 5 points: handle the tie case correctly
* 5 points: correctly update XP if not a tie
* 5 points: correctly update HP (of loser) if not a tie
* 5 points: modify the name of a character if it gets 0 or fewer HP
* 10 points: store your `Character` definition and at least one function
	protoptye in a header file
* 5 points: use at least two `.c` files
* 10 points: include a header guard in your header file
* 5 points: print information about the program's run in a pleasing manner
* 5 points: source code is in a commit with tag `lab6`.
* 5 points: source code is in `csci112_spring2023/labs/lab6` directory.

## Go beyond

## Grading turnaround
This lab will be graded within one week of its due date.

