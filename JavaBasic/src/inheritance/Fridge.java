package inheritance;

public class Fridge extends Product {

	public Fridge(String model, int price) {
		super(model,price);
		
	}
	
	@Override // Because this method is declared abstract in super class(Product class) it is auto-generated.
	public void out() {  
		System.out.println("Fridge!!");

	}
	
	public void print() { 
		System.out.println("Fridge!!!!!!!!");
	}

}
