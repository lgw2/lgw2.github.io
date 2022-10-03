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

Begin by running the program as-is. Then, make the updates below.

## Hints

* To read in multiple lines using a `Scanner` object, you may need to add in a
	`nextLine()` call to consume a newline character. For example:
	```java
	System.out.println("Enter your first name, press enter, then enter your last name:");
	String first = input.next();
	input.nextLine(); //consuming the <enter> from input above
	String last = input.next();
	```
* Remember that to compare strings we need to use `a.equals(b)`, not `==`.


## Grading - 100 points


### Correct implementation
* 10 points - move the `main` method to its own `CipherDriver` class. Do not
	change the visibility of the fields; instead, if you need to access them in
	`CipherDriver`, add getters and setters. (If you do not need these, that is
	okay too.)
* 20 points - make it possible to use both upper and lower case letters in the
	message.
* 20 points - modify the program so that the key can be anywhere between length
	1 and length 10. For example, if the key length is 3 and the key is 1-2-3,
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
Enter a key length (1-10):
1
Enter a key:
3
Your full key is 3
E for encrypt, D for decrypt:
E
Enter message to encrypt:
The EAGLE FLIES when the HORNET DIES!
Encoded message: Wkh HDJOH IOLHV zkhq wkh KRUQHW GLHV!

Enter a key length (1-10):
1
Enter a key:
3
Your full key is 3
E for encrypt, D for decrypt:
D
Enter message to decrypt:
Wkh HDJOH IOLHV zkhq wkh KRUQHW GLHV!
Decoded message: The EAGLE FLIES when the HORNET DIES!

Enter a key length (1-10):
3
Enter a key:
1
Enter a key:
2
Enter a key:
3
Your full key is 1-2-3
E for encrypt, D for decrypt:
E
Enter message to encrypt:
The EAGLE FLIES when the HORNET DIES!
Encoded Message: Ujh GDHNH HOJGV ykfp ujh JRSPHU GJGV!

Enter a key length (1-10):
3
Enter a key:
1
Enter a key:
2
Enter a key:
3
Your full key is 1-2-3
E for encrypt, D for decrypt:
D
Enter message to decrypt:
Ujh GDHNH HOJGV ykfp ujh JRSPHU GJGV!
Decoded Message: The EAGLE FLIES when the HORNET DIES!

Enter a key length (1-10):
67
java.lang.IllegalArgumentException: Input must be 1-10. Using 1.
Enter a key:
0
Your full key is 0
E for encrypt, D for decrypt:
E
Enter message to encrypt:
Montana State University 2022
Encoded message: Montana State University 2022

Enter a key length (1-10):
1
Enter a key:
89
java.lang.IllegalArgumentException: Input must be 0-26. Using 0.
Your full key is 0
E for encrypt, D for decrypt:
D
Enter message to decrypt:
Ujh GDHNH HOJGV ykfp ujh JRSPHU GJGV!
Decoded message: Ujh GDHNH HOJGV ykfp ujh JRSPHU GJGV!
```

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday, October 18th, AoE.

## Go beyond
* Watch this [Khan Academy Video](https://www.khanacademy.org/computing/code-org/computers-and-the-internet/internet-works/v/the-internet-encryption-and-public-keys) to learn a bit more about cryptography.
* In your driver code, there are a lot checks for correct inputs. Try to write
	your program so that you don't repeat any code. That is, pull out the
	repeated code into its own method and call the method when needed.
