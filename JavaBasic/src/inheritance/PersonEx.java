package inheritance;

public class PersonEx {
	public static void main(String[] args) {
		
		Person p = new Person("Alice", 1000);
		
		Product prod1 = new Tv("LG", 500);
		Product prod2 = new Computer("i5", 500);
		
		p.buy(prod1);
		p.buy(prod2);

	}
}







