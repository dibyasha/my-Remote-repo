
public class Person {
//	DATA MEMBERS
	String name;
	int age;

	private Address address;

//	PARAMETERIZED CONSTRUCTOR
	public Person(String name, int age){
//		CHAINING CONSTRUCTOR USING 'this'
//		this();

		this.accept("Manoj", 15);
		
		this.name = name;
		this.age = age;
	}
	
//	DEFAULT CONSTRUCTOR
	
	public Person(){
//		this("Sunil",45);
		System.out.println("Person instantiated...");
		name = "NA";
		age = 18;
	}
	
//	MEMBER METHODS
	public void setAddress(Address addr){
		address = addr;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void accept(String nm, int ag){
		name = nm;
		age = ag;
	}
	
	public void display(){
		System.out.print("Name: "+ name);
		System.out.println("\tAge: "+ age);
	}
	
	public void displayDetails(){
		display();
	}
	
	
	
	
	
	
	
	
	
}
