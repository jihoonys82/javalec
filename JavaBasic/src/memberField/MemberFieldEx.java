package memberField;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		
		MemberField_01 mf02 = new MemberField_01();
		
		mf01.setNum(11);
		mf02.setNum(22);
		
		System.out.println(mf01.getNum());
		System.out.println(mf02.getNum());
		
		System.out.println("===================");
		
//		MemberField_02 mf03 = new MemberField_02();
//		MemberField_02 mf04 = new MemberField_02();
		
		MemberField_02.setCity("Busan");
		
//		System.out.println(mf03.getCity());
//		System.out.println(mf04.getCity());
		System.out.println(MemberField_02.getCity());
		
	}
}
