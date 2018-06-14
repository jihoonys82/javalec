package exception;

public class ExceptionEx_06_throw {

	public static void main(String[] args) {
		
		// occur exception with "throw"
		try {
			throw new NullPointerException();		
		} catch (NullPointerException e) {
			System.out.println("NullpointerException occured.");
		} catch (Exception e) {
			System.out.println("All kinds of exception");
		} finally {
			System.out.println("this line is forced executed");
		}
		
		System.out.println("system terminated");
	}

}
