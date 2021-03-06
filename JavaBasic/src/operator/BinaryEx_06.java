package operator;

public class BinaryEx_06 {
		public static void main(String[] args) {
			//Bitwise logical operator
			
			// &(and) |(or) ^(xor)
			
			int num1 = 21;  //...0001 0101
			int num2 = 24;  //...0001 1000
			
			System.out.println(num1 & num2); // 0001 0000 --> 16
			System.out.println(num1 | num2); // 0001 1101 --> 29
			System.out.println(num1 ^ num2); // 0000 1101 --> 13
			
			
			System.out.println((num1 ^ num2)^num2 ); // result is 21(num1)!!  ^(xor) is used for coding/decoding
			//  0001 0101  = 21
			// ^0001 1000  = 24 
			// =0000 1101  = 13
			// ^0001 1000  = 24
			// =0001 0101  = 21 
		}
}
