import java.util.Scanner;

public class StringsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Drinkwater";
		
		/* str.indexOf(cha)
		 * 
		 */
		int indexOfSomeChar = name.indexOf('r');
		
		System.out.println(indexOfSomeChar);
		
		/* 
		 * str.charAt(index)
		 */

		
		char characterAtSomeIndex = name.charAt(0);
		System.out.println(characterAtSomeIndex);
		
		/*
		 * concatenation
		 */
		String newName = name + " " + "'i's \"my friend\"";
		
		System.out.println(newName);
		
		
		System.out.println(newName.length());
		
		String ab = "LC";
		int count = 01;
		
		String abCOunt = ab + count;
		
		System.out.println(abCOunt);
		
		Scanner scan = new Scanner(System.in);
		
		//String str = scan.nextLine();
		//System.out.println(str);
		
		System.out.println("enter name 1");
		String str1 = scan.next();
		System.out.println("\"" +str1 +"\"" + str1.indexOf('a'));
		
		//System.out.println("enter name 2");
		String str2 = scan.next();
		System.out.println(str2);
		
		//System.out.println("enter name 3");
		String str3 = scan.next();
		System.out.println(str2);
		
		//System.out.println("enter name 4");
		String str4 = scan.next();
		System.out.println(str4);
		
	}
	

}
