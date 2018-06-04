package manage;

public class Exem {
	public static void main(String[] args) {
		
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();

		ss.printStu();
		
		ss.scClose();
		
	}
}
