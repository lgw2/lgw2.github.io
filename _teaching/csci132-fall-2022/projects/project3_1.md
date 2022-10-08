---
collection: teaching
title: "Project 3"
---

## Logistics
* Due: Friday, October 21st AoE.
* Submission instructions: upload your java files to the D2L dropbox for
    Project 3. If you have more than one file, the preferred method is to put them all into one folder, zip
	that, and upload the zipped file. Ask if you need help with this.
* You may do this project with a partner. If you do this, one partner should
	turn in the seven Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

In this project, you will compare the runtimes of adding an element to the end,
adding an element to the beginning, and getting the *n*th element for arrays
vs. inlked lists.

Creating the following three java files: `ArrayDS.java`, `LinkedListDS.java`,
and `ArrayVs.LinkedList.java`. `ArrayDS` and `LinkedListDS` will define the
same methods, but one will implement them using an array and the other will
implement them using a linked list. The methods they should have are:

* `addFirst(Integer)`: puts the `Integer` in the first position.
* `addLast(Integer)`: puts the `Integer` in the last position.
* `getN()`: returns the `Integer` stored in the *n*th position (index starting
	at 0.

Notes for the `ArrayDS`:
* you may assume that you will not put more `Integer`s in than you initialize
	the array to hold.

Notes for the `LinkedListDS`:
* you may copy the code from the book or class, but you should delete any
	methods that you are not using, and you should change the method names to
	match those given above.



## Grading - 100 points


### Correct implementation
* 10 points - move the `main` method to its own `CipherDriver` class.
* 20 points - make it possible to use both upper and lower case letters in the
	message. Spaces, punctuation, etc should be kept the same in the message;
	see the sample output.
* 20 points - modify the program so that it takes in three keys, each indicating a shift. For example, if the key length is 3 and the key is 1-2-3,
	then the string `AAAA` is changed to `BCDB`.
* 10 points - modify the program so that the user can enter an integer between 1
	and 10 for the key length (5 points). If they enter an invalid input, raise an exception
	and run the program with a default value of 1.
* 10 points - modify the program so that they user enters the correct number of keys. For example,
if the user selected to use a key size of 3, then ask for three keys. If any of
the keys is not an integer between 0 and 26, raise an exception and assign it the default value of 0.
* 15 points - have a single run of the program do each of the following (3
points each): prompt for a key length, prompt for the correct number of keys, print out the entire key,
	allow user to choose between encrypt and decrypt, prompt for a message, and
	print encrypted/decrypted message.

### Readable code and good comments
* 15 points

Some things you can think about for writing readable code:
* using meaningful identifiers (variable names, method names)
* indent statement blocks
* don't rewrite the same code!
* use comments to explain ambigiuous or confusing constructs
* be thoughtful about which access modifiers you use for class members
* come back to your code a day or two after writing it and see if the way you
	solved the problem could be improved, or if you need to add comments

### Sample output

You don't need to match the output format, but consult the grading scheme to
make sure that you get full points.

```
```

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday, October 18th, AoE.

## Go beyond
* Implement both the array data structure and the linked list data structure to
be generic.
* Run your timing test with random Characters and random Strings.
* Change your ArrayDS so that it can handle the case when a new Integer is
added and there is no more space for it. One way you can do this is to create a
new array with double the capacity.
