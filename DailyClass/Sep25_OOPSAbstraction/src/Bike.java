
public abstract class Bike {
	String brand;
	String version;
	
	Bike(String brand,String version){
		this.brand = brand;
		this.version = version;
	}
	
	void moveForward() {
		System.out.println("Moving Forward");		
	}
	
	abstract void defaultHeadlighton();

}
