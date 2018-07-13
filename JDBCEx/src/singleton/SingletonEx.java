package singleton;

public class SingletonEx {
	public static void main(String[] args) {
		
		Singleton_01 s1; 
		s1 = Singleton_01.getInstance();
		
		Singleton_01 s2 = Singleton_01.getInstance();
		
		// It is impossible to create new instance; 
		//Singleton_01 s3 = new Singleton_01();
		
		System.out.println(s1.data);
		System.out.println(s2.data);
		
		System.out.println(s1);
		System.out.println(s2); // same instance reference 
		
		System.out.println("===========");
		
		Singleton_04 s4 = Singleton_04.getInstance();
		Singleton_04 s5 = Singleton_04.getInstance();
		
		System.out.println(s4);
		System.out.println(s5); // same instance reference
	}

}
