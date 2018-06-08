package apiTest;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println("======boxing======");
		//int -> Integer
		int i1 = 10;
		Integer iVal1 = new Integer(i1);
		System.out.println(i1 + ", " + iVal1);
		
		Integer iVal2 = new Integer("1234");
		System.out.println("iVal2 : " + iVal2);
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1);
		System.out.println("dVal1 : " + dVal1);
		
		System.out.println("iVal1+iVal2 : " + (iVal1+ iVal2));
		
		System.out.println("\n=====unboxing=====");
		
		int i2 = iVal1.intValue();
		int i3 = iVal2.intValue();
		double d2 = dVal1.doubleValue();
		int i4 = dVal1.intValue();
		System.out.println(i2 + ", " + i3 + ", " + d2+ ", " + i4);
		
		System.out.println("\n===auto boxing====");
		// Integer iVal3= new Integer(55);
		Integer iVal3 = 55;
		System.out.println(iVal3);
		
		System.out.println("\n==auto unboxing===");
		int i5 = iVal3;
		System.out.println(i5);
		
		
	}
}
