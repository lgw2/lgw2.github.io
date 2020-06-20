---
collection: teaching
title: "Pandas 1"
venue: "June 22"
type: "Reading"
date: 2020-06-22
---
## Logistics
* Submission instructions: you do not need to submit this reading.

## Key ideas
* To read in a data frame from csv, us `pd.read_csv(filename)`
* data_frame.shape
* data_frame.head(), data_frame.tail()
* accessing columns: data_frame.column or data_frame['column']
* filtering data: data_frame[data_frame.column == condition]
* selecting a subset of colunmns
* the pandas documentation is [here](https://pandas.pydata.org/).
* An example file to practice using pandas with is [imdb_1000.csv](https://lgw2.github.io/teaching/csci127-summer-2020/readings/imbd_1000.csv).


## Reading
Read [Data Manipulation With Pandas](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.00-Introduction-to-Pandas.ipynb),
[Introducing Pandas Objects](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.01-Introducing-Pandas-Objects.ipynb),
and [Operating on Data in Pandas](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.03-Operations-in-Pandas.ipynb).
Note: the book uses some deprecated Pandas functionality! In particular, the
`.ix` way to index and the `density` attribute of data frames are no longer
used, and any cells that use those will not run.

## Optional activities
1. Download [bridger_snowfall.py](https://lgw2.github.io/teaching/csci127-summer-2020/readings/bridger_snowfall.py). Then:
* create a dataframe with three columns: `Year`, `Total`, and `Largest`.
* write the dataframe to a csv using the `to_csv` method for data frames.
* print the shape of the data frame.
* create a second data frame, `big_snow_years`, which includes only years with
    at least 250 inches of snow.
* create a bar chart showing total snowfall per year.
