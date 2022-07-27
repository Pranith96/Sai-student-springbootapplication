import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example2 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); // HashTable
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "pqr");
		map.put(5, "ABC");
		map.put(7, "pqr");
		map.put(4, "ABC");
		map.put(8, "XYZ");
		map.put(6, "ABC");
		map.put(5, "XYZ");
		System.out.println(map);

		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getValue());
			System.out.println(m.getKey());
			map.remove(7);
		}
		System.out.println(map);
	}
}
