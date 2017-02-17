#include <iostream>
#include <vector>
using namespace std;

int main(){
	// variables
	int limit = 4000000;
	int count = 0;
	vector<int> fibonacciSequence;

 	// prime the loop
 	fibonacciSequence.push_back(1);
 	fibonacciSequence.push_back(2);

	// loop to add 
	for(int i = 0; fibonacciSequence[i+1] < limit; i++){
		fibonacciSequence.push_back(fibonacciSequence[i] + fibonacciSequence[i+1]);
	}

	// loop again to add even values
	for(int i = 0; i < fibonacciSequence.size(); i++){
		// if even
		if(fibonacciSequence[i] % 2 == 0){
			count += fibonacciSequence[i];
		}
	}

	// display answer
	cout << "Sum of even-valued terms in the Fibonacci Sequence whos values do not exceed four million" << endl;
	cout << "= " << count << endl;

	// return success
	return 0;
}