package classBasic;

public class MainClass_01 {
	public static void main(String[] args) {
		
		ClassEx ce; //declare ClassEx object type variable;
		
		ce = new ClassEx(); // create ClassEx object;
		
		ce.num = 100;
		ce.str = "Apple";
		
//		System.out.println("num : " + ce.num);
//		System.out.println("str : " + ce.str);
		
		//수행코드 
		ce.display(); // call display method
		
		
//		MainClass_01 mc = new MainClass_01();
//		mc.main(null);
		
	}
}
