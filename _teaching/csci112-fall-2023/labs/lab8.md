---
collection: teaching
title: "Lab 8"
---

## Logistics
* Due: Friday, October 20th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `lab8.c` in your `~/csci112_fall2023/labs/lab8`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `lab8`. (You should have set up your `git` repo and practiced tagging a commit in [Classwork 4](https://lgw2.github.io/teaching/csci112-fall-2023/classwork/classwork4/).)

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
* Practice using structs.

## Assignment

In this lab, you will build off of your Lab 7 solution (or the solution
provided in `/public/labs/lab7/solution.c` by class time on Monday, October
16th) to build an interactive database of Montana counties, where a user can
search for counties within a population range or by county seat.

**Note:** be sure to change from reading from `/public/labs/lab7/counties1.txt`
to `/public/labs/lab8/counties1.txt`. The Lab 8 version has commas removed from
the population field, which will make it (much) easier to parse that as an
integer.

Starting from the existing code, define your own `struct` called `County`
with the following data members:
* a string `name` (you may assume name has no more than 99 characters);
* a string `seat` (you may assume seat has no more than 19 characters),
* and an int `pop`.

Then, store the data about each county as a `County` in an array of type `County`. To do so, you must define and use a
function `add_county` that returns a `County` and takes in a string for the
county name, a string for the county seat, and an int for the population, in
that order. That
is, your function header might look like

```
County add_county(char* name, char* seat, int pop)
```

or

```
County add_county(char name[100], char seat[20], int pop)
```

Additionally, you must use `sscanf` to convert the population from a string to
an `int`.

As always, make sure you match the output formatting exactly so that the
autograder can read your answers.

### Hints

* To pass a two-dimensional array as a parameter in a function, you need to
	specify the size of the second dimension. For example,
``` void func(char arr[][100]) {
```
takes in a character array `arr`, which can store as many strings as needed,
but each can only take up 100 total slots.
* You can assume that there will be no more than 100 counties and that the
	lines are no more than 499 characters long.

## Grading--100 points

* 10: source file exists with correct name in correct location
* 10: source file compiles without warnings
* 5: reads from `/public/labs/lab8/counties1.txt`
* 5: uses `fgets` to read from `/public/labs/lab8/counties1.txt`
* 5: uses `fprintf` to write to `outdata_strings.txt`
* 10: uses `strtok` to separate parts of the line
* 5: printing is formatted correctly in `outdata_strings.txt`

For each of 2 tests,

* 15: `outdata_strings.txt` is sorted
* 10: `outdata_strings.txt` includes correct county name, population, and county seat

### Autograder

You can run the autograder using

```
/public/labs/lab8/autograder.sh
```

A detailed breakdown of your score will be present in `autograder.txt`.

## Grading turnaround
Scores will be uploaded to D2L by class time the Wednesday after the due dat.
