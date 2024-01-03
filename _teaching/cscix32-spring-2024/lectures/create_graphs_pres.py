import matplotlib.pyplot as plt
import numpy as np


# Defining f1
def f1(n):
    return 12*n + 1


# Defining f2
def f2(n):
    return np.where(n < 100, 6*n**2 + 2*n + 3, 6)


# Defining f3
def f3(n):
    return 4*n + 1


# Defining f4
def f4(n):
    return 4*(4*n + 1)


# Creating an array of n values
n_values = np.linspace(0, 7500, 7500)

# Applying the functions to n values
f1_values = f1(n_values)
f2_values = f2(n_values)
f3_values = f3(n_values)
f4_values = f4(n_values)

# Plotting the function
plt.rcParams.update({'font.size': 24})
plt.figure(figsize=(10, 6))
f1_line, = plt.plot(n_values, f1_values, label=r"$f_1(n)$")
f2_line, = plt.plot(n_values, f2_values, label=r"$f_2(n)$")
plt.xlabel("n")
plt.ylabel("f(n)")
plt.legend()
# plt.yticks([])
plt.box(False)
plt.subplots_adjust(bottom=0.2)

# Setting the x and y axis boundaries
plt.xlim(0, 200)  # Set the x-axis limits
plt.ylim(-100, 70000)  # Set the y-axis limits

# Saving plot
plt.savefig('zoomed_in.png')

# Setting the x and y axis boundaries
plt.xlim(0, 1500)  # Set the x-axis limits
plt.ylim(-10, 70000)  # Set the y-axis limits

# Saving plot
plt.savefig('zoomed_out.png')

# Setting the x and y axis boundaries
plt.xlim(0, 7500)  # Set the x-axis limits
plt.ylim(-10, 70000)  # Set the y-axis limits

# Saving plot
plt.savefig('even_more_zoomed_out.png')

# Clearing f2 and addig f3
f2_line.remove()
f3_line, = plt.plot(n_values, f3_values, label=r"$f_3(n)$")
plt.legend()
# Setting the x and y axis boundaries
plt.xlim(0, 5000)  # Set the x-axis limits
plt.ylim(-10, 90000)  # Set the y-axis limits

# Saving plot
plt.savefig('added_third.png')

# Adding f4
f4_line, = plt.plot(n_values, f4_values, label=r"$4*f_3(n)$")
plt.legend()

# Saving plot
plt.savefig('added_fourth.png')
