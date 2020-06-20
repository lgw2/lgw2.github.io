import matplotlib.pyplot as plt
import pandas as pd

# -------------------------------------------------
# CSCI 127, Lab 11                                |
# June 23, 2020                                   |
# Your Name                                       |
# -------------------------------------------------

##### your code here

##### do not change anything below this line

def main():

    print("This program calculates some information from billionaires.csv.\n")

    data = pd.read_csv('billionaires.csv')
    rows, columns = get_data_shape(data)
    total_wealth_by_year = compute_total_wealth(data)
    num_women = compute_num_women(data)
    plot_histogram(data, "age_histogram.png")

    print("The data set has {} rows and {} columns.".format(rows, columns))
    print("\nThe total wealth of billionaires (in billions) by year was:")
    print(total_wealth_by_year)
    print("\nThe number of female billionaires in the data set is {}.".format(num_women))

main()
