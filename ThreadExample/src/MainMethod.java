
public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		Addition ad = new Addition();
		ad.start();
		ad.join();
		Addition ad1 = new Addition();
		ad1.start();
	}
}
