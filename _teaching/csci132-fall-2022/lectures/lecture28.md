---
collection: teaching
title: "Lecture 27: Going over quiz; intro stacks + queues; intro Project 4"
---

Lecture video kept cutting out so not bothering to post to YouTube...see three short videos on [Panopto](https://montana.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=761aede1-cd37-4643-af61-af3b01276d2e).

### Textbook chapters
6.1-6.2

### Abstract data type (ADT)
Abstraction of a data structure.

Specifies:
* data stored
* operations on the data
* error conditions associated with operations

### Stack
Has operations:
* `push(object)`: inserts an element at top
* `pop()`: removes and returns top element
* `top()` (or `peek()`): returns element at top of stack without removing
* `size()`: returns the number of elements stored
* `isEmpty()`: returns whether the stack is empty

Java has an implementation: [java.util.Stack](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html)

We can implement with an internal array or an internal linked list. See Project 4.

### Queue
Has operations:
* `enqueue(object)`: inserts an element at end
* `dequeue()`: removes and returns top element
* `first()`: returns element at front of queue  without removing
* `size()`: returns the number of elements stored
* `isEmpty()`: returns whether the queue is empty

Java has an implementation: [java.util.Queue](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html)

We can implement with an internal linked list (see Project 4) or an internal
array (see book).
