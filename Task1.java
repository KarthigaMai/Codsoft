package Tasks;

import java.util.Scanner;

public class Task1 {
     static int score=0;
	public static void main(String[] args) {
		System.out.println("Trial round");
		game(0);
		Scanner s=new Scanner(System.in);
		System.out.println("Wants to play again Comment yes or No");
		String comment=s.next();
		System.out.println("How many rounds if you want to play");
		int rounds=s.nextInt();
		for(int i=1;i<=rounds;i++) {
		if(comment.equals("yes"))
		{
			System.out.println(i+" th round");
			game(i);
		}
		else
			System.out.println("Thank You");
		}
	}
	public static void game(int round) {
		int Systemnumber = (int) (Math.random() * 100 + 1);
		Scanner s = new Scanner(System.in);
	
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter your Number to guess" + " " + i + "chance");
			int userno = s.nextInt();
			if (Systemnumber < userno) {
				System.out.println("Guessed Number is too high");
			} else if (Systemnumber > userno) {
				System.out.println("Guessed Number is too low");
			}
			else {
				System.out.println("Congraulations you win");
				if(round!=0) {
				score+=10;
				System.out.println("correct answer Your score is "+ score+" "+i+"  attempt"+round+"   round");
				}
				break;
			}
		}
		if(round!=0)
		  System.out.println("final score"+score);
	}

}
