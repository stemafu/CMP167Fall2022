
/* A class is a blueprint for creating objects.
 * A class contains variables (fields) and methods.
 * 
 * Variables
 * 
 * 123-45-5679
 */
public class Person {
	
	/*
	 * Below are the characteristics 
	 * of a person
	 */
	private int age;
	private String eyeColor;
	private double height;
	private String name;
	private String gender;
	private String ssn;
	
	/* We are observing that the above variable
	 * are created inside a class but outside of any 
	 * method and also they do not have the keyword 
	 * static in them.
	 * These are not local variables. These are called
	 * instance variables.
	 * 
	 * Recall that classes are used to create objects. 
	 * An object is an instance of a class.
	 * 
	 * Instance variables belong to individual objects
	 * that are created out a class.
	 */
	
	
	/* The main reason for creating instance methods
	 * is to access or manipulate instance variables.
	 * 
	 * Now because instance variables do not have the
	 * keyword static, the instance methods also do not
	 * have the keyword static in their definitions.
	 */
	
	
	
	/* Constructors
	 * A constructor is a special method that does not have
	 * any return type at all (including void) and does not 
	 * return a value.
	 * 
	 * A constructor has the same name as the class.
	 * 
	 * Constructors are used to create objects. During this
	 * creation, we initialize our member variables with some
	 * values.
	 * 
	 * In Java, we have two types of constructors.
	 * 
	 * 1. a default constructor (no parameter constructor).
	 *    This one is a constructor without any parameters
	 * 2. Parameterized constructor
	 *    This one has parameters.
	 *    
	 *  In you do not create any constructor at all, Java creates
	 *  a default constructor for you. Of course, you can be able
	 *  to overwrite this by creating your own nice constructor.
	 */
	
	/*
	 * Now we create a default constructor
	 */
	
	/* We now know that we can be able to define multiple
	 * constructors. They need to have different parameters
	 * to separate them.
	 * Constructor overloading is the concept of defining
	 * multiple constructors (with the same name) but different
	 * parameters.
	 */
	public Person() {
		name = "I don't know your name yet";
		age = 0;
		eyeColor = "NA";
		ssn ="NA";
		height = 0.0;
		gender = "NA";
	}
	
	public Person(int age) {
		name = "I don't know your name yet";
		this.age = age;
		eyeColor = "NA";
		ssn ="NA";
		height = 0.0;
		gender = "NA";	
	}
	
	/* Let us create (define) a constructor that takes two
	 * parameters age and height.
	 * The rest of the string instance variables should 
	 * assigned NA as a value
	 */
	public Person(int age, double newHeight) {
		/* We are using this. in front of age
		 * because the instance variable age and the 
		 * parameter age have the same name.
		 */
		this.age = age;
		
		height = newHeight;
		name = "NA";
		eyeColor = "NA";
		ssn = "NA";
		gender = "NA";
	}
	
	public Person(String newName, int newAge, String
			newEyeColor, double newHeight, String newGender) {
		name = newName;
		age = newAge;
		eyeColor = newEyeColor;
		height = newHeight;
		gender = newGender;
	}
	
	public Person(String newName, int newAge, String
			newEyeColor, double newHeight, String newGender,
			String newSSN) {
		name = newName;
		age = newAge;
		eyeColor = newEyeColor;
		height = newHeight;
		gender = newGender;
		ssn = newSSN;
	}	
	
	/* We can use the this keyword for the following reasons:
	 * 1. to call an instance method that is within 
	 * the same class as that instance method.
	 * this.instanceMethodName();
	 */
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + this.getAge());
		System.out.println("Eye color: " + this.getEyeColor());
		System.out.println("Height: " + this.getHeight());
		System.out.println("SSN: " + this.getSSN());
	}

	
	/* Setters (mutators) are used to change a value
	 * for an instance variable.
	 * Setters take parameter(s) representing a placeholder
	 * for the value to assign to the intended instance
	 * variables.
	 * 
	 * Setters do not return values. This means their return 
	 * data type is void.
	 */
	
	
	/* Using this makes clear that a class member is 
	 * being accessed and is essential if a field member 
	 * and parameter have the same identifier (name).
	 * 
	 *In the example below our parameter and instance 
	 *have the same name called name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Let us now create a setter for age.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double hight) {
		this.height = height;
	}
	
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public void setGender(String gender) {
		 this.gender = gender;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/* We now need to add the getters
	 * 
	 * Getters are used to view a value that is
	 * inside some variable. This means we use getters
	 * to get a value from some variable.
	 * 
	 * usually getters return some value.The return data type
	 * is determined by the data type of the value to be returned.
	 * 
	 * The names of getters usually start with get, followed by the
	 * name of the variable use want to get the value from.
	 * 
	 * Normally getters to not take any parameters.
	 */
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	/* We will now add the equal to method that we can use
	 * to compare two objects.
	 * 
	 * We will finish this method on Monday
	 */
	public boolean equals(Person otherPerson) {
		
		/* It is important to do a null check
		 * on the parameter;
		 */
		if(otherPerson == null)
			return false;
		
		/* if they have the same address, we return true
		 * 
		 */
		if (this == otherPerson)
			return true;
		
		/* it is important to start your comparison
		 * with your variables for numbers
		 */
		if(this.age != otherPerson.age)
			return false;
		
		if(this.height != otherPerson.height)
			return false;
		
		if (!this.name.equals(otherPerson.name))
			return false;
		
		if(!this.ssn.equals(otherPerson.ssn))
			return false;
		
		if(!this.eyeColor.equals(otherPerson.eyeColor))
			return false;
		
		if(!this.gender.equals(otherPerson.gender))
			return false;
		
		return true;
	}
	
	public static void main(String [] args) {
		/* 
		 * We will create some object
		 * 
		 * Syntax for creating objects is:
		 * Classname objectName = new ClassName(arguments);
		 */
		Person person1 = new Person();
		// Let us assign person1 a name
		person1.name = "Obama";
		person1.height = 6.3;
		person1.gender = "Male";
		
		Person p2 = new Person();
		// Let us assign p2 a name
		p2.name = "De Blasio";
		p2.height = 100;
		p2.age = -40;
		
		/*
		 * To access a value inside an instance variable
		 * of an object, we use the following syntax:
		 * objectName.instanceVariableName
		 */
		
		//System.out.println("Name: " + person1.name + 
		//		" Height: " + person1.height);
		//System.out.println("Name: " + p2.name + 
		//		", Height: " + p2.height + ", Age: " + p2.age);
		
		
		/* Now how do you call an instance method?
		 * objectName.methodName(arguments);
		 */
		p2.display();
		person1.display();
	}
}
