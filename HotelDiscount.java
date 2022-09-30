import java.util.Scanner;

public class HotelDiscount {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int hotelRate;
		int userAge;
		
		hotelRate = 155;
		
		System.out.print("Enter age: ");
		userAge = scnr.nextInt();
		
		if(userAge > 65) {
			hotelRate = hotelRate - 20;
		}
		
		System.out.print("Your hotel rate: ");
		System.out.println(hotelRate);
	}

}
