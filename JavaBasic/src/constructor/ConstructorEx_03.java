package constructor;

public class ConstructorEx_03 {
	public static void main(String[] args) {
		Car c1 = new Car("Lamborghini", "Yellow");
		
		c1.display();
		
		System.out.println("=================");
		
		c1.setModel("Spark");
		c1.setColour("White");
		
//		System.out.println(c1.getModel());
//		System.out.println(c1.getColour());
		c1.display();
	}
}
