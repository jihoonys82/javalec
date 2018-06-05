package innerClass;

public class OuterEx {
	public static void main(String[] args) {
		Outer o =new Outer();
		System.out.println(o.num);
		
		System.out.println("=================");
		
		Outer.MemberInner memIn;
		//memIn = new Outer.MemberInner(); // error occured! 
		memIn = o.new MemberInner();
		System.out.println(memIn.num);
		
		System.out.println("=================");
		
		System.out.println(Outer.staticNum);
		System.out.println(Outer.StaticInner.num);
		Outer.StaticInner.out();

		System.out.println("=================");
		
		o.out();
		
		System.out.println("=================");
		
	}
}
