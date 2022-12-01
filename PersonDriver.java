
public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * `
		 */
		
		
		Person p5 = new Person();
		Person p7 = new Person();
		Person newPerson;
		
		//p5.name = "Messi";
		p5.setName("Eli Manning");
		p5.setAge(39);
		p5.setEyeColor("Blue");
		p5.setHeight(6.7);
		p5.setSSN("123-45-6789");
		
		newPerson = p5;
		
		//newPerson.display();
		System.out.println(p5);
		System.out.println(newPerson);
		//System.out.println(p5.getName());
		
		p7.setName("Beyonce");
		p7.setAge(34);
		p7.setHeight(5.8);
		p7.setEyeColor("Brown");/**/
		//p7.display();
		
		Person p8 = new Person("H. Lehman", 78, "Blue", 6.5, "Male");

	}

}
