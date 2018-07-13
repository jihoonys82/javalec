package singleton;

public class Singleton_04 {
	// �ڹ� Ư���� �̿��� singleton
	// ���� Ŭ������ ������ ������ Ŭ������ ȣ��Ǳ� �� ������ 
	// JVM�� �ڵ� ��ü�� ��� �ְ�  �������� �ʴ´�.
	private static class Singleton { 
		private static final Singleton_04 instance = new Singleton_04();
	}
	
	private Singleton_04() {}
	
	public static Singleton_04 getInstance() { 
		return Singleton.instance;
	}
}
