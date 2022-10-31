import java.util.Scanner;

public class CustomAdder {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int sum = 0;
		
		int userNum;
		
		System.out.print("Enter a number: ");
		userNum = scnr.nextInt();
		
		while(userNum >= 0) {
			sum = sum + userNum;
			
			System.out.print("Enter a number: ");
			userNum = scnr.nextInt();
		}
		// 90 100
		System.out.println("Total is " + sum);

	}

}
