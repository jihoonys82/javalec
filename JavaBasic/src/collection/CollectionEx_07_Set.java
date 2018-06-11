package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx_07_Set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {	
		Set set = new HashSet<>();
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		System.out.println(set);
		
		System.out.println("=========");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=========");
		Object[] arr = set.toArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		for(Object o : arr) {
//			System.out.println(o);
//		}
	}

}
