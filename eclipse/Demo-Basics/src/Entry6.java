
public class Entry6 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p = (Person)new Student();		// IMPLICIT UP-CASTING
		
		System.out.println(p.name);
		System.out.println(p.age);
		
//		System.out.println(p.rollNo);
		
//		p = new Person();
		
//		Student s = (Student)p;			// EXPLICIT DOWN-CASTING
		
		p.displayDetails();
		
		
//		displayStudentDetails((Student)p);
	}
	
	static public void displayStudentDetails(Student s){
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rollNo);
		System.out.println(s.collegeName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
