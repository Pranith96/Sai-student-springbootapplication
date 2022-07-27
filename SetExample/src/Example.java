import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(7);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.remove(0);
		System.out.println(set);

		for (Integer i : set) {
			System.out.println(i);
		}

	}
}
