package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Object> m1 = new HashMap<>();
		m1.put("name", "Alice");
		m1.put("age", 30);
		m1.put("city", "New York");
		m1.put("isStudent", false);
		m1.put("height", 5.6);
		m1.put(null, "nullValue");
		m1.put("nullKey", null);
		m1.put("name", "Bob"); // Duplicate key, will overwrite "Alice"

		System.out.println("Map: " + m1);

	}

}
