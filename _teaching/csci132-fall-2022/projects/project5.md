---
collection: teaching
title: "Project 5"
---

## Logistics
* Due: Friday, December 9th AoE.
* Submission instructions: upload your Java files to the D2L dropbox. If you have more than one file, the preferred method is to put them all into one folder, zip
	that, and upload the zipped file. Ask if you need help with this.
* You may do this project with a partner. If you do this, one partner should
	turn in the Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

In this project, you will take the code you wrote for Lab 13, add a quick sort
method, and replace the calls to `mergeSort` with calls to your quick sort
method.


### Starter code

Your Lab 13 is your starter code for this project. You can copy the package
into a new Project 5 package.

### Quick sort implementation

In public static generic method in the `Demo.java` file, implement quick sort.
You can use the book's implementation, but be warned that you will need to make
some changes.

* [p549.jpeg](https://lgw2.github.io/teaching/csci132-fall-2022/projects/p549.jpeg)
* the book uses its own
`Queue` implementation, not Java's. You will either need to change the code
slightly to use [Java's `Queue`](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html),
or you can copy your `DLLQueue.java` file from Project 4 and use that.
* the book's `quickSort` takes in a `Queue` and a comparator, whereas
	`mergeSort` (if you used the book's implementation for Lab 13) takes in an
	array of `String` and a comparator. You will need to either change
	`quickSort` to take in an array (generic) or change your code in `main` to
	store the data in a queue (or something that implements the `Queue`
	interface).
* Recall the useful `List` algorithms from [Lecture 31](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/lecture31/) for turning arrays into queues (if you use the Java `Queue`).


## Grading - 100 points

### Correct quick sort
* 50 points

### Correct demo
10 points each:
* sort data from `a` using quicksort and natural comparator
* sort data from `a` using quicksort and length comparator
* sort data from `Housman.txt` using quicksort and natural comparator and write
	to file
* sort data from `Housman.txt` using quicksort and length comparator and write
	to file

### Readable code and good comments
* 10 points

Some things you can think about for writing readable code:
* using meaningful identifiers (variable names, method names)
* indent statement blocks
* don't rewrite the same code!
* use comments to explain ambigiuous or confusing constructs
* be thoughtful about which access modifiers you use for class members
* come back to your code a day or two after writing it and see if the way you
	solved the problem could be improved, or if you need to add comments

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday, December 13th, AoE.
