package inheritance;

public abstract class Product {
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//alt+shift+s+r ==> Shortcuts for generate getters and setters  
	
	//abstract method - there is no implemented code. child class HAS TO override this method.
	public abstract void out() ;
	
}
