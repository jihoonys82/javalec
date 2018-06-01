package overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading_01 ol01 = new Overloading_01();
		
		ol01.display();
		
		ol01.display(100, 10);
		
		System.out.println("--------------");
		
		Overloading_02 ol02 = new Overloading_02();
		
		System.out.println("langth : "  + ol02.getLength(1122233));
		
		System.out.println("langth of 123.4567 : "  + ol02.getLength(123.4567));
		
		System.out.println("langth of false : "  + ol02.getLength(false));
	}
}

class Overloading_01 {
	private int x;
	private int y; 
	
	public void display() {
		System.out.println("["+ x +", " + y + "]");
	}
	
	// receive 2 int type parameter and put them in the member field x,y then print them.
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		//System.out.println("["+ this.x +", " + this.y + "]");
		display();
	}
	
	public void display(double d) { }
	public void display(String s) { }
	
//	public int display() { } // it occurs error.  return type is not effect on overloading. 	
}


class Overloading_02 {
	
	// return the length of data. 
	// ex) 112233 -->6
	public int getLength(int num) {
		
		return String.valueOf(num).length();
	}

	public int getLength(boolean b) {
		
		return String.valueOf(b).length();
	}

	public int getLength(double num) {
		
		return String.valueOf(num).length();
	}
}

