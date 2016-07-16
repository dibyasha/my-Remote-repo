
public class Student extends Person{
	int rollNo;
	String collegeName;
	
	public Student() {
//		CHAINING CONSTRUCTOR USING 'super'
		super(null,0);
//		super();
		System.out.println("Student instantiated...");
	}
	
	public void displayDetails(){
		super.displayDetails();
//		System.out.println("DO NOTHING");
		System.out.print("Roll No"+ rollNo);
		System.out.println("\tCollege Name"+ collegeName);
	}
	
	
	
}
