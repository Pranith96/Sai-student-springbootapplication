
public class Example2 {

	public static void main(String[] args) {

		int a = 10;

		// left shift
		System.out.println(a << 2); // 10*2^2 = 10*4 =40
		System.out.println(a << 3); // 10*2^3 = 10*8 = 80

		System.out.println(20 << 4); // 20*2^4

		// right shift
		int b = 10;

		System.out.println(b >> 2); // 10/2^2
		System.out.println(b >> 3); // 10/2^3

		// terinary operator
		int age = 20;
		if (age > 25) {
			System.out.println(age);
		} else {
			System.out.println("less than 18");
		}

		int result = (age > 25) ? age : -1;
		System.out.println(result);
		
		// assignment operator
		int k = 10;
		int j = 10;

		k += 10; // k = k+10;
		k -= 10; // k = k-10;
		
		System.out.println(k);
	}
}
