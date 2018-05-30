package classBasic.defaultTest;

import classBasic.ClassEx_03;

public class MainClass_defaultTest {

	public static void main(String[] args) {
		
		ClassEx_03 ce = new ClassEx_03();
		
//		System.out.println( ce.num1 ); // private, impossible to access other class
//		System.out.println( ce.num2 ); // default, impossible to access other package
//		System.out.println( ce.num3 ); // protected, impossible to access other package  
		System.out.println( ce.num4 ); // public

//		ce.num1 = 100; // it is impossible but... setter is possible. 
		ce.setNum1(100);
		
	}

}
