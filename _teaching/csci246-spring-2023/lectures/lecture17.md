---
collection: teaching
title: "Lecture 17: Applications of array data structures"
---

[lecture video](https://youtu.be/qdftf4Vs5Bo)

### Textbook chapters
3.1

### What is a data structure?

* A way to store information that's a higher level of
abstraction than 1s and 0s
* Has defined ways that we interact with it (this is more like an ADT, abstract
	data type)
* Has an impelementation of those ways of interacting (this is a more precise
	definition: an implementation of an ADT)

### What benefits do arrays have as data structures? Drawbacks?

* hold multiple pieces of information
* because of the above, we can have algorithms that
deal with multiple pieces of information instead of just one
* in java, we already have array objects
with predefined methods
* the information is ordered
* we can change what is stored in each slot
* can store duplicates
* (drawback) can't change the length
* (drawback) we can only store one data type

### Scoreboard

Suppose I want to be able to hold *n* high scores, ranked, in an array.

I want to be able to call `add()` and pass in a new entry, and after the entry
is added, the scoreboard should still be correct.

### Files used in class
* [GameEntry.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/GameEntry.java)
* [Scoreboard.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Scoreboard.java)
* [ScoreboardDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ScoreboardDemo.java)
* [Scoreboard.pdf](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Scoreboard.pdf)
