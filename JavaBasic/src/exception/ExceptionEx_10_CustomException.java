package exception;

class EvenException extends Exception {

	private static final long serialVersionUID = 3368222809672627150L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The input number is NOT Even number";
	}
}

class CheckEven {
	public void check(int num) throws EvenException {
		if(num%2 != 0) {
			throw new EvenException();
		}
		System.out.println("Even Numer!");
	}
}

public class ExceptionEx_10_CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckEven ce = new CheckEven();
		try {
			ce.check(13);
		} catch (EvenException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("It is Odd number!");
		}
	}

}
