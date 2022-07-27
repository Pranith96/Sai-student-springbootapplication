
public class MainMethod {

	public static void main(String[] args) {
		ResourceExample ex = new ResourceExample();
		ThreadExampl1 th1 = new ThreadExampl1(ex);
		th1.start();
		ThreadExampl2 th2 = new ThreadExampl2(ex);
		th2.start();
	}
}
