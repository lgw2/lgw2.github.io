---
collection: teaching
title: "Lecture 3: User input, For loops, arrays, lab 1 intro"
---

[lecture video](https://youtu.be/tdi4UHZV1U0)


### User input with `Scanner`
* check out the [documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)
* To read from the keyboard, do something like:
```
Scanner sc = new Scanner(System.in);
String name = sc.next();
```

### For loops in Java
* Syntax: for (where to start; where to stop; how to increment. For example,
	`for (int i =0; i < 10; i +=2)` says start at 0, don't get to 10, and
	increment by 2.
* Enhanced for loop (also known as for-each loop)

### Arrays
* Syntax: `dataType[] varName` means that we are declaring an array of type
	`dataType` with name `varName`
* We can either assign using curly brace notation or assign to an array of
	specific length

### Lab 1 intro
* TAs
* Logistics reminders

### Files used in class
* [ArrayDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ArrayDemo.java)
