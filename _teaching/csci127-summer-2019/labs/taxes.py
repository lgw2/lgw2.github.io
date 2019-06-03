# ---------------------------------------
# CSCI 127, Joy and Beauty of Data      |
# Lab 2: Tax Calculator                 |
# Your Name                             |
# Date: January 24, 2019                |
# ---------------------------------------
# Calculate the amount of tax owed by an|
# unmarried taxpayer in tax year 2018.  |
# ---------------------------------------

# The missing Python function goes here.

# ---------------------------------------

def process(income):
    print("The 2018 taxable income is ${:.2f}".format(income))
    tax_owed = unmarried_individual_tax(income)
    print("An unmarried individual owes ${:.2f}\n".format(tax_owed))

#---------------------------------------

def main():
    process(5000)      # test case 1
    process(20000)     # test case 2
    process(50000)     # test case 3
    process(100000)    # test case 4
    process(200000)    # test case 5
    process(400000)    # test case 6
    process(600000)    # test case 7

# ---------------------------------------

main()
