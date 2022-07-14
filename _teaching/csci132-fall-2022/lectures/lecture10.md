---
collection: teaching
title: "Lecture 10: Reading from files; strings"
---

### Reading from files
[video](https://youtu.be/crW2pCMMUBM)

Segmentation fault [video](https://youtu.be/ZegUxWCMThI)

Optional reading: 6.1

Key ideas:
* To create a file pointer, `FILE *var_name`
* To point it to a file, `var_name = fopen("file_name", ["r" or "w"])`
* Then, use `fscanf` and `fprintf` to read and write
* If a file for reading does not exist, trying to use its pointer will give a
	segmentation fault

### Strings
Declaring and initializing strings; reading with `scanf` [video](https://youtu.be/y0Um7J5-rO0)

`strcpy` and `strtok` [video](https://youtu.be/CA3P9iVOo4E)

More string library functions; reading whole lines; example [video](https://youtu.be/83jCQl2-NPw)

Optional reading: Chapter 8

Key ideas:
* Strings are arrays of `char` with a `\0` at end (`hello` needs 6 elements to
	store, not 5)
* String initialization (can be done with assignment operator `=`)
* String assignment must be done with `strcpy`
* String library functions (reference:
	[https://www.tutorialspoint.com/c_standard_library/string_h.htm](https://www.tutorialspoint.com/c_standard_library/string_h.htm))
1. `strcpy`
2. `strncpy`
3. `strcmpr`
3. `strtok`
* `gets` and `fgets`
* Converting a string to a number and vice versa

