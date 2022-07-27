
public class Example1 {

	public static void main(String[] args) {

		// unary operator
		int i = 10;
		int j = 10;
		int k = 20;
		int a = 15;

		System.out.println(i++); // 10
		System.out.println(i); // 11
		System.out.println(++i); // 11+1 = 12
		System.out.println(j--);
		System.out.println(--j);

		System.out.println(k++ + ++k); // 20+22
		System.out.println(a-- + a--); // 15+14

		System.out.println("..........arithmetic operator.............");
		// arithmetic operators

		int b = 10;
		int c = 10;

		System.out.println(a + b);
		System.out.println(a - b);

		System.out.println(a * b);

		System.out.println(a / b);

		System.out.println(a % b);

	}
}
