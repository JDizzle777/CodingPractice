#include <iostream>
#include <cmath>
#include <vector>
using namespace std;


// function prototype
bool IsPrime(long long);
void FindPrimes(long long, vector<long long>&);


// MAIN
int main(){
	// variables
	long long number = 600851475143;
	vector<long long> primeFactors;
	long long largestPrime = 1;

	// find primes
	FindPrimes(number, primeFactors);

	// loop through primeFactors and find the largest prime number
	cout << "Largest Prime Number of " << number << " = " << primeFactors[primeFactors.size()-1] << endl;

	// return success
	return 0;
}


// function implementations
bool IsPrime(long long x){	
	if(x < 2){
		return false;	
	} 
	for(long long i = 2; i <= sqrt(x); i++){
		if((x % i) == 0){
			return false;
		}
	}
	return true;
}


void FindPrimes(long long x, vector<long long> &primes){
	// if not large enough
	if(x < 2){
		return;
	}

	// loop through number
	for(long long i = 2; i < sqrt(x); i++){
		// is divisible by i
		if((x % i) == 0){
			// is i prime?
			if(IsPrime(i)){
				primes.push_back(i);		
			}
		}
	}
}