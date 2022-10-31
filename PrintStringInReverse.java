
public class PrintStringInReverse {

	/* Write a program that prints a string in
	 * reverse.
	 */
	public static void main(String[] args) {

		String name = "dad";
		// i  is similar to i = i - 1
		String reversedName = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			//System.out.print(name.charAt(i));
			reversedName = reversedName + name.charAt(i);
		}
		System.out.println(reversedName);

	}

}
