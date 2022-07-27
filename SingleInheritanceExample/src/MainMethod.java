
public class MainMethod {

	public static void main(String[] args) {
		Subtraction sb = new Subtraction();
		sb.add(10, 10);
		sb.mul(10, 10, 10);
		sb.sub(100, 10);
		String result = sb.welcome("Hi Hello");
		System.out.println(result);
	}
}
