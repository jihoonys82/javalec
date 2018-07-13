package singleton;

//�ν��Ͻ� ���� �� �߰� �۾� �� �� �ֵ��� static��� ����
public class Singleton_02 {
	private static Singleton_02 instance; 
	
	// static initialize block - class variable initialize. 
	static {
		try {
			instance = new Singleton_02();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private Singleton_02() {}
	
	public static Singleton_02 getInstance() {
		return instance;
	}
}
