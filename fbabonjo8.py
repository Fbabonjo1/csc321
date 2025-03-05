#Fatoma Babonjo

import random

randNum = random.randint(0,9)

x = 0
y = 0


print("Guess a number between 0 and 9: ")

y = int(input())

for i in  range(y):
    print("This is the for loop")
    print("You missed that one! Try another!")

while x <10:
    print("This is the while loop")
    print("I really love pizza!")
    x = x + 1
