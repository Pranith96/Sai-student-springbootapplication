
public class MainMethod {

	public static void main(String[] args) {
		Bike b = new BikeImpl2();
		b.engine();
		b.tire();
		b.petrolTank();
		b.mirror();
		
		BikeImpl2 b1 = new BikeImpl2();
		b1.engine();
		b1.tire();
		b1.petrolTank();
		b1.mirror();
		
		Bike b2 = new BikeImpl();
	}
	
}
