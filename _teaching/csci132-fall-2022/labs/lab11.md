---
collection: teaching
title: "Lab 9"
---

## Logistics
* Due: on Thursday, November 10th anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* practice using Java's `ArrayList`
* practice checking user input
* practice handling an exception

## Assignment

In this assignment, you will complete software for managing a bike rental
shop's inventory. The software uses an `ArrayList` as an internal data
structure.

First, download the [starter code](https://lgw2.github.io/teaching/csci132-fall-2022/labs/lab11_starter.zip), run it, and take a look a the two files. Make sure
you understand its structure and what it is trying to accomplish.

Then, locate the five `TODO`s in the `BikeReservations.java` file and complete
them. You don't need to modify the `BikeRental.java` file.

### Book pages

The starter code points you two pages in the book to help.
* [textbook_p40.png](https://lgw2.github.io/teaching/csci132-fall-2022/labs/textbook_p40.png)
* [textbook_p82.png](https://lgw2.github.io/teaching/csci132-fall-2022/labs/textbook_p82.png)

### Sample output
```
*** Welcome Valued Employee! ***

We currently have 5 bikes available for rent.
Remember, bikes are numbered beginning with zero.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > a
Bike 0	 is available for rent.
Bike 1	 is available for rent.
Bike 2	 is available for rent.
Bike 3	 is available for rent.
Bike 4	 is available for rent.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > L
Bike	First	Last	Hours
0	--	--	0.0
1	--	--	0.0
2	--	--	0.0
3	--	--	0.0
4	--	--	0.0

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > r
Bike Number: 0
First name: Dan
Last name: D.
Hours rented: 4
Reservation Complete.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > R
Bike Number: three
Please enter a valid integer.
13
Choose a number between 0 and 4

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > r
Bike Number: 3
First name: Bill
Last name: Murray
Hours rented: 300
Reservation Complete.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > a
Bike 1	 is available for rent.
Bike 2	 is available for rent.
Bike 4	 is available for rent.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > r
Bike Number: 3
Sorry, that bike is already out.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > l
Bike	First	Last	Hours
0	Dan	D.	4.0
1	--	--	0.0
2	--	--	0.0
3	Bill	Murray	300.0
4	--	--	0.0

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > c
Bikes rented: 2
Which bike is being returned?
1
That bike is already in

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > c
Bikes rented: 2
Which bike is being returned?
0

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > c
Bikes rented: 1
Which bike is being returned?
3

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > c
Bikes rented: 0
No bikes are checked out.

(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > q
<end>
```

## Grading - 10 points
2 points per `TODO`

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, November 15th.
