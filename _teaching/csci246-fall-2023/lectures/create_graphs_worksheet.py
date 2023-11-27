import matplotlib.pyplot as plt
import numpy as np


def f1(n):
    return 3*n**2 - 100*n + 2


def f2(n):
    return 2**n


def f3(n):
    return n**2


def f4(n):
    return np.log2(10*n)


def f5(n):
    return np.where(n % 2 == 1, 6 * n ** 2 + 2 * n + 3, 6)


def f6(n):
    return 10*n + 5000


# Creating an array of n values
n_values = np.linspace(1, 300, 300)

# Applying the functions to n values
f1_values = f1(n_values)
f2_values = f2(n_values)
f3_values = f3(n_values)
f4_values = f4(n_values)
f5_values = f5(n_values)
f6_values = f6(n_values)

# Plotting the function
plt.rcParams.update({'font.size': 12})
plt.figure(figsize=(10, 6))
f1_line, = plt.plot(n_values, f1_values, label=r"$f_1(n) = 3n^2 - 100n + 2$")
f2_line, = plt.plot(n_values, f2_values, label=r"$f_2(n) = 2^n$")
f3_line, = plt.plot(n_values, f3_values, label=r"$f_3(n) = n^2$")
f4_line, = plt.plot(n_values, f4_values, label=r"$f_4(n) = log_2(10n)$")
f6_line, = plt.plot(n_values, f6_values, label=r"$f_6(n) = 10n + 5000$")
plt.xlabel("n")
plt.ylabel("f(n)")
# plt.legend()
# plt.yticks([])
plt.annotate(r"$f_2(n) = 2^n$", xy=(18, 18000))
plt.annotate(r"$f_1(n) = 3n^2 - 100n + 2$", xy=(55, 15000))
plt.annotate(r"$f_3(n) = n^2$", xy=(108, 10000))
plt.annotate(r"$f_4(n) = log_2(10n)$", xy=(80, 1000))
plt.annotate(r"$f_6(n) = 10n+5000$", xy=(110, 4800))

# Setting the x and y axis boundaries
plt.xlim(0, 140)  # Set the x-axis limits
plt.ylim(-100, 20000)  # Set the y-axis limits

# Saving plot
plt.savefig('worksheet1.png')

# Add f5
plt.clf()
f5_line, = plt.plot(n_values, f5_values, label=r"$f_5(n)$")
f1_line, = plt.plot(n_values, f1_values, label=r"$f_1(n) = 3n^2 - 100n + 2$")
f3_line, = plt.plot(n_values, f3_values, label=r"$f_3(n) = n^2$")
plt.legend()
plt.xlim(0, 90)  # Set the x-axis limits
plt.ylim(-100, 50000)  # Set the y-axis limits

# Saving plot
plt.savefig('worksheet2.png')
