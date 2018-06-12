package generics;

class Class02<T> {
	T var1;
	T var2;
	
	int num1; 
	String str;
	
	public void getVar1(T var1) {
		this.var1 = var1;
	}
}

interface Interface02<T> {
	
}

public class GenericsEx_02_Basic {
	public static void main(String[] args) {
		
		Class02<Boolean> c02 = new Class02<>();
		
		
		
	}
}
