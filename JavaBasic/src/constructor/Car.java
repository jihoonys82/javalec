package constructor;

public class Car {
	private String model;
	private String colour;
	
	public Car(String model, String colour) {
		this.model = model;
		this.colour = colour;
	}
	
	public void display() {
		System.out.println("Model: " + this.model + ", Colour : " + this.colour);
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return this.colour;
	}
	
}
