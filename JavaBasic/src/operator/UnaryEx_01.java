package operator;

public class UnaryEx_01 {
	public static void main(String[] args) {
		//���� ������
		// ����(++), ����(--) ������
		// ���� 1 ����/���� ��Ű�� ����
		// ���� ������
		// num++; // ����(��ġ)���� ������
		// num--; // ����(��ġ)���� ������
		
		int num; 
		num = 15; 

		System.out.println("before : " + num);
		System.out.println("run : " + num++);
		System.out.println("after : " + num);
		System.out.println("============");
		
		num = 15;
		
		System.out.println("before : " + num);
		System.out.println("run : " + ++num);
		System.out.println("after : " + num);
		System.out.println("============");
		
		// ������ ���� 1 ������Ű�� �ڵ� 
		// num = num + 1; 
		// num += 1; 
		// num++;  --> the most priority! and best performance! 
		// ++num;		
		
	}
}