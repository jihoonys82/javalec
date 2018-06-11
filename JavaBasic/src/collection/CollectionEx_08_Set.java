package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionEx_08_Set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {	
		Set set = new LinkedHashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		
		System.out.println(set);
		
	}
}
