# variables
maxPalindrome = 0

# loop to find the largest palindrome that is a product of two 3-digit number
for i in range(100,999):
	for j in range(100,999):
		if (str(i*j) == str(i*j)[::-1]) & ((i*j) > maxPalindrome):
			maxPalindrome = i*j;

# print result
import sys
print(sys.version)
print('Max palindrome that is a product of two 3-digit numbers is', maxPalindrome)