
public class SuperMarketQueue {

	private Person [] persons;
	private static int numPeople;
	
	private String name;
	
	public SuperMarketQueue() {
		persons = new Person[5];
		numPeople = 0;
		name = "";
	}
	
	public SuperMarketQueue(int size, int numPeople, String name) {
		persons = new Person[size];
		this.numPeople = numPeople;
		this.name = name;
	}
	
	public SuperMarketQueue(int size, String name) {
		persons = new Person[size];
		this.numPeople = 0;
		this.name = name;
	}	
	
	public void addPerson(Person p) {
		/* 
		 * The addition done here
		 */
		
		persons[numPeople] = p;
		numPeople++;
	}
	
	public void addPeople(Person [] people) {
		
		for(int i = 0; (i < people.length) && (numPeople < persons.length); i++) {
			
			/* we have to check the array to see if it is 
			 * full so that we can expand it before addd
			 */
			addPerson(people[i]);
		}
		
		//persons[numPeople] = p;
		//numPeople++;
	}
		
	
	public static int getNumPeople() {
		return numPeople;
	}
	
	public void printQueue() {
		for(int i = 0; i < numPeople; i++) {
			persons[i].display();
		}
	}
	
	public Person removePersonFromQueue() {
		
		Person removedPerson = persons[0];
		
		// Now we have to shift the values in the array
		
		for(int i = 0; ((i <numPeople) && (i < persons.length)); i++) {
			
			persons[i] = persons[i + 1];
		}
		
		numPeople--;
		return removedPerson;
	}
	
	public static void main(String[] args) {


		SuperMarketQueue queue = new SuperMarketQueue();
		
		Person p1 = new Person("Javier", 18,"Brown", 6.6, "Male");
		
		Person p2 = new Person("Mehdi", 19,"Brown", 6.7, "Male");
		
		queue.addPerson(p1);
		queue.addPerson(p2);
		
		//System.out.println(SuperMarketQueue.getNumPeople());
		
		queue.printQueue();
		
		//queue.removePersonFromQueue();
		
		//queue.printQueue();
		
		Person myQ [] = new Person[5];
		
		Person p3 = new Person("Preston", 20,"Brown", 6.8, "Male");
		Person p4 = new Person("Luis", 21,"Brown", 6.9, "Male");
		Person p5 = new Person("DrinkWateer", 25,"Blue", 6.0, "Female");
		Person p6 = new Person("messi", 24,"Blue", 6.0, "Male");
		Person p7 = new Person("Emilia", 22,"Blue", 6.0, "Female");
		myQ[0] = p3;
		myQ[1] = p4;
		myQ[2] = p5;
		myQ[3] = p6;
		myQ[4] = p7;

		queue.addPeople(myQ);
	}

}
