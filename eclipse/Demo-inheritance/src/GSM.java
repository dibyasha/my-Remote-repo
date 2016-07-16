
public abstract class GSM extends Provider {

/*	public GSM() {
		this("Default","Default");
	}
*/	
	public GSM(String name, String circle) {
		super(name, circle);
	}

	abstract public void someGSMSpecs();

//	abstract public void call(long mobile);
	public void call(long mobile) {
		
	};
	
	
//	CONFLICTING METHOD
//	abstract public int call(long mobile);
	
	abstract public void call(long mobile,String type);
	
	abstract public String getCircle() ;
}
