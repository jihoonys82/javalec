package collection;

import java.util.Stack;

public class CollectionEx_12_Stack {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("====push()====");
		st.push("Apple");
		st.push("Banana");
		st.push("Cherry");
		System.out.println(st);
		System.out.println("Size : " + st.size());

		System.out.println("====pop()====");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("Size : " + st.size());
		
		System.out.println("====peek()====");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("Size : " + st.size());
		
	}

}
