package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList<>();
		// above is same as List<Object> list1 = new ArrayList<Object>();
		// boolean add(E e); // E => Object  
		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);
		
		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);
		
		//list2.add(123);
		//list3.add("ABC");
		
		list1.add("A");
		list1.add(123);
		
		list2.add("B");
		
		//list1 is required casting when get each element due to return type is Object.
		String str1 = (String)list1.get(0);
		int num1 = (Integer)list1.get(1);
		
		//list2 is not required casting
		String st2 = list2.get(0);
		
	}
}
