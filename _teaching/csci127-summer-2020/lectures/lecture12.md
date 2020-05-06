---
collection: teaching
title: "pandas"
venue: "July 2"
type: "Lecture"
date: 2019-07-02
---

## Reading
Pandas documentation can be found [here](https://pandas.pydata.org/pandas-docs/stable/).

## Key ideas
We will use [imbd_1000.csv](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/imbd_1000.csv) to demo pandas.
* reading in data from files: `pd.read_csv()`
* creating data frame from existing data: `pd.DataFrame()`
* data_frame.shape
* data_frame.head(), data_frame.tail()
* accessing columns: data_frame.column or data_frame['column']
* filtering data: data_frame[data_frame.column == condition]
* selecting a subset of colunmns
* data_frame.value_counts()
* data_frame.column.sort_values()
* groupby

## Additional resources
You can view some example Python code using pandas in the following two files:
* [lesson1.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/lesson1.py)
* [lesson2.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/lesson2.py)

Note: these use plotting directly from pandas, which we did not cover.
You can use this in Program 6 if you would like. See the documentation:
[https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.plot.html](https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.plot.html).
