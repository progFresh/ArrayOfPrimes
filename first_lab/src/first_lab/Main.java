package first_lab;

public class Main {
	public static void main(String[] args) {
		PrimeArrayCreator creator = new PrimeArrayCreator();
		int i = 70000000; // 70 000 000
		int[] array = creator.getRandomArray(i);
	}
}