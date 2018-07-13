package singleton;

// �ν��Ͻ� ���� �� �߰� �۾� �� �� �ֵ��� static��� ����

public class Singleton_02 {

	private static Singleton_02 instance;
	
	//static �ʱ�ȭ ��� - Ŭ���� ���� �ʱ�ȭ
	static {
		try {
			instance = new Singleton_02();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private Singleton_02() { } // private ������
	
	// �ν��Ͻ� ��ȯ �޼ҵ�
	public static Singleton_02 getInstance() {
		return instance;
	}
	
}











