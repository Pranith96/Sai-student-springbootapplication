import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(); //TreeMap, LinkedHashMap
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "pqr");
		map.put(5, "ABC");
		map.put(3, null);
		map.put(7, "pqr");
		map.put(4, "ABC");
		map.put(8, "XYZ");
		map.put(null, "bhg");
		map.put(6, "ABC");
		map.put(5, "XYZ");
		map.put(null, "pqr");
		
		System.out.println(map);
		System.out.println(map.get(8));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(8));
		System.out.println(map.containsValue("ABC"));
		System.out.println(map.keySet());
		map.remove(3);
		System.out.println(map);

		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getValue());
			System.out.println(m.getKey());
		}
	}
}
