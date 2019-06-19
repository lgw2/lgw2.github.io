---
collection: teaching
title: "Program 3"
venue: "Due June 22"
type: "Programming Assignment"
date: 2019-06-22
---

## Logistics
* Due date: Saturday, June 22nd no later than 11:59 p.m.
* Submission instructions: upload your solution, entitled YourFirstName-YourLastName-Program3.py to the BrightSpace Program 3 Dropbox.
* Deadline Reminder: Once the submission deadline passes, BrightSpace will no longer accept your
Python submission and you will no longer be able to earn credit.
Thus, if you are not able to fully complete the assignment, submit whatever you have before
the deadline so that partial credit can be earned.

## Learning Outcomes
* To solve this problem, you need to understand the following Python concepts: files.

## Background Information
The input file for this assignment, [weather.csv](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/weather.csv),
is described [here](https://think.cs.vt.edu/corgis/csv/weather/weather.html).

## Assignment
* Using [weather.py](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/weather.py)
(renamed according to the instructions above) as a starting point, supply the missing functions
such that interaction with a user could produce [this sample transcript](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/transcript-weather.txt).
* The function `coldest_temperature` should find the minimum temperature recorded in the file.
It should print this temperature, the location where it was recorded and the date when it was recorded.
Match the output format that appears in the sample transcript exactly. Note: If the minimal
temperature reading occurs more than once, print out the information associated with its first occurrence.
* The function `average_temperature` is passed a location (e.g. Miles City, MT) that the user supplies.
The function prints the number of average temperatures recorded for this location,
as well as the average of these temperatures. Match the output format in the sample transcript.
You may assume that the user enters the location in a valid format (e.g. city name, comma, space, state).
* The function `all_stations_by_state` is passed the state (e.g. Montana) that receives
reporting data from stations. The function finds and prints in alphabetical order the
reporting stations that send their data to this state. Match the output format in the sample transcript.
* Study the Weather CSV Library and develop a function of your own that corresponds to menu option 4.
The function should be interesting, non-trivial and not a simple variation of one of the other functions.
Modify the menu and main functions as appropriate.

## Grading - 100 points
Function `coldest_temperature`: 20 points
* 5 points. The coldest temperature reading is identified correctly. (All or nothing.)
* 5 points. The location of the coldest temperature reading is identified correctly.
If the coldest temperature occurs at more than one location, the first location in the file should be reported. (All or nothing.)
* 5 points. The date of the coldest temperature reading is identified correctly. (All or nothing.)
* 5 points. The three lines of output match the format of the output transcript exactly. (All or nothing.)

Function `average_temperature`: 20 points
* 5 points. The number of readings is calculated correctly when the location appears in the file, regardless of the case of the input. (All of nothing.)
* 5 points. The average temperature is calculated correctly when the location appears in the file, regardless of the case of the input. (All or nothing.)
* 5 points. The two lines of output match the format of the output transcript exactly when the location appears in the file. (All or nothing.)
* 5 points. The two lines of output match the format of the output transcript exactly when the location does NOT appears in the file. (All or nothing.)
Function `all_stations_by_state`: 25 points
* 10 points. The recording stations are identified correctly. (All or nothing.)
* 5 points. The recording stations are printed in alphabetical order. (All or nothing.)
* 5 points. The output matches the format of the output transcript exactly when the state appears in the file. (All or nothing.)
* 5 points. The output matches the format of the output transcript exactly when the state does NOT appears in the file. (All or nothing.)

Your function: 20 points
* 5 points. The function is non-trivial. (All or nothing.)
* 5 points. The function is not a simple variation of one of the other three functions. (All or nothing).
* 10 points. The function works correctly. (All or nothing.)
Style and Quality: 15 points.
The Python solution is of high quality, properly commented, easy to understand and does not contain unnecessary code. (3 points for each type of improvement up to 15 points.)
