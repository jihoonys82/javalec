package generics;

class Data<K> {
	K data;
}
class Class07<T> {
	Data<T> d;
}


public class GenericsEx_07_Member {
	public static void main(String[] args) {
		
		Class07<String> c07 = new Class07<>();
		c07.d = new Data<>();
		

	}
}
