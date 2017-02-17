import math

# variables
i = 1
sumOfSquares = 0
sum = 0

# loop to calculate sum of squares
while i <= 100:
	sumOfSquares += math.pow(i, 2)
	sum += i
	i += 1

# calculate square of the sum
squareOfSum = math.pow(sum, 2);

# calculate difference
print("The difference between the sum of the squares of the first 100 numbers and the square of the sum is ", (squareOfSum-sumOfSquares))