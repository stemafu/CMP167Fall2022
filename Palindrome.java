
public class Palindrome {

	public static void main(String[] args) {


		String name = "dads";
		// i  is similar to i = i - 1
		String reversedName = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			//System.out.print(name.charAt(i));
			reversedName = reversedName + name.charAt(i);
		}
		//System.out.println(reversedName);
		
		if(name.equalsIgnoreCase(reversedName)) {
			System.out.println("\"" + name + "\" is a palindrome");
		}else {
			System.out.println("\"" + name + "\" is not a palindrome");
		}

	}

}
