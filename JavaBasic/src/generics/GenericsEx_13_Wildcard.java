package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_13_Wildcard {
	
	public static void display(List<? super Integer> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
//		List<? extends String> list = new ArrayList<>();
//		
////		list.add("Apple");
////		list.add("Banana"); // wildcard æµ∂© ¿Ã∑∏∞’ ¿ﬂ æ»æ∏
//		
//		String str= list.get(0);
		
		List<Number> numList = new ArrayList<>();
		
		numList.add(10);
		numList.add(30);
		numList.add(40);
		
		display(numList);
		
	}
}
