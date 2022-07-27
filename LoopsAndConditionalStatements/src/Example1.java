
public class Example1 {

	public static void main(String[] args) {

		// initialization
		// condition
		// increment or decrement

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println(".............................");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println(".............................");

		for (int i = 0; i < 5; i++) { // 0,1
			System.out.println(i);
			for (int j = 0; j < 5; j++) { // 0-4
				System.out.println(j);
			}
		}
		System.out.println(".............................");

		int j = 0;

		while (j < 10) {
			System.out.println(j);
			j++;
		}

		System.out.println(".............................");

		int k = 0;

		do {
			System.out.println(k);
			k++;
		} while (k < 10);
	}
}
