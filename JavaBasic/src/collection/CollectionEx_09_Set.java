package collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionEx_09_Set {
	public static void main(String[] args) {	
		
//		Set set = new TreeSet<>();
		TreeSet tree = new TreeSet();
		
		tree.add("Banana");
		tree.add("Cherry");
		tree.add("Apple");
		tree.add("Durian");
		
		System.out.println(tree);
		
		//headSet() : 자기보다 작은 값, 사전(ASCII 기준)순  
		System.out.println("=======");
		Set head = tree.headSet("Cherry");
		System.out.println(head);
		
		//tailSet() : 자기를 포함한 큰값, 사전(ASCII 기준)순 
		System.out.println("=======");
		Set tail = tree.tailSet("Cherry");
		System.out.println(tail);
		
		//subSet(A, B) : A포함 부터 B제외 까지 사이의 값 
		System.out.println("=======");
		Set sub = tree.subSet("Banana", "Cherry");
		System.out.println(sub);
		
	}
}
