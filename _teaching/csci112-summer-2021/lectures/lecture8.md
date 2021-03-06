---
collection: teaching
title: "Lecture 8: Getting ready for program 1: unsigned chars and command line inputs"
---

### Reading command line inputs
[video](https://youtu.be/wFOwc6jXA-s)

Key points:
* To read command line input, define main with two input arguments: number of
	command line arguments and list of command line arguments, e.g. `int
	main(int argc, char** argv) { }`
* Here `argc` is the number of command line argument sand `argv` is an array of
	character pointers containing all of the arguments.
* To read one argument as an integer, use `atoi(argv[1])`. `atoi` is part of
	the standard library, so use `#include <stdlib.h>`

### Unsigned char data type
[video](https://youtu.be/HZJP7UjT5-A)

Key points:
* `char` data type is actually one of many integer data types (see "Intege
	Types" here:
	[https://www.tutorialspoint.com/cprogramming/c_data_types.htm](https://www.tutorialspoint.com/cprogramming/c_data_types.htm))
* `unsigned char` stores integers 0 to 255 using only 1 byte
* use `%hhu` placeholder in strings for `printf` and `scanf`


### Program 1 intro
[video](https://youtu.be/B07mYxhXH1Y)
