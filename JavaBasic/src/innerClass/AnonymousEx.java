package innerClass;

interface Anonymous {
	void out();
}

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous an;
		
		an = new Anonymous() {
			@Override
			public void out() {
				System.out.println("Anonymous inner class 1");
			}
		};
		an.out();
		
		//anonymous inner class cannot be reused. 
		Anonymous an2 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("Anonymous inner class 2");
				
			}
		};
		an2.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("Anonymous inner class 3");			
			}
		}.out();
		
	}
}
