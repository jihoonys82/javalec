package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx_03_List {
	public static void main(String[] args) {
		
		//Iterator
		// Standardized method to get Elements in collection
		
		List list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Durian");
		
		Iterator iter;
		iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//for 가 성능이 더 좋음.. but set의 경우 index가 없어서 for문을 못쓰고 iteration을 써야함. 
	}
}
