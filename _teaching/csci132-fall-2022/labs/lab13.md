---
collection: teaching
title: "Lab 13"
---

## Logistics
* Due: on Thursday, December 1st anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* Understand merge sort
* Practice Java file I/O

## Assignment

In this assignmemt, you will write a method implementing merge sort and use it
to sort the lines of a file two ways: alphabetically and by the length of
the line. To do so, you will also implement your own comparator.

Starter code:
* [lab13_starter.zip](https://lgw2.github.io/teaching/csci132-fall-2022/labs/lab13_starter.zip)

### Merge sort

In the `Demo.java` file, implement merge sort recursively and so that it can be
used for any type. Consult Wednesday's lecture. If you would like, you can look
at the book's implementation, but try to understand how it works even if you
just copy it in.

* [pp537-538.pdf](https://lgw2.github.io/teaching/csci132-fall-2022/labs/pp537-538.pdf)

### Length comparator

Your merge sort function takes in a `Comparator` object. In the
`LengthComparator.java` file, write your own comparator that takes in two
strings and returns -1 if the second is longer, 1 if the first is longer, and 0
if they are equal. You can look at the book's implementation if you would like.

* [p364.pdf](https://lgw2.github.io/teaching/csci132-fall-2022/labs/p364.pdf)

### Reading and writing from a file

Consult the [example code from Monday](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/IOExample.java) to learn how to read and write from a file.
Then, download `Housman.txt`[https://lgw2.github.io/teaching/csci132-fall-2022/labs/p364.pdf], put it in your project directory
(in Eclipse, that is in `/yourHome/eclipse-workspace/projName/putFileHere`, but
ask a TA or on Discord for help if you can't figure out where to put your
file). In `Demo.java`, read the contents into an array and write two new files:
`sortedbyAlpha.txt` and `sortedByLength.txt`.

Here are examples of what your output files should look like:
* [sortedByAlpha.txt](https://lgw2.github.io/teaching/csci132-fall-2022/labs/sortedByAlpha.txt)
* [sortedByLength.txt](https://lgw2.github.io/teaching/csci132-fall-2022/labs/sortedByLength.txt)

## Grading - 10 points
* 3 points - merge sort is correct
* 3 points - length comparator is correct
* 2 points - reads from file
* 2 points - writes to file

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, December 6th.
