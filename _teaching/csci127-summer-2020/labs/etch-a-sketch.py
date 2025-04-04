# -----------------------------------------+
# Your name                                |
# CSCI 127, Lab 1                          |
# Last Updated: June 6, 2019               |
# -----------------------------------------|
# Modify an etch-a-sketch program.         |
# -----------------------------------------+

import turtle
import random

window = turtle.Screen()

pencil = turtle.Turtle()
square = turtle.Turtle()

# ---------------------------------

def draw_square(square):
    square.up()
    square.goto(-200, 200)
    square.down()
    square.begin_fill()
    for i in range(4):
        square.forward(50)
        square.right(90)
    square.end_fill()

# ---------------------------------

def drawing_controls(x, y):
    if (-200 <= x <= -150) and (150 <= y <= 200):
        red = random.random()
        green = random.random()
        blue = random.random()
        pencil.color(red, green, blue)

# ---------------------------------

def main():
    pencil.shape("circle")

    text = turtle.Turtle()
    text.hideturtle()
    text.up()
    text.goto(-205, 205)
    text.write("Change Color")

    square.speed(0)
    square.hideturtle()
    draw_square(square)

    window.onclick(drawing_controls)
    pencil.onrelease(pencil.goto)

# ---------------------------------

main()
