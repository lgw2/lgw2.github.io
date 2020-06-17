---
collection: teaching
title: "Numpy Arrays and Python Notebooks"
venue: "June 19"
type: "Reading"
date: 2020-06-19
---
## Logistics
* Submission instructions: you do not need to submit this reading.

## Key ideas
* Using `plt.plot`.
* Adjust line color a style using `color` and `linestyle`.
* Setting axis limits using `plt.xlim`, `plt.ylim`, and `plt.axis`.
* Setting title and axis labels using `plt.title`, `plt.xlabel`, and
    `plt.ylabel`.
* Matlab interface vs. object oriented interface.
* Other `plt.plot` paramters, e.g. `markersize`.
* `plt.scatter`.
* Creating histograms with `plt.hist`.
* Creating subplots.
* Color and line style abbreviations in documetation [here](https://matplotlib.org/api/pyplot_api.html#matplotlib.pyplot.plot).

## Reading
Read [Vizualization With
Matplotlib](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/04.00-Introduction-To-Matplotlib.ipynb) (you can ignore any mentions of Pandas and the IPython shell),
[Simple Line
Plots](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/04.01-Simple-Line-Plots.ipynb),
[Simple Scatter
Plots](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/04.02-Simple-Scatter-Plots.ipynb),
[Histograms and
Binnings](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/04.05-Histograms-and-Binnings.ipynb) (but stop before "Two Dimensional Histograms and Binnings),
and [Multiple
Subplots](https://colab.research.google.com/github/jakevdp/PythonDataScienceHandbook/blob/master/notebooks/04.08-Multiple-Subplots.ipynb) (but stop before "`plt.GridSpec`: More complicated Arrangements").
You will not need to make a copy of these notebooks, but you will need to be
signed into a Google account to run the code cells.

## Optional Activities
### Activity 1
Download [graph.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/graph.py)
* Modify graphs.py to label the x-axis as x and the y-axis as y.
* Modify graphs.py to plot the straight lines with magenta dashes. Hint.
* Modify graphs.py to draw the sine wave with 5 point size.
* Add your own function `plot_new_func` that plots a different sort of function on the
same plot. Comment your function using a docstring.

### Activity 2
Download [diceSimulator.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/diceSimulator.py).
* change the simulator to roll 3 dice and display the results.
* change the simulator to roll 10,000 times.

### Acitivty 3
Download [montana.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/montana.py)
and
[montana.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/montana.txt).
* Modify the program above so that it shows the net population increase (or decrease) from one census date to the next in a second figure. (The first figure should continue to show the original graph.)
