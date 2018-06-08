package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx_02_List {
	public static void main(String[] args) {
		
		//it is store Object type
		@SuppressWarnings("rawtypes")
		List list1 = new ArrayList();
		//it is store String type only. 
		List<String> list2 = new ArrayList<>(); // <-- from java 7, filling data type in the constructor generic<> is optional. 
		//Cannot use int in generic <>.
		List<Integer> list3 = new ArrayList<Integer>();
		
		//list2.add(123); //it occurs error.
		//list3.add(123.456); //it occurs error.
		list3.add(123);
		
		System.out.println("============");
		// ... 가변인자, 가변 파라미터, varargs. undefined number of parameters
		List intList = Arrays.asList(1,2,3,4,5);
		System.out.println(intList);
		
		List stringList = Arrays.asList("Alice","Bob", "Claire");
		System.out.println(stringList);
		
	}
}
