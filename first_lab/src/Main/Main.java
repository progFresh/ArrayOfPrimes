package Main;

import Array_creator.*;

public class Main {
	public static void main(String[] args) {
		RandomArrayCreator creator = new RandomPrimeArrayCreator();
		int i = 25;
		try {
			int[] array = creator.getRandomArray(i);
			for (int h = 0; h<i; h++) {
				System.out.println(array[h]);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("---");
			System.out.println(e);
			System.out.println("---");
		}

		int prime = creator.getRandomNumber();
		System.out.println(prime);
	}
}