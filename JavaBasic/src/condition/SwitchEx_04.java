package condition;

public class SwitchEx_04 {

	public static void main(String[] args) {
		
		int score = 88;
		char grade; 
		
		switch(score/10) { 
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';		
		}
		System.out.println("Grade : " + grade);
		
		// it is convert to if statement likes below
		if(score>=90 && score<=100) grade= 'A';
		else if(score>=80 && score<90) grade= 'B';
		else if(score>=70 && score<80) grade= 'C';
		
	}

}
