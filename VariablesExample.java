import java.util.Scanner;

public class VariablesExample {

	public static void main(String[] args) {
		/*
		 * This example shows how to create variables
		 * and how to assign values to variables.
		 */
		Scanner scnr = new Scanner(System.in);
		int count;
		int total;
		int x;
		double myMoney;
		
		System.out.print("Please enter the value of count: ");
		count = scnr.nextInt();
		
		System.out.print("Please enter the value of x: ");
		x = scnr.nextInt();
		
		System.out.print("Enter the amount of money for pizza: ");
		myMoney = scnr.nextDouble();
		
		total = x + count;
		
		System.out.println(total);
		
		System.out.println(x + x + count);
		
		System.out.println(x * x * count);

	}

}
