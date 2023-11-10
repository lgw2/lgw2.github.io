---
collection: teaching
title: "Lab 11"
---

## Logistics
* Due: Friday, November 17th AoE.
* Submission instructions: ensure that you have the files for this assignment in your `~/csci112_fall2023/labs/lab11`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab11`. (You should have set up your `git` repo and practiced tagging a commit in [Classwork 4](https://lgw2.github.io/teaching/csci112-fall-2023/classwork/classwork4/).)

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
fight once. Your program should take the character info (name, experience
points, and health points) as arguments on the command line, store the
information about each character in a `Character` struct, and call a `fight`
function that takes in pointers to the two characters and modifies them based
on the result of the fight.

When two characters fight, this is what should happen:
* If the characters have equal XP, nothing.
* Otherwise, the character with higher XP is the winner and the character with
	lower XP is the loser. The winner deals the difference in XP damage to the
	loser's HP. The winner's XP increases by adding the log base 10 (`log10`
	function from `math.h`) of their current XP to their current XP, and then
	rounding the result to the nearest integer (`round` function from
	`math.h`).
	The loser's XP increases by multiplying their current XP by 1.5. This
	should also be rounded to the nearest integer.
* If the loser's HP goes to 0 (or less), add "(deceased)" to their name.

### Program specification

You have some flexibility on the implementation of this program, but you must
include the following:
* a `Character` struct with fields for name, XP, and HP
* a `fight` function that takes as input two pointers to `Character` structs
	and modifies the structs that the pointers point to if needed
* calls to the `log10` and `round`  functions from the `math.h` library
* at least two `.c` files and one `.h` file
* a Makefile that correctly encodes the dependencies of your program and can be
	used to create an executable called `lab11`
* in the Makefile, a `clean` target that removes the executable `lab11` and all
	intermediate object files

For creating the structs and printing them, you may choose to use separate
functions if you would like, but the details are up to you.

### Hints

* Remember to compile with `-lm` when you use the math library.
* You can use `->`, the indirect selection operator, to both dereference a
	pointer to a struct and access its fields.

### Sample run

As always, match the output format exactly.

## Grading--100 points

* 10: `make` compiles the executable `lab11` without warnings
* 10: `make clean` removes executable `lab11` and all `.o` object files
* 40: correct output for four test cases
* 20: no memory leaks for four test cases
* 20: no other memory errors four test cases (example memory errors: accessing
	pointer after freeing, invalid `free`, buffer overflow; uninitialized
	memory access, etc.)

### Autograder

You can run the autograder using

```
/public/labs/lab11/autograder.sh
```

A detailed breakdown of your score will be present in `autograder.txt`.

## Grading turnaround
Scores will be uploaded to D2L by class time the Wednesday after the due date.
