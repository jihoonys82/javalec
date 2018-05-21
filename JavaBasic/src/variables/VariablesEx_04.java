package variables;

public class VariablesEx_04 {
	// auto completion function : type main then ctrl + space
	public static void main(String[] args) {
		// real number type data
		System.out.println(123); // compiler make unseen int type variable
		System.out.println(3.14); // compiler make unseen double type variable
		System.out.println(3.14f); // f makes value to float type (casting)
		// auto completion : type 'sysout' then ctrl + space
		
		//float f = 3.14; // error occured due to type mismatch.
		// f is float type(4byte) but 3.14 is recognized float type (8byte)
		// solution1. casting
		float f = (float) 3.14; //forced casting
		// there is another casting type. 
		f = 3.14f; 
		// solution2. change float type to double
		double d = 3.14; 
		
		// it works!
		d = 3.14f; 
		// implied(auto) casting. double type (8byte) can contain smaller type likes float type (4byte).
		
		// forced casting. bigger type variable put in smaller type.
		int num = (int)3.14; // it possible, 
		System.out.println(num); // but result is 3.
		//forced casting could get probability to loss data.
		
		double dd = 100; // put in 100.. however, 
		System.out.println(dd); // result is 100.0
		
		System.out.println(12+34.56); // int + double.. 12 is changed its type to double via compiler to calculate with 34.56
		
		
	}
}
