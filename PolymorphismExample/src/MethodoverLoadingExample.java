
public class MethodoverLoadingExample {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

	public void add(int a, int b, long c) {
		long d = a + b + c;
		System.out.println(d);
	}
}
