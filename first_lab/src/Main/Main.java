package Main;

import javax.swing.*;

public class Main {
	
	// - Main
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame startWindow = new StartWindow();
        			startWindow.setVisible(true);
            }
        });
	}
	
	// Private helpers
}





//public class Main {
//
//	// - Main
//
//	public static void main(String[] args) {
//		RandomArrayCreator randomPrimeArrayCreator = new RandomPrimeArrayCreator();
//		Scanner scanner = new Scanner(System.in);
//		String chosenCondition;
//
//		System.out.println(Constants.descriptionProgramText);
//		while (true) {
//			System.out.println(Constants.inputСonditions);
//			chosenCondition = scanner.nextLine();
//			if ( chosenCondition.equals("1") ) {
//				showRandomPrime(randomPrimeArrayCreator, scanner);
//			} else if ( chosenCondition.equals("2") ) {
//				showRandomPrimeArray(randomPrimeArrayCreator, scanner);
//			} else {
//				System.out.println(Constants.errorInput);
//				setStandbyMode(scanner);
//			}
//			System.out.println(Constants.divider);
//		}
//	}
//
//	// - Private helpers
//
//	private static void showRandomPrime(RandomArrayCreator randomPrimeArrayCreator, Scanner scanner) {
//		int randomNumber = randomPrimeArrayCreator.getRandomNumber();
//		System.out.println("Случайное число: " + randomNumber);
//		setStandbyMode(scanner);
//	}
//
//	private static void showRandomPrimeArray(RandomArrayCreator randomPrimeArrayCreator, Scanner scanner) {
//		System.out.println(Constants.inputLength);
//		if (scanner.hasNextInt()) {
//			int length = scanner.nextInt();
//			try {
//				int[] primeArray = randomPrimeArrayCreator.getRandomArray(length);
//				System.out.println("Массив:");
//				for (int i = 0; i<length; i++) {
//					System.out.println("a[" + i + "] = " + primeArray[i]);
//				}
//				setStandbyMode(scanner);
//			} catch (IllegalArgumentException exception) {
//				System.out.println(exception);
//				setStandbyMode(scanner);
//			} catch (NegativeArraySizeException negativeSize) {
//				System.out.println(Constants.negaticeSizeException);
//				setStandbyMode(scanner);
//			}	
//		} else {
//			System.out.println(Constants.errorInput);
//			setStandbyMode(scanner);
//		}
//	}
//
//	private static void setStandbyMode(Scanner scanner) {
//		scanner.nextLine();
//	}
//}