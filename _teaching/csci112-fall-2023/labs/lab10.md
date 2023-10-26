---
collection: teaching
title: "Lab 10"
---

## Logistics
* Due: Friday, November 3rd AoE.
* Submission instructions: ensure that you have the files for this assignment in your `~/csci112_fall2023/labs/lab9`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab9`. (You should have set up your `git` repo and practiced tagging a commit in [Classwork 4](https://lgw2.github.io/teaching/csci112-fall-2023/classwork/classwork4/).)

## Outside resources

On this assignment, you may not use the the internet or generative AI such as
ChatGPT to solicit solutions to the programming part of the assignment. If you
are having trouble writing your program, please go to lab (Fridays, 12-4 in
Roberts 111) or post in Discord to
get help.

However, you may use those resources for help with navigating the Linux
terminal, using vim, and using git, although you may get better answers to your
questions by going to lab or posting on Discord anyway.

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
	function from `math.h`) of their current XP to their current XP.
	The loser's XP increases by multiplying their current XP by 1.5. If
	you store XP as an `int`, you may round however you like.
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
* remember to compile with `-lm` when you use the math library.

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
## Grading--100 points

* 10: all eight files exists with correct name in correct location
* 20: `make` compiles `lab9` without warnings
* 20: `lab9` still works as Lab 8 (passes tests from Lab 8 autograder)
* 10: all header files have header guards
* 10: `lab9.c` contains `main` and no other source code
* 5 each: `county.c` defines functions in `county.h`, `sort.c` defines
	functions in `sort.h`, `utils.c` defines functions in `utils.h`.
* 10: `Makefile` encodes the dependencies of the program so that only code that
	needs to be recompiled is recompiled
* 5: `county.h` contains the definition for a `County` struct

### Autograder

You can run the autograder using

```
/public/labs/lab9/autograder.sh
```

A detailed breakdown of your score will be present in `autograder.txt`.

## Grading turnaround
Scores will be uploaded to D2L by class time the Wednesday after the due date.
