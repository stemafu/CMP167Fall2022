import java.util.Random;
public class PersonDriver2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(20, 6.6);
		Person p2 = new Person(20, 7.6);
		Person p3 = p1;
		Person p4 = null;
		
	
		
		//p1.equals(p1);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		//p1.display();
		
		String [] names = new String[5];
		names[0] = "Atlantic Ocean";
		names[1] = "Indian Ocean";
		names[2] = "Pacific Ocean";
		names[3] = "Red Sea";
		names[4] = "Hudson River";
		
		Random random = new Random();
		int randomNumber = random.nextInt(5);
		
		System.out.println(randomNumber);
		System.out.println(names[randomNumber]);

	}

}
