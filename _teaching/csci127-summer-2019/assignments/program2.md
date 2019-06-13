---
collection: teaching
title: "Program 2"
venue: "Due June 17"
type: "Programming Assignment"
date: 2019-06-17
---

## Logistics
* Due date: Monday, June 17th no later than 11:59 p.m.
* Submission instructions: upload your solution, entitled YourFirstName-YourLastName-Program2.py to the BrightSpace Program 2 Dropbox.
* Deadline Reminder: Once the submission deadline passes, BrightSpace will no longer accept your
Python submission and you will no longer be able to earn credit.
Thus, if you are not able to fully complete the assignment, submit whatever you have before
the deadline so that partial credit can be earned.

## Learning Outcomes
* To solve this problem, you need to understand the following Python concepts:
data types, functions, selection statements, iteration, and lists.

## Background Information
In this assignment, you will write a program to score a five-card
cribbage hand. Here are the rules for scoring:
* A hand consists of five different cards. Each card contains a rank and a suit. All ranks will be "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king" or "ace". All suits will be "clubs", "diamonds", "hearts" or "spades".
* If all five cards have the same suit, that is called a flush and is worth 5 points. For example, if all five cards are "diamonds", that is a flush.
* If any two cards have the same rank, that is called a pair and is worth 2 points. For example, if the ranks of the cards are "two", "two", "two", "five" and "five", there are four pairs for a total of 8 points.
* If any two cards add up to 15, that is called a fifteen and is worth 2 points. An "ace" is worth 11, a "king" is worth 10, a "queen" is worth 10, a "jack" is worth 10, and all other cards are worth their face value (e.g. a "seven" is worth 7). For example, if the ranks of the cards are "six", "seven", "seven", "eight" and "nine", there are three fifteens for a total of 6 points. Note: In this simplified version of Cribbage, only pairs of cards that add up to 15 are worth 2 points. Fifteens that are produced by three or more cards are worth 0 points.
* The value of a hand is the sum of anything that scores points. For example, a hand consisting of a "three", "four", "four", "six" and "nine" is worth 4 points (2 for the pair of "fours", 2 for the fifteen).

## Assignment
* Download [cribbage.py](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/cribbage.py) and modify it so that when it is run on
[this input file](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/cribbage.txt), it produces [this output](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/output.txt), in the Python shell.
Note: the input file (cribbage.txt) should be located in the same directory
as the Python program.

## Assumptions
* The input file can contain any number of cribbage hands. Each line contains a five card cribbage hand in this format: Card 1 Rank, Card 1 Suit, Card 2 Rank, Card 2 Suit, Card 3 Rank, Card 3 Suit, Card 4 Rank, Card 4 Suit, Card 5 Rank, Card 5 Suit.
* All cribbage hands are valid.
* Note: Your program might be tested on a different set of cribbage hands so it is important to make your solution as general as possible.
* Note: The cards in a cribbage hand can appear in any order.

## Grading - 100 points
* 10 points - Every flush is identified correctly. (All or nothing.)
* 15 points - Every pair is identified correctly. (5 points for each incorrect answer up to 15 points.)
* 25 points - Every fifteen is identified correctly. (5 points for each incorrect answer up to 25 points.)
* 15 points - A separate function is used to determine each different type of scoring (e.g. flush, pairs, fifteens). (5 points for each missing function up to 15 points.)
* 20 points - The format of your output matches the format of the sample output exactly. (4 points for each type of difference up to 20 points.)
* 15 points - The Python solution is properly commented, easy to understand, high quality and does not contain unnecessary code. (3 points for each type of improvement up to 15 points.)
