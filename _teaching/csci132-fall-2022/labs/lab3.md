---
collection: teaching
title: "Lab 3"
---

## Logistics
* Due: on Thursday, September 15th  anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your `Pet.java` file to the Lab 3
	assignment on D2L. (Note that you don't need to change `PetDemo.java`, so
	you don't need to turn it in.)


## Learning outcomes
* Practice using inheritance
* Practice using an existing Java class

## Assignment

Given the driver class `PetsDemo.java` and the (mostly) complete abstract `Pet`
class, create a `Cat` class and a `Dog` class to extend `Pet`, and provide concrete
methods for the abstract `getAgeInHumanYears()`. The `Pet` class itself also has a
`getAge()` method that needs to be finished before it will work correctly.

Inside the `getAgeInHumanYears` method, there are links that explain how to
calculate the age of cats and dogs in human years. Note that you do not need to
extrapolate between years! For example, a 9 month old dog can be considered to
be 0 years old, and a 13 month old dog can be considered to be 1 year old.

## Sample run
After you implement the `Pet` and `Cat` classes and finish the `getAge` method
in the `Pet` class, the output of `PetDemo.java` should be:
```
Chuki is 44 in human years.
Buster is 0 in human years.
Aspen is 64 in human years.
Old Aspy is actually 12 years old.
```

## Grading - 10 points
* 3 points - `getAge()` is implemented and works correctly in the `Pet` class.
* 4 points - `Cat` and `Dog` classes are created, and they properly extend the `Pet` class.
* 2 points - both `Cat` and `Dog` `getAgeInHumanYears` methods calculate the correct age.
* 1 points - Your code is clean and easy to read -- no unused clutter code or commented-out code.

## Go beyond

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, September
20th.
