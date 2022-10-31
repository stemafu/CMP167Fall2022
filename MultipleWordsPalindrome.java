import java.util.Scanner;

/*
 * Video Sources
 * https://video.search.yahoo.com/search/video;_ylt=AwrhRpD5VVBjhr8Br7RXNyoA;_ylu=Y29sbwNiZjEEcG9zAzEEdnRpZANMT0NVSTA1NV8xBHNlYwNwaXZz?p=java+variables&fr2=piv-web&type=E210US91088G0&fr=mcafee#id=1&vid=0206cf9d43b875aaad764bfc7ed2a9e8&action=view
 * 
 */


public class MultipleWordsPalindrome {

	public static void main(String[] args) {

		String word = "this comes from the keyboard";
		Scanner scnr = new Scanner(System.in);
		
		String answer;
		//System.out.println(Math.cos(9));

		do {
			
			do {
				// we get the word from the keyboard.
				System.out.print("Enter a word: ");
				word = scnr.nextLine();
				// we check to see if the word is  apalindrome


			} while(!word.equalsIgnoreCase("exit"));

			System.out.print("Do you want to enter other words ");
			answer = scnr.nextLine();
		}while(answer.equalsIgnoreCase("Y"));

	}

}
