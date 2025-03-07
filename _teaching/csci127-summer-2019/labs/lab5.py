# --------------------------------------
# CSCI 127, Lab 6                      |
# June 16, 2019                        |
# Your Name                            |
# --------------------------------------

# The missing functions go here.

# --------------------------------------

def main(file_name):
    magnitude = average_magnitude(file_name)
    print("The average earthquake magnitude is {:.2f}\n".format(magnitude))

    earthquake_locations(file_name)

    lower_bound = float(input("Enter a lower bound for the magnitude: "))
    upper_bound = float(input("Enter an upper bound for the magnitude: "))
    how_many = count_earthquakes(file_name, lower_bound, upper_bound)
    print("Number of recorded earthquakes between {:.2f} and {:.2f} = {:d}".format(lower_bound, upper_bound, how_many))

# --------------------------------------

main("earthquakes.csv")
