package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_12_Wildcard {
	
	public static void display(List<? extends Number> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(10,20,30);
		display(list);
		
		List<String> strList = Arrays.asList("A", "B", "C");
//		display(strList); // Error. wildcard is restricted to use Number only.
		
		
	}
	
}
