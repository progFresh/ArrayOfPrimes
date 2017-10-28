package first_lab;

public class Main {
	public static void main(String[] args) {
		PrimeArrayCreator creator = new PrimeArrayCreator();
		int ii = 70000000; // 70 000 000
		int[] ttt = creator.getRandomArray(ii);
		
		int count = 0;
		for (int i = 0; i<ii; i++) {
			if (ttt[i] > 1000000000) {
				count = count+1;
			}
		}
		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		System.out.println(count);
	}
}