#!/usr/bin/python

def generateNext(myArray):
	if len(myArray) < 2:
		print("not enough array elements")
		exit()
	myArray.append(myArray[-1] + myArray[-2])
	return myArray

myArray = [1, 2]
while myArray[-1] < 4000000:
	myArray = generateNext(myArray)
if myArray[-1] > 4000000:
	myArray.pop()

summation = 0
for num in myArray:
	if num % 2 == 0:
		summation += num

print(summation)
