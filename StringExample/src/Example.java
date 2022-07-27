import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String s = "HI";
		String s1 = "HI";
		String s2 = new String("HI");
		
		String s3 = "HellO world";
		
		if(s == s1) {
			System.out.println("H");
		}
		
		if(s == s2) {
			System.out.println("I");
		}
		
		if(s.equals(s1)) {
			System.out.println("Hello");
		}
		
		if(s.equals(s2)) {
			System.out.println("java");
		}
		
		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
		s3 = s3.concat("Java");
		System.out.println(s3);
		System.out.println(s3.concat("Java"));
		System.out.println(s3.contains("Hello"));
		System.out.println(s3.indexOf("w"));
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		System.out.println(!s3.isEmpty());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());

		System.out.println(s3.substring(2));
		System.out.println(s3.substring(0,2));

		String[] s5  =s3.split("//s");
		System.out.println(Arrays.toString(s5));
		System.out.println(s5[0]);
		
		StringBuilder builder = new StringBuilder("Hi Builder");
		System.out.println(builder);
		
		builder.append(" ").append("Java").append(" ").append("Spring");
		System.out.println(builder);
		
		StringBuffer buffer = new StringBuffer("Hi Buffer");
		System.out.println(buffer);

	}
}
