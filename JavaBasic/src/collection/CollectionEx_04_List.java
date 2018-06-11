package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx_04_List {
	public static void main(String[] args) {
		
		//import optimization : control + shift + o
		List list = new Vector();
		list.add("Apple");
		list.add("Banana");
		
		Vector v = new Vector(2,5); //default size : 2, add the size 5 when it overflow. 
		v.add("사과");
		v.add("포도");
		v.add("딸기");
		v.add("파인애플");
		
		System.out.println("size : " + v.size());
		System.out.println("Capacity : " + v.capacity());
		//if overflowed its size, extends size 10(default). 
		System.out.println(v);
		
		System.out.println("\n===============");
		List llist = new LinkedList();
		llist.add("Apple");
		llist.add("Banana");
		llist.add("Cherry");
		
		System.out.println(llist);
		
		
		
	}
}
