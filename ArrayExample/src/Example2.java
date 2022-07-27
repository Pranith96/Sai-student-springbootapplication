import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length elements");
		int length = sc.nextInt();
		int c[] = new int[length];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		sc.close();
	}

}
