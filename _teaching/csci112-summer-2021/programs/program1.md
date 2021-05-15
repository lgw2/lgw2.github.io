---
collection: teaching
title: "Program 1"
---

## Logistics
* Due: Monday, May 24th no later than 11:59pm.
* Submission instructions: push a commit with the tag `program1` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Use arrays
* Use makefiles

## Assignment
A network address is made up of 4 sections – each an integer from 0-255.
Each section is separated by a period (.) when shown to the user.
Depending on the class of the address, one or more sections identify the network and one or
more sections identify the host within the network.
For the IP addresses from Class A, the first 8 bits (the first number) represent the network part, while the remaining 24 bits (last 3 numbers) represent the host part. For Class B, the first 16 bits (the first two numbers) represent the network part, while the remaining 16 bits (last 2 numbers) represent the host part. For Class C, the first 24 bits represent the network part (the first 3 numbers), while the remaining 8 bits (the last number) represent the host part.
To idenfity which class a network is, we can look at the first number.

* A: 0-127
* B: 128-191
* C: 192-223
* D: 224-239
* E: 240-255

For this assignment, you will read in a file of network addresses (using
`scanf` and file redirection) and print out some statistics about the networks
in the file. You should ignore Class D and Class E networks. Your program will
also take in a command line argument indicating the number of network addresses
to be processed.

The statistics you must compute are:
* The number of Class A, Class B, and Class C networks
* For each of Class A, Class B, and Class C, determine the network with the
	most hosts and count the number of hosts int contains.

In order to help you develop your program, here is a rough idea of how you
might structure your program.

1. Convert the command line argument into an `int`. If there is no command line
   argument, print an error and end the program.
2. Read each address into a 2 dimensional array of 4 unsigned chars.
3. Sort the array. (You will need to implement a sorting algorithm of your
   choice.)
4. Use the sorted array to count the number of networks in each class for A, B,
   and C. Ignore networks in classes D and E.
5. Use the sorted array to determine the network address that has the most
   hosts and the number of hosts in that network.

### Sample input and output

There are a number of sample input files in the `/public/pgm1` directory.

Here is what your output should look like when you run your program on the
`inp17.txt`, `inp2000.txt`, `inp5000.txt`, and `inp8000.txt` sample files.

```
```

### Hints
* If you prefer, you can write your entire program in one single file and just
	separate it into four different files before you turn it in.


### Requirements
* Write your program in a file called `program1.c` in your
	`csci112-firstname-lastname/programs/program1/` directory.
* You must use at least three functions in addition to `main`. Each should be
	stored in a separate file. (If you use more than four total functions, you
	can use four or more files.)
* You must use a makefile to compile and link your separate files.
* Your output formatting must match the example. Use a tool like
	[diffchecker](https://www.diffchecker.com/) to compare your output with the sample
	output. Don't worry about trailing spaces.

### Example output
```
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$217
In military (y or n)?		y
Military discount (15%):	$32.55
Discounted total:		$184.45
Sales tax (5%):			$9.22
Total:				$193.67
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$80
In military (y or n)?		Y
Military discount (10%):	$8.00
Discounted total:		$72.00
Sales tax (5%):			$3.60
Total:				$75.60
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$115
In military (y or n)?		n
Sales tax (5%):			$5.75
Total:				$120.75
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$20
In military (y or n)?		x
Error: bad input
[p19t655@csci112 lab1]$ ./lab1
Cost of purchase?		$20
In military (y or n)?		No
Sales tax (5%):			$1.00
Total:				$21.00
```

### Hints

## Grading - 100 points
* 5 points – comments explaining what your program does
* 5 points - code is indented so that it is readable
* 10 points – compiles successfully with -Wall – no warnings
* 10 points – successfully reads in and uses a command line parameter
* 5 points - has error msg if no command line parameter
* 10 points – reads all input into a 2 dimensional array of size command line number x 4
* 5 points – compiles and links  with makefile
* 5 points - four functions are stored in different files
* 10 points – printed the information specified in the requirements and submitted the output file.
* 5 points – sorts addresses in order to count them
* 10 points - correctly implements a sorting algorithm
* 20 points - computations are correct (number of A networks, number of B
	networks, number of C networks, and largest network and number of hosts for
	each)
* BONUS 5 points - uses a different sorting algorithm other than selection sort
	(which was shown in the lecture video)

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm on May 13th.
