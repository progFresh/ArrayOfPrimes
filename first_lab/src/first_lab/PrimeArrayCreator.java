package first_lab;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeArrayCreator {

	// MARK: - Properties

	private String errorText = "введена размерность, при которой значения внутри массива превышают [2:10^9]";
	private int begingOfRange = 2;
	private int endOfRange = 100;

	// MARK: - Internal helpers

	public int getRandomPrime() {
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

	// Throws
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

	// MARK: - Private helpers

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