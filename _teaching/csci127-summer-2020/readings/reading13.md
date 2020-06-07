---
collection: teaching
title: "Inheritance"
venue: "June 12"
type: "Reading"
date: 2020-06-12
---
## Logistics
* Due: Friday, June 12th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 19. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
* Inheritance is a key pillar of object oriented programming that allows us to
	reuse code without copy and pasting.
* The syntax to have one `Class2` inherit from `Class1` is `def Class1(Class2):`.
* We can override the funcionality of the parent class in the child class by
	redefining methods.
* We can call methods from the parent class using `super`.
* We can also reuse code using composition: storing a reference to an object
	within a class, rather than inheriting the class.
* It is best to use inheritance when the we can say that the child class is a
	type of the parent class. Otherwise, use composition.


## Assignment
* Complete the required number of activities for each subsection in
[Inheritance](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37772).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional Activities:
### Activity 1
Download [dungeons.py](https://lgw2.github.io/teaching/csci127-summer-2020/readings/dungeons.py).
Add an `Elf` class that is a subclass of `Character`. Make an elf's dexterity
and wisdom 3 greater than the default.
