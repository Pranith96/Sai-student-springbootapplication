
public class Example2 {

	public static void main(String[] args) {
		int age = 24;

		if (age > 18) {
			System.out.println(age);
		}

		if (age > 18 && age < 23) {
			System.out.println(age);
		}

		if (age > 18 || age < 23) {
			System.out.println(age);
		}

		if (age > 25) {
			System.out.println(age);
		} else {
			System.out.println("less than 18");
		}

		if (age > 18) {
			System.out.println(age);
		} else if (age < 25) {
			System.out.println(age);
		} else if (age < 10) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

		System.out.println("Hi Hello");

		char ch = 'p';

		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonents");
		}
	}
}