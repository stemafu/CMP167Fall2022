import java.util.Scanner;

public class SwitchDxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scnr.nextInt();
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			/*This should cover everything
			 * other than 1, 2, 3
			 */
			System.out.println("not 1, 2, or 3");
		}

	}

}
