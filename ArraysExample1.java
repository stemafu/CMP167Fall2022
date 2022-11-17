import java.util.Scanner;

public class ArraysExample1 {
	
	/* We can be able to arrays as parameters to methods
	 * 
	 * As an example, let us create a method that takes
	 * an array of ints and prints the values that are 
	 * stored inside that array
	 */
	public static void printsValues(int [] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		System.out.println();
		
	}
	
	/* Write a methods that takes an array of ints
	 * and return the sum of the numbers inside the array.
	 */
	public static int sum(int [] nums) {
		int total = 0;
		for(int i = 0; i < nums.length; i++)
			total = total + nums[i];
		
		return total;
	}
	
	public static void swap(int [] nums, int i1, int i2 ) {
		int temp = nums[i1];
		nums[i1] = nums[i2];
		nums[i2] = temp;
	}

	public static void main(String [] args) {
		
		// Declaring an array
		int [] scores = new int[6];
		Scanner scnr = new Scanner(System.in);
		
		/*scores[0] = 56;
		scores[1] = 90;
		scores[2] = 99;
		scores[3] = 31;
		scores[4] = 74;
		scores[5] = 81;*/
		
		
		//scores[7] = 81;
		
		/* We can get elements of an array from 
		 * a user via keyboard
		 * 
		 */
		System.out.println("Enter some values for the array");
		
		int index = 0;
		int num;
		do {
			num = scnr.nextInt();
			if(num >= 0) {
				scores[index] = num;
				index++;
			}
		} while(num >= 0 && index < scores.length);
		
		
		//System.out.println(scores[0]);
		
		//System.out.println(scores.length);
		
		/*
		 * Let us declare a variable called x of type int
		 */
		int x;
		//x = 67;
		
		
		printsValues(scores);
		swap(scores, 1, 3);
		
		printsValues(scores);
		int total = sum(scores);
		
		System.out.println("total scores is " + total);
		System.out.println("avg score is " + total / (double) scores.length);

	}

}
