package interfaceEx;

interface Inter_02 {
	public void out();
}

interface Inter_03 {
	public void out();
	public void display();
}

class Parent {
	public void out() {
		System.out.println("Parent");
	}	
}


// multiple inherit of Interface is allowed!
class ClassTest extends Parent implements Inter_02, Inter_03 {

	@Override
	public void out() { // it can be merged with Parent, Inter_02 and Inter_03. So it is safe to use. 
		System.out.println("ClassTest");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.out();
		
	}
}

//multiple inherit

//class Parent1 {
//	public void out() {
//	}
//}
//class Parent2 { 
//	public void out() {
//	}
//} 
//class Child extends Parent1, Parent2 { // ERROR!	
//}

//Java is NOT allow multiple inherit.
// ... but Sometimes it need to use. 

