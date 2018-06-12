package generics;

class Parent01<T> {
	T data1;
}
class Child01 extends Parent01<String> {
	//Data1 is inherited to String type.
}
class Child02<K> extends Parent01<K> {
	// suspend generic type inherited from parent class
}
class Parent03<M> {
	
}
class Child03<M, N> extends Parent03<M> {
	// M : Inherited generic type (not decided)
	// N : Child class'es generic. 
}

public class GenericsEx_09_Inheritance {
	public static void main(String[] args) {
	
		
		
	}
	
}
