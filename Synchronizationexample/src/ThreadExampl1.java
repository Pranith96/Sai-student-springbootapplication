
public class ThreadExampl1 extends Thread {

	ResourceExample ex;

	public ThreadExampl1(ResourceExample ex) {
		this.ex = ex;
	}

	public void run() {
		ResourceExample.printNum(5);
	}
}
