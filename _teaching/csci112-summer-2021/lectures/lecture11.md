---
collection: teaching
title: "Lecture 11: User defined types and structs"
---

### User-defined types
[video]

Optional reading: Chapter 7.7

Key ideas:
* Can define our own types using `typedef` keyword.
* `_t` naming convention
* Enumerated types using `enum`
* Can use the types as integers for readability of code

### Structs
[video]

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