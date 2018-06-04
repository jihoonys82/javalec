package inheritance;

class Parent02 { 
	protected int num = 12;
	private String name = ""; // it can not be used in child class. 
	
	protected void display() { // it is only accessed by same package class
		System.out.println("num : " + num);  // protected can use in child class 
	} 
}

class Child02 extends Parent02 	{
	private int num;
	
	@Override 
	public void display() {
//		System.out.println("num : " + num);	// if num is "private" in Parents, it dose not work. 
		System.out.println("num : " + num);  // protected can use in child class
		System.out.println();
	} 
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child02 c = new Child02();
		c.display();
		
		Parent02 p = new Parent02();
		p.display(); // if it located in another package, it can not be executable. 
		
	}
}
