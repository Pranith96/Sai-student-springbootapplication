
public class Example1 {

	String sss = "Java"; // instance
	static String sq = "WElcome"; // static

	public static void main(String[] args) {

		byte b = 126;
		System.out.println(b);

		boolean b1 = true;
		System.out.println(b1);

		short s = 25;
		int num = 1000;
		float f = 125.5f;
		double d = 1234567.678d;
		long l = 123456789l;
		char c = 'a';
		System.out.println(c);
		String str = "qwertyu fdf sdfghnm";
		
		Example1 ex = new Example1();
		ex.print();
		display();
	}

	public void print() {
		String ss = "Hii Welcome"; // local
		System.out.println(ss);
		System.out.println(sq);
		System.out.println(sss);
	}
	
	public static void display() {
		System.out.println("display");
	}
}
