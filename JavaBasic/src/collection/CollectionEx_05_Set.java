package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEx_05_Set {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set set = new HashSet(); 
		set.add(11);
		set.add(22);
		set.add(33);
		
		System.out.println(set);
		
		System.out.println("=======");
		System.out.println("Size : " + set.size());
		System.out.println("isEmpty? : " + set.isEmpty());
		System.out.println("has '22'? : " + set.contains(22));
		System.out.println("delete '33' : " + set.remove(33));
		System.out.println("delete '55' : " + set.remove(55));
		System.out.println(set);
		
		System.out.println("=======");
//		set.clear();
//		System.out.println("isEmpty? : " + set.isEmpty());
//		System.out.println(set);
		
		List list = Arrays.asList(11,22,33,44,55);
		set.removeAll(list);
		System.out.println(set);
		
		
		
	}
}
