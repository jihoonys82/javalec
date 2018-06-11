package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx_10_Map {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println(map);
		
		System.out.println("=======");
		System.out.println(map.get(3));
		
		System.out.println("=======");
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D"));
		
		System.out.println("=======");
		map.put(2, "Orange"); // value duplicated
		map.put(4, "Apple");  // key duplicated
		System.out.println(map);
		
		System.out.println("=======");
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Apple"));
		
		if(!map.containsKey(5)) {
			map.put(5, "PineApple");		
		}
		
		if(map.containsKey("D")) {
			System.out.println(map.get("D"));
		}
		
		if(map.containsKey(555)) { // due to prevent error, if statement with method is required
			String str = (String)map.get(555);
			System.out.println(str.length()); // Null pointer Exception ERROR!
		}
		
		System.out.println("=======");
		System.out.println("size : " + map.size());
		
		System.out.println("=======");
		System.out.println("isEmpty? : " + map.isEmpty());
		
		System.out.println("=======");
		map.remove(3);
		System.out.println(map);
		
		System.out.println("=======");
		map.remove(2, "Apple"); // 2 is not deleted because value of 2 is not "Apple" 
		System.out.println(map);
		
		System.out.println("=======");
		map.put(10, null);
		map.put(null, "bob");
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("=======");
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		
		System.out.println(keySet);
		System.out.println(entrySet);
		
		
		
		
		
		
	}
}
