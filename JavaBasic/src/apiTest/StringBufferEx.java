package apiTest;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		// assign new space when it needs.  
		System.out.println(str.length()); // 0
		
		//StringBuffer get string space in advance.
		System.out.println(sb.length()); // 0
		System.out.println(sb.capacity()); // 16
		
		System.out.println("-----sb2-----");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("len : " +sb2.length()); // 5 
		System.out.println("capa : "+sb2.capacity()); // 16 + 5 
		System.out.println("sb : " + sb2);
		
		System.out.println("-----sb3-----");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("len : " +sb3.length()); // 0 
		System.out.println("capa : "+sb3.capacity()); // 5  
		System.out.println("sb : " + sb3); // none 
		
		System.out.println("--Add Apple--");
		sb3.append("Apple");
		System.out.println("len : " +sb3.length()); // 5 
		System.out.println("capa : "+sb3.capacity()); // 5  
		System.out.println("sb : " + sb3); // Apple
		
		System.out.println("--Add Banana--");
		sb3.append("Banana");
		System.out.println("len : " +sb3.length()); // 11 
		System.out.println("capa : "+sb3.capacity()); // 12  overflow => (previous Capacity+1)*2 = (5+1)*2 = 12
		System.out.println("sb : " + sb3); // AppleBanana
		
//		System.out.println("--Add longer--");
//		sb3.append("AAAAAAAAA");
//		System.out.println("len : " +sb3.length()); // 20 
//		System.out.println("capa : "+sb3.capacity()); // 26 overflow size is bigger then (previous Capacity+1)*2, extend as big as the length(). 
//		System.out.println("sb : " + sb3); // AppleBananaAAAAAAAAA
		
		System.out.println("-----insert()-----");
		// 5번째인덱스(5 offset)에 "Orange" 넣고 출력
		sb3.insert(5, "Orange");
		System.out.println("insert() : " + sb3);
		
		System.out.println("-----deleteCharAt()-----");
		// 3번째 인덱스 삭제하고 출력
		sb3.deleteCharAt(3);
		System.out.println("deleteCharAt() : " + sb3);
		
		System.out.println("-----delete()-----");
		// delete(0, 3) 호출 후 출력
		sb3.delete(0, 3);
		System.out.println("delete() : " + sb3);
		
		
		System.out.println("-----substring()-----");
		// substring(1,7) 호출
		sb3.substring(1, 7);
		
		// length, capacity 확인
		// sb출력
		// substring(1,7) 결과 출력
		System.out.println("len : " +sb3.length());  
		System.out.println("capa : "+sb3.capacity());
		System.out.println("sb : " + sb3);
		System.out.println("substring() : " + sb3.substring(1, 7)); 
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() 호출
		sb3.trimToSize();
		// length, capacity 확인
		System.out.println("len : " +sb3.length());  
		System.out.println("capa : "+sb3.capacity());
		System.out.println("sb : " + sb3);
		
		System.out.println("-----reverse()-----");
		// reverse() 호출 후 결과 확인
		sb3.reverse();
		System.out.println("reverse() : " + sb3);
		
	}
}
