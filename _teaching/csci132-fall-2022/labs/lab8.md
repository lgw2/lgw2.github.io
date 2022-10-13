---
collection: teaching
title: "Lab 8"
---

## Logistics
* Due: on Thursday, October 20th anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* Understand doubly linked lists

## Assignment

Download [DoublyLinkedList.java](https://lgw2.github.io/teaching/csci132-fall-2022/labs/DoublyLinkedList.java), the book's doubly linked list implementation. Compare it to the Java [LinkedList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html). You'll notice that the book's implementation is missing quite a few methods! In this lab, you'll write some of those.

| Modifier and Type | Method                    | Description                                                                             |   |   |
|-------------------|---------------------------|-----------------------------------------------------------------------------------------|---|---|
| `void`              | `add(int index, E element)` | Inserts the specified element at the specified position in this list.                   |   |   |
| `void`              | `add(E e)`                  | Appends the specified element to the end of this list.                                  |   |   |
| `void`              | `clear()`                   | Removes all of the elements from this list.                                             |   |   |
| `E`                 | `get(int index)`            | Returns the element at the specified position in this list                              |   |   |
| `E`                 | `set(int index, E element)` | Replaces the element at the specified position in this list with the specified element. |   |   |

### Big hint

Take a good look at the private method `addBetween()` and make sure you understand it. Even though it is private and can't be called outside of `DoublyLinkedList`, it is very powerful can be reused by other methods within `DoublyLinkedList`. We want to write programs that are D.R.Y. (do not repeat code), so make sure you call `addBetween()` when you need to.

### Sample output

You should demo each method. Here's an example. Your implementation is generic,
so you could also try your methods on other types besides integers.

```
Add Integers: 5 9 1 8
(5, 9, 1, 8)
Add Integer 7 at index 2:
(5, 9, 7, 1, 8)
Add Integer 7 at index 8:
Index 8 out of range.
(5, 9, 7, 1, 8)
Clear the list:
()
Add 10 11 12 13, get index 3:
value is 13
Get index 4:
Index 4 out of range.
value is null
Set index 2 to 22:
(10, 11, 22, 13)
Set index 7 to 77:
Index 7 out of range.
(10, 11, 22, 13)
```

## Grading - 10 points
* 8 points: implement and demo each method (2 points each)
* 2 points: DRY code

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, October 25th.
