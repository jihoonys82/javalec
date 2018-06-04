package manage;

import java.util.Scanner;

public class StudentService_ver2 {
	private Scanner sc;
	private Student[] stuArr;
	
	public StudentService_ver2() {
		stuArr =new Student[3];
		for(int i=0;i<stuArr.length;i++) {
			stuArr[i] = new Student();
		}
		sc = new Scanner(System.in);
	}
	
	private int getIndex() {
		int idx = 0;
		while(idx<1 || idx>stuArr.length) {
			System.out.print("Input Student Index (1~"+ stuArr.length + ") >> "); 
			idx = sc.nextInt();
			sc.nextLine();
		}
		return idx;
	}
	
	private void insertInfo(Student stu, int idx) {
		System.out.println("=== Input Student "+ idx +" Informaiton === ");
		System.out.print("Student Name >> ");
		stu.setName(sc.nextLine());
		System.out.print("Student Age >> ");
		stu.setAge(sc.nextInt());
		sc.nextLine();
	}
	
	
	public void insertInfoAll() {
		for(int i=0;i<stuArr.length;i++) {
			insertInfo(stuArr[i], i+1);
		}
	}
	public void insertInfoIdx() {
		int i = getIndex();
		insertInfo(stuArr[i-1], i);
	}
	
	private void insertScore(Student stu, int idx) {
		System.out.println("=== Input Student "+ idx +" Score === ");
		System.out.print("Korean score >> ");
		stu.setKor(sc.nextInt());
		System.out.print("English score >> ");
		stu.setEng(sc.nextInt());
		System.out.print("Math score >> ");
		stu.setMath(sc.nextInt());
		sc.nextLine();
		this.calcSum(stu);
		this.calcAvg(stu);
	}
	
	public void insertScoreAll() {
		for(int i=0;i<stuArr.length;i++) {
			insertScore(stuArr[i], i+1);
		}
	}
	
	public void insertScoreIdx() {
		int i = getIndex();
		insertScore(stuArr[i-1], i);
	}
	
	public void insertStu(int idx) {
		insertInfo(stuArr[idx-1], idx);
		insertScore(stuArr[idx-1], idx);
	}
	
	public void insertStuAll() {
		for(int i=0;i<stuArr.length;i++) {
			insertInfo(stuArr[i], i+1);
			insertScore(stuArr[i], i+1);
		}
	}
	
	private void calcSum(Student stu) {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}
	
	private void calcAvg(Student stu) {
		stu.setAvg((double)stu.getSum() / 3.0);
	}
	
	private void printStu(Student stu, int idx) {
		System.out.println("=== Student Details === ");
		System.out.println("Student Index : " + idx + ", Student Name : " + stu.getName() + ", Student Age : " + stu.getAge());
		System.out.println("Koren : " + stu.getKor() + ", English : " + stu.getEng() + ", Math : " + stu.getMath());
		System.out.printf("Sum : %d, Average : %.2f \n",  stu.getSum(), stu.getAvg());	
	}
	public void printStuAll() {
		for(int i=0;i<stuArr.length;i++) {
			printStu(stuArr[i], i+1);
		}
	}
	public void printStuIdx() {
		int i = getIndex();
		printStu(stuArr[i-1], i);
	}
	
	public void scClose() {
		sc.close();
	}
}
