---
collection: teaching
title: "Project 3"
---

## Logistics
* Due: Friday, October 14th AoE.
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

In this project, you will edit [CaesarCipher.java]() to be able to do more
sophisticated encryption and to have some user interaction.

Begin by running the program as-is.


## Grading - 100 points

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

### Correct implementation
* 10 points - move the `main` method to its own `CipherDriver` class. Do not
	change the visibility of the fields; instead, if you need to access them in
	`CipherDriver`, add getters and setters. (If you do not need these, that is
	okay too.)
* 20 points - make it possible to use both upper and lower case letters in the
	message.
* 30 points - modify the program so that the key can be anywhere between length
	1 and length 10. For example, if the key length is 3 and the key is 123,
	then the string `AAAA` is changed to `BCDB`.
* 10 points - modify the program so that the user can enter an integer between 1
	and 10 for the key length (5 points). If they enter an invalid input, raise a `ValueError`
	and exit the program (5 points).
* 15 points - have a single run of the program do each of the following (3
	points each): prompt for a key length, prompt for a key, print out the key,
	allow user to choose between encrypt and decrypt, prompt for a message, and
	print encrypted/decrypted message.

### Sample output

You don't need to match the output format, but consult the grading scheme to
make sure that you get full points.

```
```

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday, October 18th, AoE.

## Go beyond
* Watch this [Khan Academy Video](https://www.khanacademy.org/computing/code-org/computers-and-the-internet/internet-works/v/the-internet-encryption-and-public-keys) to learn a bit more about cryptography.
* In your driver code, there are a lot checks for correct inputs. Try to write
	your program so that you don't repeat any code. That is, pull out the
	repeated code into its own method and call the method when needed.
