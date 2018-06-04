package inheritance;

class Parent05 { 
	public void display() {
		System.out.println("Parent class");
	}
}

final class Child05 extends Parent05 { //final keyword means "no more inherit"
	@Override
	public final void display() { // final keyword means "no more overriding"
		System.out.println("Child class");
	}
	
}

//class inheritance is 1:1 relationship between parent and child. 
//There is no direct relationship between Parent and GrandChild.
//class GrandChild05 extends Child05 { 
//	public void display() {	} // it occurs ERROR
//						
//}

public class InheritEx_05 {
	public static void main(String[] args) {
		
		
	}
}
