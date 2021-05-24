---
collection: teaching
title: "Lecture 10: Reading from files; strings"
---

### Reading from files
[video](https://youtu.be/crW2pCMMUBM)

Optional reading: 6.1

Key ideas:
* To create a file pointer, `FILE *var_name`
* To point it to a file, `var_name = fopen("file_name", ["r" or "w"])`
* Then, use `fscanf` and `fprintf` to read and write

### Strings
[video]

Optional reading:

Key ideas:
* Strings are arrays of `char`
* String initialization (can be done with assignment operator `=`)
* String assignment must be done with `strncpy`
* `strlen` (difference from `sizeof`)
* string comparison using `strcmp`. (And what is being compared if we do `str1 <
	str2`?)
* `strncpy`
* `strtok`
* Converting a string to a number and vice versa

