package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static class Car {
		private int speed;

		public Car(int speed) {
			this.speed = speed;
		}

	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("1", "a String");
		map.put("2", "stringy");
		map.put("1", "Override 1 String");
		map.put("3", "Drei");
		map.replace("3", "dosomething");

		System.out.println(map.get("1"));
		System.out.println(map.get("3"));

		Map<String, String> telefonMap = new HashMap<>();
		telefonMap.put("Anna", "0761231231");
		telefonMap.put("Simon", "0794553333");
		telefonMap.put("Jelena", "0774441112");
		telefonMap.put("Philip", "0789999611");
		telefonMap.put(null, null);

		System.out.println(telefonMap.containsValue("0794553333"));
		System.out.println(telefonMap.containsKey("Simon"));
		System.out.println(telefonMap.get("Anna"));
		System.out.println(telefonMap.isEmpty());
		System.out.println(telefonMap.hashCode());
		System.out.println(telefonMap.getClass());
		System.out.println(telefonMap.getOrDefault("Anna", "0791111111"));
		System.out.println(telefonMap.getOrDefault("Anna2", "0791111111"));
		
		for (String telNumber : telefonMap.keySet()) {
			System.out.println(telNumber + " --- " + telefonMap.get(telNumber));
		}
		
		for (Entry<String, String> str : telefonMap.entrySet()) {
			System.out.println(str);
		}
		
		Map<Integer, Car> carMap = new HashMap<>();
		Car c1 = new Car(100);
		carMap.put(1, c1);
		carMap.put(2, new Car(200));

		System.out.println(telefonMap.entrySet());
		System.out.println(telefonMap.values());

		System.out.println(carMap.entrySet().contains(c1));
	}
}
