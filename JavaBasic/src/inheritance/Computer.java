package inheritance;

class Computer extends Product {
	
	public Computer(String model, int price) {
		super(model, price);
		//or.. below is also available. 
		//super.model = model;
		//super.price = price;
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}
}
