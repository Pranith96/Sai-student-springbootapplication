
public class MainMethod {

	public static void main(String[] args) {
		
		Address ad = new Address();
		ad.setPlotNo(10);
		ad.setLocality("ABHAB");
		ad.setCity("ABC");
		ad.setState("UYH");
		
		System.out.println(ad);
		
		
		Student st = new Student();
		st.setId(1);
		st.setMobileNumber("1234567890");
		st.setName("ABC");
		st.setAddress(ad);
		
		int idResult = st.getId();
		System.out.println(idResult);
		System.out.println(st.getMobileNumber());
		System.out.println(st.getName());
		
		System.out.println(st);
	}
}
