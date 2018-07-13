package singleton;

public class Singleton_04 {
	// 자바 특성을 이용한 singleton
	// 내부 클래스로 가지고 있으면 클래스가 호출되기 전 까지는 
	// JVM이 코드 자체를 들고 있고  생성되지 않는다.
	private static class Singleton { 
		private static final Singleton_04 instance = new Singleton_04();
	}
	
	private Singleton_04() {}
	
	public static Singleton_04 getInstance() { 
		return Singleton.instance;
	}
}
