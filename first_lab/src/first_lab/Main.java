package first_lab;

public class Main {
	public static void main(String[] args) {
		PrimeArrayCreator creator = new PrimeArrayCreator();
		int i = 26;
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
		System.out.println("I am alive");
	}
}