
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new Addition();
		Thread th = new Thread(ad);
		Thread th2 = new Thread(ad);
		th2.start();
		th.start();
		
		Addition ad1 = new Addition();
		Thread th1 = new Thread(ad1);
		th1.start();
	}
}
