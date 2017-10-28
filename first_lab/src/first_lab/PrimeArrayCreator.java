package first_lab;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeArrayCreator {

	// MARK: - Properties

	private int begingOfRange = 2;
	private int endOfRange = 1000000000; // 1 000 000 000

	// MARK: - Internal helpers

//	public int getRandomPrime() {
//		int randomNum = ThreadLocalRandom.current().nextInt(begingOfRange, endOfRange);
//		return randomNum;
//	}

	public int[] getRandomArray(int length) {
		int[] randomArray = new int[length];
		int fillingCellNumber = 0;
		int neededCellsNumber = length -1;
		while (fillingCellNumber <= neededCellsNumber) {
			if (fillingCellNumber == 0) {
				randomArray[fillingCellNumber] = begingOfRange;
			} else {
				randomArray[fillingCellNumber] = getNext(randomArray[fillingCellNumber-1]);
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
				System.out.println(nextPrime);
				return nextPrime;
			}
		}
		return 0;
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