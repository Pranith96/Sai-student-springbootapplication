
public class Example2 {

	public static void main(String[] args) throws DataNotFoundException {
		int age = 18;
		
		if(age < 19) {
			throw new DataNotFoundException("Age is less than 19");
		}
		System.out.println("hi");
	}
}
