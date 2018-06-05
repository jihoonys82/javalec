package abstractEx;

abstract class Person {
	public String name; 

	public abstract void out();
}

class Professor extends Person {
	public String major;
	
	public Professor(String major) {
		this.major = major;
	}
	
	@Override
	public void out() {
		System.out.println("Professor");
		System.out.println("Major:" + this.major);
	}
}

class Student extends Person {
	public String subject;
	
	public Student(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void out() {
		System.out.println("Student");
		System.out.println("Subject:" + this.subject);
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		Person[] arr = new Person[2];
		
		arr[0] = new Student("Java");
		arr[1] = new Professor("Computer Engineering");
		
		arr[0].out(); //dynamic binding!! 
		arr[1].out();
		
		
	}
}
