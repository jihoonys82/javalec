package singleton;


// Cons. 
// 1. 인스턴스화 하면서 추가 작업 불가
// 2. 인스턴스 사용 하지 않아도 생성해 놓는다.
// 
public class Singleton_01 {
	
	public String data = "Apple";
	
	private static Singleton_01 instance = new Singleton_01();
	
	private Singleton_01() {}
	
	public static Singleton_01 getInstance() {
		return instance;
	}
	
}
