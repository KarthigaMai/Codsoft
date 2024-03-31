package Tasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		mark();
	}

	public static void mark() {
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Subjects in your Curriculum");
		int subjects = s.nextInt();
		int TotalMarks = 0;
		for (int i = 1; i <= subjects; i++) {
			System.out.println("Enter Subject Name");
			String Subject = s.next();
			System.out.println("Enter your " + Subject + " Marks");
			int mark = s.nextInt();
			TotalMarks += mark;
		}
		System.out.println("Your Total Marks = " + TotalMarks);
		double Average = TotalMarks / subjects;
		System.out.println("Your Average = "+Average);
		if (Average >= 90.00 && Average <= 100.00)
			System.out.println("O Grade- Excellent");
		else if (Average >= 70.00 && Average < 90.00)
			System.out.println("A Grade- Very Good");
		else if (Average >= 60.00 && Average < 70.00)
			System.out.println("B Grade - Good and improve");
		else
			System.out.println("C Grade -Try to Study well");

	}

}
