package inheritance;

public class Person {
	private String name;
	private int money;
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		System.out.println(this.name + " has " + this.money + " won.");
	}

	public void buy(Product prod) {
		this.prod = prod;
		this.money -= this.prod.price;
		System.out.println(this.name + " has purchased "+ this.prod.model+ " for " + this.prod.price + " won.");
		System.out.println("[Balance] " + this.money +" won.");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	
	
	
}
