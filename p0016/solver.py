#!/usr/bin/python

number = 2 ** 1000
number = str(number)
print(number)

summation = 0
for x in number:
	y = int(x)
	summation += y

print(summation)

