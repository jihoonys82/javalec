package inheritance;

class Parent03 { 
	 protected int num ;
	 
	 public Parent03() {
		 System.out.println("Parent constructor");
	 }
	 public Parent03(int num) {
		 this.num = num;
		 System.out.println("Parent constructor with parameter : " + num);
	 }
}

class Child03 extends Parent03 	{
	private int num ;
	
	 public Child03() {
		 // super has to be located at the first line of child constructor. 
		 super(123); // if it is added in Child constructor it calls parent constructor with parameter. 
		 System.out.println("Child constructor");
		 System.out.println(this.num); // print '0'
		 System.out.println(super.num); // print '123'
		 // this.num is not overridden form super.num 
	 }
	 
	 public Child03(int n) {
		 super(n);
		 
		 System.out.println(super.num);
		 System.out.println(this.num);
	 }
	 
}

public class InheritEx_03 {
	public static void main(String[] args) {
		Child03 c = new Child03(5);
		//when child class is called, parent class is called in advance.
		//So. print result is "Parent constructor" then "Child constructor"

		
	}
}
