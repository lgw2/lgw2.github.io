---
collection: teaching
title: "Lecture 5: Input/Output File Redirection and Arrays"
---

### Input/output file redirection
[video](https://youtu.be/GsHwmxoSdeo)

Key ideas:
* `<` and `>` on Linux redirect standard input and standard output
* we can use redirection to read input from files and write output to files
	without changing our C code
* `scanf` returns the number of inputs successfully assigned, so can use a `while` loop with `scanf`
	to read lines of a file until end 

### Arrays
[video 1]
[video 2]

Optional reading: 7.1-7.5

Key ideas:
* Declaring arrays: `datatype name[size]`, e.g., `int nums[10]` to store 10
	ints
* Arrays can only store data of one type and have fixed size
* Can initialize elements using `{}`
* Arrays are stored contiguously in memory
* Common error: overlowing array (and will not be detected by the compiler!)
* Array indexing using `[]`
* Accessing array elements using loops
* Using arrays in functions: we pass arrays by reference because they are
	actually pointers
* To create an array in a function, create it, pass it in (actually passing a
	pointer to the start of it), and then fill it
* `const` for input array arguments
* conditional operator
