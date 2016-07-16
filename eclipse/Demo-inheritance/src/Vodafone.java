
public class Vodafone extends GSM {
	String vId;
	
	public Vodafone() {
		super("default", "default");
	}

	@Override
	public String getCircle() {
		// TODO Auto-generated method stub
		return null;
	}

	private void tryMethodsFromParent() {

		// super.getCircle();
		 this.call(9890098900L);
	}

	@Override
	public void call(long mobile, String type) {
		super.m1();
		Provider.m1();
	}

/*	public void call(long mobile) {
		System.out.println("You're using Vodafone calling feature");
	}
*/
	public void someGSMSpecs() {
		System.out.println("You're using Vodafone GSM feature");
	}
}
