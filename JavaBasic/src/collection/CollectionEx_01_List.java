package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx_01_List {
	public static void main(String[] args) {
		List list;
		list = new ArrayList();
		
		System.out.println("===input===");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n===remove(2)===");
		list.remove(2);
		System.out.println(list);

		System.out.println("\n===get(1)===");
		System.out.println(list.get(1));
		
		System.out.println("\n===add(index, value)===");
		list.add(1, "Tomato");
		System.out.println(list);
		
		System.out.println("\n===contains()===");
		System.out.println(list.contains("Tomato"));
		
		System.out.println("\n===isEmpty()===");
		System.out.println(list.isEmpty());
		
		System.out.println("\n===clear()===");
		list.clear();
		System.out.println(list);
		
		System.out.println("\n=========");
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n=========");
		for(Object s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=========");
		//Object 클래스의 자식클래스들이라 다 들어간다
		// int is basic data type but int type is wrapped by auto boxing function. 
		// because Integer is child class of Objec class, int value can be stored as Object type after auto boxing 
		list.add(100);
		list.add(true);
		list.add(123.456);
		
		System.out.println(list);
		
	}
}
