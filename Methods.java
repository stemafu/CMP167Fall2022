import java.util.Scanner;
/*
 * Video presentation: https://www.youtube.com/watch?v=8fyTQsXX0pM&t=3s
 */
public class Methods {


	public static void methodName() {
		/*
		 * The method body
		 */
		System.out.println("hello there!");

		int count = 90;
		System.out.println(count);
	}

	/* We want to write a method called 
	 * displayGreeting that takes a string 
	 * parameter name and prints a greeting
	 * based on the value inside the name.
	 */

	public static void displayGreeting(String name) {
		System.out.println("Hello " + name);
	}

	/* Write a method that takes two int parameters
	 * and prints the sum of the values of the two 
	 * parameters.
	 */
	public static void sum(int num1, int num2) {

		int total = num1 + num2;
		System.out.println(total);
	}

	/*
	 * Write a method that takes two int
	 * parameters and prints the largest
	 * number of the two parameters
	 *  1 2
	 */
	public static void max(int num1, int num2) {
		if(num1 >= num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	/* We want to write a method that takes two
	 * int parameters and returns the smallest
	 * number of the two parameters.
	 */
	public static int min(int num1, int num2){
		if(num1 <= num2) {
			return num1;
		}else {
			return num2;
		}
	}

	
	/* Write a static method named getFirstChar
	 * that takes a String and returns the 
	 * first character in the string.
	 * 
	 * Now if the string is empty, the method
	 * should return an empty representing nothing 
	 * for the char. return ' ';
	 * String name  = "";
	 */
	public static char getFirstChar(String stringName) {
		
		/*
		 *  stringName.length() == 0 to check to see
		 *  if a string is empty
		 *  
		 *  null check
		 */
		if (stringName == null)
			return ' ';
		
		if (stringName.length() == 0) {
			return ' ';
		}else {
			return stringName.charAt(0);
		}
		
	}
	
	
	/* 
	 * Write a method called reverse that takes a string
	 * and returns a reversed string of the string parameter
	 * 
	 */
	
	public static String reverse(String name) {
		String reversedName = "";
		
		for(int i = name.length() - 1; i >= 0; i--) {
			//System.out.print(name.charAt(i));
			reversedName = reversedName + name.charAt(i);
		}
		
		return reversedName ;
	}

	public static void main(String[] args) {
		//Methods.methodName();
		//Methods.methodName();
		//displayGreeting("values goes here");
		Scanner scnr = new Scanner(System.in);
		
		String name = null;
		char test = getFirstChar(name) ;
		System.out.println(test);
		
		/*
		 * a method call, causes a method to execute (run)
		 */
		methodName();
		methodName();
		
		displayGreeting("Water Under the Bridge");
		displayGreeting("Screen");
		
		int min = min (1, 2);
		
		System.out.println("min is " + min);

		/*System.out.println("Enter two numbers");
		int num1 = scnr.nextInt();
		int n2 = scnr.nextInt();

		double sine = Math.sin(67.0);
		System.out.println(sine);
		sum(num1, n2);

		max(1, 89);*/


	}

}
