package memberField;

public class MemberField_02 {

	// class variable, static variable
	private static String city = "Seoul";
	//static declare the variable only once. 
	
	public static String getCity() {
		return city;
	}
	
	public static void setCity(String city) {
		//this.city = c; // and the input variable name changes to c
		MemberField_02.city = city;
	}
	
}
