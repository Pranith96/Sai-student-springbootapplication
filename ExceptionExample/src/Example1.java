import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a / 2; // ArithmeticException
			System.out.println(b);
			int[] x = new int[2];
			x[0] = 1;
			x[1] = 2;
			x[3] = 3;
			System.out.println(Arrays.toString(x));
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("hi");
		}
		System.out.println("Hello");
	}
}
