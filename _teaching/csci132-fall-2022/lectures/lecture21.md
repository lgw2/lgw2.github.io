---
collection: teaching
title: "Lecture 21: Circularly linked lists; doubly linked lists"
---

[lecture video]()

### Textbook chapters
3.3-3.4

### Curcularly linked lists

Suppose I'm a pilot who always flies from Bozeman to Minneapolis to Seattle to
Bozeman to Minneapolis...

I want to keep track of my next three flights. If I'm in Bozeman, my next three
flights are Minneapolis->Seattle->Bozeman. If I'm in Seattle, they're
Bozeman->-Minneapolis->Seattle.

We want a `rotate()` method!

### Doubly linked lists

We can add some symmetry to our linked lists by making them doubly linked.
That is, we change our `Node`s to have references to both a next node (`next`)
and a previous node (`prev`).

We also add *sentinels* at the beginning and end of our list to make boundary
cases easier. This way, we can use the same code to add and remove nodes even
when the list is empty.


### Files used in class
* [CircularlyLinkedList.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CircularlyLinkedList.java)
* [CircularlyLinkedListDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CircularlyLinkedListDemo.java)
* [CircularlyLinkedList.pdf](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CircularlyLinkedList.pdf)
* [DoublyLinkedList.java](https://lgw2.github.io/teaching/csci132-fall-2022/labs/DoublyLinkedList.java)

### Additional problems
