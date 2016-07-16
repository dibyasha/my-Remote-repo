
abstract public class Provider {
	private String name;
	private String circle;

	public static void m1(){
		System.out.println("Static method in provider");
	}
	
	
	public Provider(String name, String circle) {
		this.name = name;
		this.circle = circle;
	}
	
	public String getCircle() {
		return circle;
	}
	
	abstract public void call(long mobile);
}
