import java.util.LinkedList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(5));
		System.out.println(list.indexOf(6));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);

		for (Integer i : list) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
