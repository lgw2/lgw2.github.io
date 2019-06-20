---
collection: teaching
title: "Dictionaries"
venue: "June 20"
type: "Lecture"
date: 2019-06-20
---

## Reading
Chapter [12](https://runestone.academy/runestone/static/thinkcspy/Dictionaries/toctree.html).

## Key ideas

### From chapter 12
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

## Active learning
### Activity 1
Download [raven.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/raven.py) and
[raven.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/raven.txt). Edit
raven.py to find the counts of every letter in the text using a dictionary.
