
public class Entry3 {
	public static void main(String[] args) {
		Address myAddress = new Address();
		myAddress.accept("PUNE", "Talawade Road", 410000);
		
		Person person = new Person();
		person.accept("Ajay", 45);
		
		person.setAddress(myAddress);
		
		person.getAddress().display();
		
//		myAddress.display();
	}
}

