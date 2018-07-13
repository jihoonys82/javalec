package singleton;

public class Singleton_03 {
	private static Singleton_03 instance;
	
	private Singleton_03() { }
	
	public static Singleton_03 getInstane() {
		// getInstance()를 처음 호출할 때까지 객체생성 미룸
		// 두번째부터는 이미 만들어진 객체 반환 
		if (instance == null) {
			try {
				instance = new Singleton_03();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}
