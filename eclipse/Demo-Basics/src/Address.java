
public class Address {
	private String streetName,city;
	private int pinCode;
	
	public void accept(String ct,String st,int code){
		city = ct;
		streetName = st;
		pinCode = code;
	}
	
	public void display(){
		System.out.print("\nCity: "+ city);
		System.out.print("\tStreet Name: "+ streetName);
		System.out.println("\tPinCode: "+ pinCode);
	}
	
	
}
