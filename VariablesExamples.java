
public class VariablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialization statement
		int count = 90;
		
		//System.out.println("count");
		
		//System.out.println(count);
		//System.out.println(COUNT);
		
		// absolute value computation
		double absX = Math.abs(-90.0);
		
		
		//double largestNumber = Math.max(9.0, 8.9);
		
		//System.out.println(absX);
		
		//System.out.println(largestNumber);
		
		
		int num1 = 40;
		
		int num2 = 15;
		
		/* In java when you take an int and you divide 
		 * it by an int, you get an int.
		 */
		System.out.println(num1 / num2);
		
		
		/*
		 * In the following line we create a string variable
		 * called name.
		 * 
		 * A string is a sequence of characters enclosed in double
		 * Quotes.
		 */
		
		String name = "You always have to Drink Water";
		System.out.println(name);
		
		//stringName.length() gives the size of a string
		System.out.println(name.length());
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(16));
		
		/* indefOf is used to get an index of a specified character
		 * stringName.indexOf(an expression)
		 * If the character is not in the strin when using indexOf,
		 * then you get -1
		 */
		System.out.println(name.indexOf('Y'));
		
		System.out.println(name.indexOf(' '));
		
		System.out.println(name.indexOf('a'));
		
		System.out.println("index of #" + name.indexOf('#'));
		
		
		/*
		 * Concatenation
		 */
		String firstName = "AC";
		String lastName = "Air Conditioner";
		
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
	}

}
