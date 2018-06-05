package interfaceEx;

interface InterA { 
	public void getA();
}

interface InterB {
	public void getB();
}

//Multiple inherit between interfaces is allowed. In this case, use "extends" keyword.
interface InterC extends InterA, InterB {
	public void getC();
}

class Child implements InterC {

	@Override
	public void getA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getC() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceEx_02 {
	public static void main(String[] args) { 
		Child c = new Child();
		
		c.getA();
		c.getB();
		c.getC();
		
		// split window
		//ctrl + shift + -  : split horizontal
		//ctrl + shift + [  : split vertical
	}
}
