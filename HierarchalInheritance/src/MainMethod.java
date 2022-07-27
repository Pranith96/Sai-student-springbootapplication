
public class MainMethod {

	public static void main(String[] args) {

		Addition ad = new Addition();
		ad.add(10, 10);
		ad.mul(15, 15, 15);
		ad.message("Hello");

		Subtraction sb = new Subtraction();
		sb.message("Hi");
		sb.sub(100, 50);
		String result = sb.welcome("Java");
		System.out.println(result);
	}
}
