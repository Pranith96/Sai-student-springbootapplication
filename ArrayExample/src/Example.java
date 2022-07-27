import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int a[] = { 11, 21, 67, 10, 9, 8, 1, 2, 3, 4, 13, 17, 5, 6, 7 };
		System.out.println(a.length);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[4]);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int b[][] = { { 1, 2 }, { 2, 3 }, { 2, 3 } };
		System.out.println(b[0][1]);

		int c[] = new int[5];
		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		c[3] = 4;
		c[4] = 5;

		System.out.println(Arrays.toString(c));

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
