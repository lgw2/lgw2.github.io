---
collection: teaching
title: "Lab 9"
---

## Logistics
* Due: on Friday, October 28th anywhere on earth (6am Saturday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) on D2L.

## Learning outcomes
* Understand two algorithms for computing the prefix average
* Write your own experimental runtime test
* Use your experimental runtime test to make a guess about the theoretical
	(asymptotic) runtime of the two algorithms

## Assignment

Depending on how much you want to challenge yourself, you may write your own
algorithms to compute the prefix average or use the book's. You may also do
your own reasoning about the theoretical anslysis, or look at the book's
explanation.

The book's algorithm are linked at the bottom of the parts of the description
of the two algorithms. If you want to write your own, don't look at these! (Or
at least don't look at them until after you are satisfied with your own
implementations.)

You may also optionally start with this starter code to help organize your
program.

### Prefix averages definition

Given a sequence $x$ consisting of $n$ numbers, we want to compute a sequence
$a$ such that $a_j$ is the average of elements $x_0, x_1, \ldots, x_j$ for $j =
0, 1, \ldots, n-1$. That is,

$$a_j=\frac{\sum^j_{i=0}  x_i}{j+1}$$.

Prefix averages have many applications in economics and statistics. For
example, given the year-by-year returns of a mutual fund, ordered from recent
to past, an investor will typically want to see the fund's average annual
returns for the most recent year, the most recent three years, the most recent
five yeras, and so on. Likewise, given a stream of daily web usage logs, a
website manager may wish to track average usage trends over various time
periods.

We will implement two different algorithms for computing prefix
average, with significantly different running times.



