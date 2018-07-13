package singleton;


// Cons. 
// 1. �ν��Ͻ�ȭ �ϸ鼭 �߰� �۾� �Ұ�
// 2. �ν��Ͻ� ��� ���� �ʾƵ� ������ ���´�.
// 
public class Singleton_01 {
	
	public String data = "Apple";
	
	private static Singleton_01 instance = new Singleton_01();
	
	private Singleton_01() {}
	
	public static Singleton_01 getInstance() {
		return instance;
	}
	
}
