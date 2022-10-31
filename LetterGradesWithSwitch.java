import java.util.Scanner;

public class LetterGradesWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numericScore;
		String letterGrade = "";
		Scanner scnr = new Scanner(System.in);
		
		
		// prompt telling a user what to do
		System.out.print("Enter your numeric score: ");
		numericScore = scnr.nextInt();
		
		switch(numericScore) {
		case 100:
			System.out.println("no breaks");
		case 99:
			letterGrade = "A";
			break;
			
		default:
			letterGrade = "A";
		}
		
		System.out.println(letterGrade);

	}

}
