package manage;

public class Exem {
	public static void main(String[] args) {
		
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();
		
		ss.calcSum();
		ss.calcAvg();
		
		ss.printStu();
		
		ss.scClose();
	}
}
