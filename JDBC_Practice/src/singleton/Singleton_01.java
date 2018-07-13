package singleton;

// ����.
//	1. �ν���ȭ�ϸ鼭 �߰� �۾��� �� �� ����
//		(����ó�� �Ұ�)
//	2. �ν��Ͻ��� ������� �ʴ��� ������ ���´�

public class Singleton_01 {
	
	public String data = "Apple";
	
	private static Singleton_01 instance
		= new Singleton_01();
	
	private Singleton_01() { } // �ܺο��� ��ü ���� �Ұ�
	
	public static Singleton_01 getInstance() {
		return instance;
	}
}









