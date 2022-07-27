
public class ResourceExample {

	public static synchronized void printNum(int num) { // 5
		//synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * num);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}
	}
}
