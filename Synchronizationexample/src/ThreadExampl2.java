
public class ThreadExampl2 extends Thread {

	ResourceExample ex;

	public ThreadExampl2(ResourceExample ex) {
		this.ex = ex;
	}

	public void run() {
		ResourceExample.printNum(10);
	}
}
