package apiTest;

class Point implements Cloneable {
	int x; 
	int y;
	
	@Override
	public String toString() {
		
		return "Point ("+x+","+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.x == ((Point)obj).getX() && this.y == ((Point)obj).getY())
			return true; 
		else 
			return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}

public class ObjectEx {
	public static void main(String[] args) {
		Object o = new Object();
		
		System.out.println("=====toSting()=====");
		// toString() 
		// function : return the description for Class as String type.
		// purpose : describe class
		// usage : return reference ( datatype@reference )
		// Overriding available
		
		//println() method meet method object as parameter, 
		// obejct's toString() is called automatically. 
		System.out.println(o.toString()); // print reference
		System.out.println( o ); // same value printed
		
		Point p = new Point(10,20);
		System.out.println(p);
		
		System.out.println("\n=====equals()=====");
		
		Point p2 = new Point(11,22);
		Point p3 = new Point(11,22);
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		
		System.out.println("p2==p3 : " +(p2==p3));
		System.out.println("p2.equals(p3) : " +(p2.equals(p3)));
		
		String str = new String("Apple");
		System.out.println("String compare : " +"Apple".equals(str));
		
		System.out.println("\n=====hashCode()=====");
		String str1 = new String("Apple");
		String str2 = new String("Apple");
		String str3 = new String("Banana");
		String str4 = str1;
		
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());
		// str1,2,4 has same hashCode. Same string value is shared to reduce memory
		
		System.out.println("p : " + p.hashCode());
		System.out.println("p2 :" + Integer.toHexString(p2.hashCode()));
		
		System.out.println("\n=====getClass()=====");
		System.out.println("p.getClass() : " + p.getClass());
		System.out.println("o.getClass() : " + o.getClass());
		System.out.println("str.getClass() : " + str.getClass());
		
		System.out.println("\n=====clone()=====");
		Point p_ori = new Point(33, 44);
		Point p_clone1 = p_ori; //Shallow copy.
		
		// deep copy using constructor
		Point p_clone2 = new Point(p_ori.x, p_ori.y);
		
		Point p_clone3 = null; 
		
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(p_ori.hashCode());
		System.out.println(p_clone1.hashCode()); //same as ori - shallow copy
		System.out.println(p_clone2.hashCode()); // deep copy by construction
		System.out.println(p_clone3.hashCode()); // deep copy by clone()
		
		
		
		
		
		
		
	}
}
