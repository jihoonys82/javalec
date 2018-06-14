package exception;

class ThrowEx {
	
	// if  str is null, NullPointerException is occurred. 
	public void print(String str, int cnt) {
		
		if(str==null)
			throw new NullPointerException();
		
		for(int i=0;i<cnt;i++) {
			System.out.println(str);
		}
	}
}

public class ExceptionEx_07_throw {

	public static void main(String[] args) {
		
		ThrowEx te = new ThrowEx();
		
		String str = null;
		
		try {
			te.print(str , 3);			
		} catch (NullPointerException e) {
			System.out.println("String value is null");
		}
		
	}

}
