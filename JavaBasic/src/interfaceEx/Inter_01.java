package interfaceEx;

public interface Inter_01 {
	
	public static final int NUM = 123; //"public static final" only
	int MAX = 99; // it is not member variable. It is constant. (public static final)
	
//	public void out() { //it dose not work.
//	}

	public abstract void out();
	
	public void display(); // it is declared as "abstract" method.
	
}
