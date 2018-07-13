package singleton;

public class Singleton_03 {
	private static Singleton_03 instance;
	
	private Singleton_03() { }
	
	public static Singleton_03 getInstane() {
		// getInstance()�� ó�� ȣ���� ������ ��ü���� �̷�
		// �ι�°���ʹ� �̹� ������� ��ü ��ȯ 
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
