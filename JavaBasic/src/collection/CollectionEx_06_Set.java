package collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx_06_Set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Set set1 = new HashSet<>();
		Set set2 = new HashSet<>();
		Set set3 = new HashSet<>();
		
		set1.add(1);set1.add(2);set1.add(3);
		set2.add(3);set2.add(4);set2.add(5);
		set3.add(1);set3.add(2);
		
		//subset 
		System.out.println("===subset===");
		System.out.println("set1 has set2? : " + set1.containsAll(set2));
		System.out.println("set1 has set3? : " + set1.containsAll(set3));
		
		//union
//		System.out.println("===union===");
//		set1.addAll(set2);
//		System.out.println(set1);
//		System.out.println(set2);
		
		//intersection
//		System.out.println("===intersection===");
//		set1.retainAll(set2);
//		System.out.println(set1);
		
		//complement set
		System.out.println("===complement set===");
		set1.removeAll(set2);
		System.out.println(set1);
	}
}
