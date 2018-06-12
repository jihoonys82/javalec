package generics;

public class GenericsEx_08_Extends {
	public static void main(String[] args) {
		print(123);
		print(345.565);
//		print("test"); //error! T allow only Number's sub classes.
		
		
	}
	
	public static <T extends Number> void print(T t1) { 
		System.out.println("=====");
		System.out.println(t1);
	}
}
