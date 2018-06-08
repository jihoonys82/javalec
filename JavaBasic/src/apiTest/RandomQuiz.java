package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {

	static final int SCISSORS	=1;
	static final int ROCK		=2;
	static final int PAPER		=3;
	static final int EXIT		=99;
	static int win	= 0;
	static int lose = 0; 
	static int draw = 0;
	
	public static void main(String[] args) {
		// Rock, scissors and paper game
		// int user : user input. (1~3)
		// int com : computer random (1~3)
		// 1 : scissors 2 : rock 3 : paper
		
		// i : com use Random and store the value 
		// ii: input user number
		// iii: compare user and com value 
		// iv : print result 
		// v : repeat i~iv

		Scanner sc = new Scanner(System.in);
		Random ran = new Random(); 
		
		int user = 0;
		int com  = 0;
		
		do { 
			com = ran.nextInt(3) + 1; 
			System.out.print("Input (1.Scissor, 2.Rock, 3.Paper, 99.Exit) >>> ");
			user = sc.nextInt();
			
			switch (user) {
			case SCISSORS:
				if(com==SCISSORS) draw(user);
				if(com==ROCK) win(user, com);
				if(com==PAPER) lose(user,com);
				break;
			case ROCK:
				if(com==SCISSORS) lose(user,com);
				if(com==ROCK) draw(user);
				if(com==PAPER) win(user, com);
				break;
			case PAPER:
				if(com==SCISSORS) win(user, com);
				if(com==ROCK) lose(user,com);
				if(com==PAPER) draw(user);
				break;
			case EXIT:
				System.out.println("[Final Score] Win: " + win + ", Lose: " + lose + ", Draw: " + draw);
				System.out.println("Exit the program.....");
				return;
			default:
				System.out.println("Please input number 1~3 or 99 for exit.");
			}
			
			System.out.println("[Score] Win: " + win + ", Lose: " + lose + ", Draw: " + draw + "\n");
			
		} while (user != 99);
		
		sc.close();	
	}
	
	public static void win(int user, int com) {
		System.out.println("You win! user : "+ convertRSP(user) + ", com : " + convertRSP(com));
		win++;
	}
	
	public static void lose(int user, int com) {
		System.out.println("You lose! user : " + convertRSP(user) + ", com : " + convertRSP(com));
		lose++;
	}
	public static void draw(int user) {
		System.out.println("Draw. user & com : " + convertRSP(user));
		draw++;
	}
	
	public static String convertRSP(int num) {
		if(num == 1) return "Scissors";
		if(num == 2) return "Rock";
		if(num == 3) return "Paper";
		return "";
	}
	

}
