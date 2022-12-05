
public class SuperMarketQueue {

	private Person [] persons;
	private static int numPeople;
	
	private String name;
	
	public SuperMarketQueue() {
		persons = new Person[10];
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
