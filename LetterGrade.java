import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		int numericScore;
		String letterGrade = "";
		Scanner scnr = new Scanner(System.in);
		
		
		// prompt telling a user what to do
		System.out.print("Enter your numeric score: ");
		numericScore = scnr.nextInt();
		
		if(numericScore >= 93) {
			letterGrade = "A";
		}
		else if(numericScore >= 90) {
			letterGrade = "A-";
		}
		else if(numericScore >= 87) {
			letterGrade = "B+";
		}
		else if(numericScore >= 84) {
			letterGrade = "B";
		}
		else if(numericScore >= 80) {
			letterGrade = "B-";
		}
		else if(numericScore >= 77) {
			letterGrade = "C+";
		}
		else if(numericScore >= 74) {
			letterGrade = "C";
		}
		else if(numericScore >= 70) {
			letterGrade = "C-";
		}		
		else if(numericScore >= 67) {
			letterGrade = "D+";
		}
		else if(numericScore >= 64) {
			letterGrade = "D";
		}
		else if(numericScore >= 60) {
			letterGrade = "D-";
		}
		else {
			letterGrade = "F";
		}
		System.out.println(letterGrade);
		

	}

}
