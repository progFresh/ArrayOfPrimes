package Main;

import Array_creator.*;
import java.util.Scanner;

public class Main {

	// MARK: - Main

	public static void main(String[] args) {
		RandomArrayCreator randomPrimeArrayCreator = new RandomPrimeArrayCreator();
		Scanner scanner = new Scanner(System.in);
		String outCondition = "n";
		String chosenCondition;

		System.out.println(Constants.descriptionProgramText);
		while (outCondition != "y") {
			System.out.println(Constants.inputСonditions);
			chosenCondition = scanner.nextLine();
			if ( chosenCondition.equals("1") ) {
				showRandomPrime(randomPrimeArrayCreator, scanner);
			} else if ( chosenCondition.equals("2") ) {
				showRandomPrimeArray(randomPrimeArrayCreator, scanner);
			} else {
				System.out.println(Constants.errorInput);
			}
			System.out.println(Constants.divider);
		}
	}

	// MARK: - Private helpers

	private static void showRandomPrime(RandomArrayCreator randomPrimeArrayCreator, Scanner scanner) {
		int randomNumber = randomPrimeArrayCreator.getRandomNumber();
		System.out.println("Случайное число: " + randomNumber);
	}

	private static void showRandomPrimeArray(RandomArrayCreator randomPrimeArrayCreator, Scanner scanner) {
		System.out.println(Constants.inputLength);
		if (scanner.hasNextInt()) {
			int length = scanner.nextInt();
			System.out.println("\"вывод массива\"");
		} else {
			System.out.println(Constants.errorInput);
		}
	}
}