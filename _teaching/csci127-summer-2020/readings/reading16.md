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


## Reading
Read [Data Manipulation With Pandas](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.00-Introduction-to-Pandas.ipynb),
[Introducing Pandas Objects](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.01-Introducing-Pandas-Objects.ipynb),
and [Operating on Data in Pandas](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/03.03-Operations-in-Pandas.ipynb).
Note: the book uses some deprecated Pandas functionality! In particular, the
`.ix` way to index and the `density` attribute of data frames are no longer
used, and any cells that use those will not run.
