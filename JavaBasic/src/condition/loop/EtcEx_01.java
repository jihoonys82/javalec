package condition.loop;

public class EtcEx_01 {

	public static void main(String[] args) {
		
		//break
		// abort control statement except if.
		// break �ڵ尡 ���Ե� �߰�ȣ�� ��� 1���� �ߴܽ�Ŵ
		
		//continue
		//	using in loop statement
		// 	continue next loop 
		// 		for - go to increment
		//		while - goto termination
		//		do-while -- go to termination 
		
		for(int i=0; i<10; i++) { 
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		}
		System.out.println("================");
		
		for(int i =0;i<10;i++) { 
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
	}

}