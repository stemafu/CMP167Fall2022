
public class DoWhileExample {

	public static void main(String[] args) {
		
		int count = 1;
		
		do {
			/* the body of a do while loop
			 * is executed at least once regardless of
			 * the condition.
			 * 
			 * 
			 */
			int yz = 0;
			
			System.out.println(count);
			count = count + 1;
		}while(count < 3);

		System.out.println(yz);
	}

}
