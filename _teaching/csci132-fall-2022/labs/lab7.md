---
collection: teaching
title: "Lab 7"
---

## Logistics
* Due: on Thursday, October 13th anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* Practice using Singly Linked Lists
* Implement a new method for a Singly Linked List

## Assignment

Download [SinglyLinkedList.java](https://lgw2.github.io/teaching/csci132-fall-2022/labs/SinglyLinkedList.java) and [SinglyLinkedListDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/labs/SinglyLinkedListDemo.java). Also, move your `Movie` class from Lab 6 into your Lab 7 package.

### Part 1

Test out the `SinglyLinkedList` with both strings and movies. Edit the
`SinglyLinkedListDemo` file.

You'll notice that the code uses the `StringBuilder` class in the `toString()`
method. You can read more about it [here](https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/).

### Part 2

Write a `get(int index)` method for `SinglyLinkedList` that returns the value
held at the node at the given index. If there is no nodoe at that index,(i,.e.,
the index is too big or is negative), return `null`.

## Sample run
You don't need to match the output format, but here is an example.
```java
Adding some airports...
(SLC, SEA, LAX, BZN)
Removing an airport...
(LAX, BZN)

Adding some movies...
(Pulp Fiction (1994), Tora! Tora! Tora (1970), Parasite (2019))

Testing the get() method...
null
Tora! Tora! Tora (1970)
null
```

## Grading - 10 points
* 3 points - you make a few calls to the `addFirst()`, `addLast()`, and `removeFirst()`
	methods with strings
* 3 points - you make a few calls to the `addFirst()`, `addLast()`,  and `removeFirst()`
	methods with movies
* 4 points - you implement the `get()` method correctly and demonstrate it in
	the `SinglyLinkedListDemo.java` file.

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, October 18th.
