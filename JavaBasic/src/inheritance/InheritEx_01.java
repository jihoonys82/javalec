package inheritance;

class Parent { 
	String name;
	int num;
	int age;
	
	public void display() {
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent{
//	String name; 
//	int num;
	// These are already declared in super(parent) class 
	int score;
	
	public void print() {
		System.out.println("Child class method");
		
		display(); // call overridden method
		super.display(); //call parent class method
		this.display(); // call overridden (Child class) method
	}

	@Override //Annotation, if below is not override, it occurs error. So below method has to be overridden method. 
	public void display() {
		System.out.println("Redefined method. It is inherited class from parent (method override!)");
	}
	
}

public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.num = 111;
		System.out.println( p.num );
		
		Child c = new Child();
		c.num = 222;
		System.out.println( c.num );
		
		System.out.println("=========");
		p.display();
		c.display();
		//p.print();	//it occurs error.
		c.print();
		
	}
}
