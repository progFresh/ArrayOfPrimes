package Array_creator;

import java.util.concurrent.ThreadLocalRandom;

/**
* RandomPrimeArrayCreator allow generate random
* number in range [1...10^9] and array of primes of
* "length" dimension. This array is sorted in ascending order.
*
* @author  Polozov Sergey
* @version 1.0
* @since   2017-11-12
* @see RandomArrayCreator
*/

public class RandomPrimeArrayCreator implements RandomArrayCreator {

	// - Properties

	private String errorText = "введена размерность, при которой значения внутри массива превышают [2:10^9]";
	private int begingOfRange = 2;
	private int endOfRange = 1000000000; //1 000 000 000

	// - Internal helpers

	/**
	   * Generates random number in range [1...10^9]
	   * @override Parent's method
	   * @return int This returns generated random number
	   */ 

	public int getRandomNumber() {
		int randomNum = ThreadLocalRandom.current().nextInt(begingOfRange, endOfRange);
		if (isPrime(randomNum)) {
			return randomNum;
		} else {
			int nextPrime = getNext(randomNum);
			int previousPrime = getPrevious(randomNum);
			if (nextPrime != -1) {
				return nextPrime;
			} else if (previousPrime != -1) {
				return previousPrime;
			}
		}
		return -1;
	}

	/**
	   * This method is used to generate array of 
	   * primes in range [1...10^9] of "length" dimension
	   * 
	   * @override Parent's method
	   * @param length This parameter get int value and 
	   * is dimension of array
	   * @throws IllegalArgumentException
	   * it can be when received length don't allow
	   * to generate array fir in the range
	   * @return int[] This returns generated array of 
	   * primes
	   */

	public int[] getRandomArray(int length) {
		int[] randomArray = new int[length];
		int fillingCellNumber = 0;
		int neededCellsNumber = length -1;
		while (fillingCellNumber <= neededCellsNumber) {
			if (fillingCellNumber == 0) {
				randomArray[fillingCellNumber] = begingOfRange;
			} else {
				randomArray[fillingCellNumber] = getNext(randomArray[fillingCellNumber-1]);
				if (randomArray[fillingCellNumber] == -1) throw new IllegalArgumentException(errorText); 
			}
			fillingCellNumber += 1;
		}
		return randomArray;
	}

	// - Private helpers

	/**
	   * This method is used to get next prime after 
	   * input parameter.
	   * @param prime This parameter get int value.
	   * The parameter is prime number for generating
	   * next prime number.
	   * @return int This returns next prime. But
	   * if next prime will be more than 10^9 
	   * return value will be -1
	   */

	private int getNext(int prime) {
		int nextPrime;
		for (int i = prime; i < endOfRange; i++) {
			nextPrime = i+1;
			if (isPrime(nextPrime)) {
				return nextPrime;
			}
		}
		return -1;
	}

	/**
	   * This method is used to get previous prime of 
	   * input parameter.
	   * @param arg This parameter get int value.
	   * The parameter is prime number for generating
	   * previous prime number.
	   * @return int This returns previous prime. But
	   * if previous prime will be less than 2 
	   * return value will be -1
	   */

	private int getPrevious(int arg) {
		int previousPrime;
		for (int i = arg; i > begingOfRange; i--) {
			previousPrime = i-1;
			if (isPrime(previousPrime)) {
				return previousPrime;
			}
		}
		return -1;
	}

	/**
	   * This method is used to know if input parameter is prime.
	   * @param arg This parameter get int value. The parameter
	   * if getting to determine if it is prime.
	   * @return boolean This returns if input
	   * parameter is prime or not
	   */

	private boolean isPrime(int arg) {
		if (arg == 2) 
			return true;
		if (arg%2 == 0)
			return false;
		for (int i=3; i*i<=arg; i++) {
			if(arg%i == 0)	 
				return false;
		}
		return true;
	}
}