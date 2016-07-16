
public class Entry {
	public static void main(String[] args) {
		
		Provider.m1();
		Provider pvr;
		GSM gsm;
//		pvr = new Provider();
		
		pvr = new Vodafone();
		
		System.out.println(pvr.getCircle());;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		
		pvr.call(9890098900L);
		
//		pvr.vId;
	}
}
