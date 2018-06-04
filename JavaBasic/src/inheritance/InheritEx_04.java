package inheritance;

class Parent04 { 
	public void display() {
		System.out.println("Parent class");
	}
}

class Child04 extends Parent04 	{
	@Override
	public void display() {
		System.out.println("Child class");
	}
	
	public void out() {
		System.out.println("Child method out()");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		Parent04 p = new Parent04();
		p.display();
		System.out.println("============");
		
		Child04 c = new Child04();
		c.display();
		System.out.println("============");
		
		Parent04 pc = new Child04(); //Child04 is auto-casted to Parent04
		//Parent04 pc = (Parent)new Child04(); 
		
		//Child04 cp = new Parent04(); // it occurs ERROR!
		// Parent -> Child casting is IMPOSSIBLE! (Parent always have affection for child!) 
		
		pc.display(); //"Child class" is printed. 
		
		// pc.out(); 	// it is not working. it depends on data type. pc's data type is Parent04.
		((Child04)pc).out(); // SO explicit casting is needed to use method in Child04. 
		
	}
}
