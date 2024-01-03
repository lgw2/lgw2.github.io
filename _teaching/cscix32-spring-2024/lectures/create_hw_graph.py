import matplotlib.pyplot as plt
import numpy as np


# Defining f1
def f1(n):
    return 3*n**3 + 5*n**2 - 2 * n


# Defining f2
def f2(n):
    return 4*n**3


# Creating an array of n values
n_values = np.linspace(0, 10, 10)

# Applying the functions to n values
f1_values = f1(n_values)
f2_values = f2(n_values)

# Plotting the function
# plt.rcParams.update({'font.size': 24})
# plt.figure(figsize=(10, 6))
f1_line, = plt.plot(n_values, f1_values, label=r"$f(n)$")
f2_line, = plt.plot(n_values, f2_values, label=r"$c \cdot (n)$")
plt.xlabel("n")
plt.ylabel("f(n)")
plt.legend()
# plt.yticks([])
# plt.box(False)
# plt.subplots_adjust(bottom=0.2)

# Setting the x and y axis boundaries
# plt.xlim(0, 200)  # Set the x-axis limits
# plt.ylim(-100, 70000)  # Set the y-axis limits

# Saving plot
plt.savefig('hw11.png')
