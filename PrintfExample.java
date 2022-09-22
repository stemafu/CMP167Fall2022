import java.util.Scanner;
/* printf examples
 * Date: 9/21/2022
 */
public class PrintfExample {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scnr.nextLine();
		
		System.out.printf("Hello %s %n", name);
		
		System.out.println("Each apples is $1:57, how many "
				+ "would you like?");
		int appleCount = scnr.nextInt();
		
		double total = appleCount * 1.57;
		
		
		System.out.printf("The total for buying %d apples is $%.2f ", appleCount, total);
		

	}

}
