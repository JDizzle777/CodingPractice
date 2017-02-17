import math, time

# start time
s = time.time()

# function that tells if prime or not
def IsPrime(n):
	if n == 2 or n == 3:
		return 1
	elif n % 2 == 0:
		return 0

	i = 3
	range = int(math.sqrt(n)) + 1
	while i < range:
		if n % i == 0:
			return 0
		i += 1

	# is a prime number
	return 1




# variables
x = 10001
count = 1
j = 3

# loop over all numbers from 2 to 10001
while count < x:
	if IsPrime(j) == 1:
		count += 1
		print(j, "is prime?")
	j += 2 

print("The", count, "st prime number is ", j-2)
print(time.time() - s)