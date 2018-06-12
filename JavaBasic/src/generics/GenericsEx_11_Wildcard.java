package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
	// There is no relationship between List<Object> and List<Integer>, it must be used to wildcard <?> instead of <Object>. 
	public static void display(List<?> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(10,20,30);
		display(list);
		
		List<String> strList = Arrays.asList("A", "B", "C");
		display(strList);
		
		Object a= new Object();
		Integer b = new Integer(10);
		// covariant
		a=b;	//child class type is parent class type. 	
		
		List<Object> o = new ArrayList<>();
		List<Integer> i = new ArrayList<>();
		
		// invariant
//		o=l; // error! : there is no inheritance between generic datatype. <Object> and <Integer> are different data types. 
		
		
		
	}
	
}
