/*class demonstrating the use and need of static variables*/
public class ObjectCount {

	// public constructor
	public ObjectCount() {
		counter++;
	}

	// setter and getter for name
	public void setName(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static int getCounter() {

		return counter;
	}

	//overriding the toString method of the Object class
	public String toString() {
		return "name : " + name;
	}

	// Class variables
	public final static int MAX_STUDENT = 40;
	public static int counter = 0;
	// Instance Variables
	private String name;
}
