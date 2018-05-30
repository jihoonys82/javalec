package classMethod;

public class MethodEx {
	public static void main(String[] args) {
		Method_01 m01 = new Method_01();
		m01.method_01();
		
		m01.method_02(100);
		
		m01.method_03(111, "Apple");
		
		int res = m01.returnNum();
		System.out.println("return value: " + res);
		
		System.out.println(m01.add(55, 77));
		
		System.out.println(m01.minus(56, 43));
	}
}
