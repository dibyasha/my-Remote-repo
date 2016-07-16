
public class Entry2 {
	public static void main(String[] args) {
		Person p, p2,p3;		// local reference variables
		
		
		p = new Person();
		p.display();
		
		p.accept("Vijay", 45);
		p.display();
		
		p2 = p;
		System.out.println((p2 == p));
		
		p3 = new Person();
		p3.display();
		System.out.println((p3 == p));
		
		
	}
}
