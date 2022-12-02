---
collection: teaching
title: "Lecture 35: Priority queues; dijkstra's algorithm"
---

[Lecture video](https://youtu.be/lGm4SJShMck)

### Textbook chapters
9.1; 14.6

### Priority Queue ADT

A priority queue is similar to a queue, except that when we remove from it, we
remove the highest priority item, not the item that has been in the queue the
longest.

We store data in a priority queue as an *entry*, with fields for data (value
`v`)  and
priority (key `k`). Ususally we say that smaller numbers are higher priority.

A priority queue must support the following operations:
* `insert(k,v)`: create an entry with key `k` and value `v`
* `min()`: return (but do not remove) the min entry (`k`, `v`) having minimal
	key `k`
* `removeMin()` remove and return the min entry
* `size()`: return the number of entries
* `isEmpty()`: return a boolean indicating whether the priority queue is empty

Priority queues can be implemented with heaps (as we've seen). They can also be
implemented using sorted or unsorted lists as the internal data store.

### Dijkstra's algorithm

Dijkstra's algorithm is an example of an algorithm that uses a priority queue.

It takes in a graph and finds the shortest path distance from a given node to
every other node in the graph.

### Additional exercises
* Suppose that you implement a priority queue using an unsorted list as the
	internal data store. What is the runtime of `insert(k,v)`? What about
	`min()` and `removeMin()`?
* Same as the above, but suppose you use sorted list (meaning that you have to
	maintain the sorted list every time an entry is added). What are the
	runtimes?
