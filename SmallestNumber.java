import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter the first number: ");
		num1 = scnr.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = scnr.nextInt();
		
		System.out.print("The smallest number is ");
		if(num1 > num2) {
			System.out.println(num2);
		}
		else {
			System.out.println(num1);
		}

	}

}
