
public class Example1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		Example1 ex = new Example1();
		ex.display();
		ex.add(i, j);
		print();
		mul(i, j, 10);
		String result = ex.message();
		System.out.println(result);
		String result1 = welcome();
		System.out.println(result1);

		long result2 = ex.sum(10000l, 10000l);
		System.out.println(result2);
		String result3 = ex.summing(10000l, 10000l);
		System.out.println(result3);
		String result4 = demo(100, "Welcome", 10000l);
		System.out.println(result4);
		System.out.println(".................");
		Example2 ex2 = new Example2();
		ex2.addition(10, 10, 10);
		String result5 = Example2.bird("peacock");
		System.out.println(result5);
	}

	// Method without parameter and without return type
	public void display() {
		System.out.println("Display");
	}

	// static Method without parameter and without return type
	public static void print() {
		System.out.println("print");
	}

	// Method with parameter and without return type
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	// static Method with parameter and without return type
	public static void mul(int a, int b, int c) {
		int d = a * b * c;
		System.out.println(d);
	}

	// Method without parameter and with return type
	public String message() {
		String str = "Hello welcome";
		return str;
	}

	// static Method without parameter and with return type
	public static String welcome() {
		String str = "Hello welcome to java";
		String value = Example2.bird("parrot");
		return str + value;
	}

	// Method with parameter and with return type
	public long sum(long a, long b) {
		long c = a + b;
		return c;
	}

	// Method with parameter and with return type
	public String summing(long a, long b) {
		long c = a + b;
		String s = "result " + c;
		return s;
	}

	// static Method with parameter and with return type
	public static String demo(int a, String str, long l) {
		long c = a + l;
		return str + c;
	}

}
