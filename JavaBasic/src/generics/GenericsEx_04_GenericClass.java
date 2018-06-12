package generics;

// create Class04
// use T Generic
// member field T obj 
// getter setter
class Class04<T> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class GenericsEx_04_GenericClass {
	public static void main(String[] args) {
		
		Class04<String> c04 = new Class04<>();
		c04.setObj("Apple");	
		
		String fruit = c04.getObj();
		System.out.println("Favorite fruit is " + fruit);
		
		
	}
}
