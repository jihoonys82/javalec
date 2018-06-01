package manage;

import java.util.Scanner;

public class StudentService {
	private Student stu;
	private Scanner sc;
	
	public StudentService() {
		stu = new Student();
		sc = new Scanner(System.in);
	}
	
	public void insertInfo() {
		
		System.out.println("=== Input Student Informaiton === ");
		System.out.print("Student Name >> ");
		stu.setName(sc.nextLine());
		System.out.print("Student Age >> ");
		stu.setAge(sc.nextInt());
		sc.nextLine();
		
	}
	
	public void insertScore() {
				
		System.out.println("=== Input Student Score === ");
		System.out.print("Korean score >> ");
		stu.setKor(sc.nextInt());
		System.out.print("English score >> ");
		stu.setEng(sc.nextInt());
		System.out.print("Math score >> ");
		stu.setMath(sc.nextInt());
				
	}
	
	public void calcSum() {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}
	
	public void calcAvg() {
		stu.setAvg((double)stu.getSum() / 3.0);
	}
	
	public void printStu() {
		System.out.println("=== Student Details === ");
		System.out.println("Student Name : " + stu.getName());
		System.out.println("Student Age : " + stu.getAge());
		System.out.println();
		System.out.println("Koren Score : " + stu.getKor());
		System.out.println("English Score : " + stu.getEng());
		System.out.println("Math Score : " + stu.getMath());
		System.out.println();
		System.out.println("Sum : " + stu.getSum());
		System.out.printf("Average : %.2f \n", stu.getAvg());		
	}
	
	
	public void scClose() {
		sc.close();
	}
}
