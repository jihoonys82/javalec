package singleton;

public class Singleton_03 {
	private static Singleton_03 instance;
	
	// private ������
	private Singleton_03() { }
	
	// �ν��Ͻ� ��ȯ �޼ҵ�
	public static Singleton_03 getInstance() {
		
		// getInstance()�� ó�� ȣ���� ������ ��ü������ �̷�
		// �� ��° ȣ�� ���ĺ��ʹ� �̹� ������� ��ü�� ��ȯ
		if( instance == null ) {
			try {
				instance = new Singleton_03();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return instance;
	}
}











