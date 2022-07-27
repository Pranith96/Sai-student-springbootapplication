
public class BikeImpl implements Bike, Bike2{

	@Override
	public void engine() {
		System.out.println("engine");
	}

	@Override
	public void petrolTank() {
		System.out.println("petrol tank");
	}

	@Override
	public void mirror() {
		System.out.println("mirror");
	}

	@Override
	public void tire() {
		System.out.println("tire");
		
	}

	
}
