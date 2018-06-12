package generics;

class Class05 {

	public <T> T out(T obj) {
		System.out.println("Generic Method");
		System.out.println("Data: " + obj);
		
		T data = obj;
		
		return obj;
	}
	
	public <T> void display(Integer num) {
		T data;
		data = (T)num ;
	
	}
	
}

public class GenericsEx_05_GenericMethod {
	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		
		int num = c05.out(123); // T is determined as Integer automatically
		System.out.println(num);
		
		c05.out("Alice"); // T is determined as String automatically
		
		c05.<Integer>out(555); //명시적 결정
//		c05.<Integer>out("Bob");
		
		c05.<String>display(1); // in this case, 명시하는게 꼭필요(uncommon coding) 
		
	}
}
