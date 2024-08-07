---
collection: teaching
title: "Lecture 11: User defined types and structs"
---

### User-defined types
[video](https://youtu.be/uujZ4KSDA0A)

Optional reading: Chapter 7.7

Key ideas:
* Can define our own types using `typedef` keyword.
* `_t` naming convention
* Enumerated types using `enum`
* Can use the types as integers for readability of code

### Structs
Intro to  structs [video](https://youtu.be/V9dXeYfcVa4)
More on structs [video](https://youtu.be/6CsmXcQl61w)

Optional reading: 10.

Key ideas:
* In procedural programming language like C, we *can* put data together (but
	can't tie logic to it). 
* Syntax:
```
typedef struct {
	<type> <id>;
	<type> <id>;
	...
} <name of structure datatype>;
```
* Accessing components using the direct component selection operator `.` 
* Assigning component values using `=` vs. `strcpy` for strings
* Precedence of `.`
* Passing structs as pointers and using `->` 
* putting a struct in its own header file

### Lab 4 intro

[video](https://youtu.be/8LDCCBVz0oU)
