---
collection: teaching
title: "Lecture 14: Recursion"
---

### Recursion
Intro to recursion [video](https://youtu.be/wuYzP4Yv2d4)

String example [video](https://youtu.be/kHoh2OqEvgE)

Optional reading: chapter 9

Note: code used in videos is available at `/public/examples/chap9/`.

Key ideas:
* A function that calls itself is said to be recursive.
* Problems that
	1. Have one or more simple cases with straightforward solutions
	2. Have other cases which can be redefined in terms of problems that are
	   closer to the simple cases
lend themselves well to recursive solutions.
* Basic pseudocode for recursive solutions:
```
if this is a simple case
	solve it
else
	redefine the problem using recursion
```
* We often call the simple case the *base case* and the other case the
	*recursive case*
