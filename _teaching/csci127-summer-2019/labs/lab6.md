---
collection: teaching
title: "Lab 6: Dictionaries"
venue: "June 20"
type: "Lab"
date: 2019-06-20
---

## Logistics
* Due: Thursday, June 20th no later than 5pm.
* Submission instructions: upload solution,
entitled FirstName-LastNameLab6.py
to the BrightSpace Lab 6 Dropbox.
* Deadline reminder: once this deadline passes, BrightSpace will no longer accept your Python
submission and you will no longer be able to earn credit. Thus, if you are not able to fully
complete the assignment, submit whatever you have before the deadline so that partial credit can be earned.

## Learning outcomes
Gain experience with dictionaries.

## Preliminaries
* ASCII (American Standard Code for Information Interchange) is an older code used by computers to
represent characters (such as the character "X") with 8 binary digits (or bits). [Here](https://www.sciencebuddies.org/science-fair-projects/references/ascii-table)
is an ASCII table. Today, Unicode UTF-16, a 16 bit code is more commonly used.
* Download [lab7.py](https://lgw2.github.io/teaching/csci127-summer-2019/labs/lab6.py), rename it according to the instructions
above, and make sure you understand it.
* Download input file [ascii-codes.csv](https://lgw2.github.io/teaching/csci127-summer-2019/labs/ascii-codes.csv) to the
same directory where you downloaded lab7.py.
Each line in ascii-codes.csv contains 8 bits (0s and 1s), followed by a comma, followed by the character that
the 8 bits represents. In general, the character will be of length 1 such as the character X. However,
there are two exceptions: " " is represented by space and "," is represented by comma.


## Assignment
* Take the program above and modify it by adding the `create_dictionary function`.
The parameter `file_name` is the name of a csv file that contains an unknown number of lines that reflect ASCII encodings.
The format of this file is described in the bullet above. The function should return a dictionary where the keys are
characters and the values are the 8 bit representations. Note: use " " and "," as keys instead of space and comma.
* Take the program above and modify it by adding the `translate` function.
The parameter sentence consists of an unknown number of characters. The parameter dictionary is the dictionary that was
created by the `create_dictionary` function. The parameter `file_name` is the name of the output file where all output should be sent.
In the output file, each character in sentence should appear on its own line, followed by a space,
followed by its 8 bit representation. If a character does not appear in the dictionary, the word UNKNOWN should
appear instead of an 8 bit representation.
* When the program is run, it should produce the following three output files: [output-1.txt](https://lgw2.github.io/teaching/csci127-summer-2019/labs/output-1.txt),
[output-2.txt](https://lgw2.github.io/teaching/csci127-summer-2019/labs/output-2.txt)
and [output-3.txt](https://lgw2.github.io/teaching/csci127-summer-2019/labs/output-3.txt) .

## Sample output
In [this sample run](https://lgw2.github.io/teaching/csci127-summer-2019/labs/output.txt),
the user input 5.0 for the lower bound and 6.0 for the upper bound.

## Grading - 10 points
2 points - The `create_dictionary` function returns a dictionary that contains the correct binary code for each character of length one.

1 point - The `create_dictionary` function returns a dictionary that contains the correct binary code for " " and ",".

4 points - When your program is tested with different values for the variable `sentence`, characters that exist in
the dictionary are translated correctly. For each different character that is translated incorrectly, one point will be deducted.

1 point - When your program is tested with different values for the variable `sentence`, characters that do NOT exist in
the dictionary are translated correctly to UNKNOWN.

1 point - The format of any output files created match the format of the sample output files exactly.

1 point - In a comment at the top of the python file that you submit, explain why the comma character
and the space character are treated differently in ascii-codes.csv.

## Grading turnaround
All labs graded with scores recorded in BrightSpace no later than lab time (2pm) the following day.
