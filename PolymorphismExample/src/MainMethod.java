
public class MainMethod {

	public static void main(String[] args) {
		MethodoverLoadingExample ex = new MethodoverLoadingExample();
		ex.add(10, 10);
		ex.add(10, 10, 10);
		ex.add(10, 10, 10000l);

		MethodOverridingExample2 ex2 = new MethodOverridingExample2();
		ex2.add(20, 10);
	}
}
