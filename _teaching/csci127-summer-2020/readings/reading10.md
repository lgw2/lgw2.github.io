---
collection: teaching
title: "Dictionaries"
venue: "June 5"
type: "Reading"
date: 2020-06-05
---
## Logistics
* Due: Friday, June 5th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 12. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
* A dictionary is an unordered collection of key-value pairs.
* Creating an empty dictionary: `homeruns = {}`
* Adding a key-value pair: `homeruns["Babe Ruth"] = 713` (note: he hit 714)
* Adding another pair: `homeruns["Mickey Mantle"] = 536`
* Deleting an item: `del homeruns["Mickey Mantle"]`
* Modifying an item: `homeruns["Babe Ruth"] = 714`
* Determining the number of items in a dictionary: `len(homeruns)`

Keys
* To retrieve all keys in a dictionary named inventory: `inventory.keys()`
* To retrieve all keys as a list: `list(inventory.keys())`
* To retrieve keys one at a time: `for key in inventory:`
* To check if a key named "kiwi" exists: `if "kiwi" in inventory`

Values
* To retrieve all values: `inventory.values()`
* To retrieve a specific value, producing a runtime error if the key is not present: `inventory[key-name]`
* To retrieve a specific value, producing NO runtime error if the key is not present: `inventory.get(key-name)`
or `inventory.get(key-name, value-to-return-if-key-not-present)`

Key-Value Pairs
* To retrieve all key-value pairs: `inventory.items()`

Aliasing vs. copying
* An example of an alias: `dictionary1 = dictionary2`
* The expression `dictionary2 is dictionary1` returns `True`
* An example of a copy: `dictionary2 = dictionary1.copy()`
* The expression `dictionary2 is dictionary1` returns `False`
* A dictionary handles sparse data well. For example, consider keeping track of how many times a word occurs
in a novel such as The Catcher in the Rye. Only words that appear one or more times need to be stored.

## Assignment
* Complete the required number of activities for each subsection in
[Dictionaries](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37657).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Download [raven.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/raven.py) and
[raven.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/raven.txt). Edit
raven.py to find the counts of every letter in the text using a dictionary.

### Activity 2
Download [raven_words.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/raven_words.py) and
1. Modify
raven_words.py to produce a file word_counts.txt that contains the counts of each word in the file raven.txt, in
alphabetical order. The first few lines of word_counts.txt should look something like this:
```
a 15
above 7
adore 1
again 1
agreeing 1
ah 2
aidenn 1
air 1
all 4
an 2
ancient 1
and 38
angels 4
answer 1
```
Hint: you may need to cast a dict_keys object to a list using `list()`

2. Modify your program to also print the longest word in the file.
