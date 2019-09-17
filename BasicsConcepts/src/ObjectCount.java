
public class ObjectCount {

	public ObjectCount() {
		counter++;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static int getCounter() {

		return counter;
	}

	// Class variables
	public final static int MAX_STUDENT = 40;
	public static int counter = 0;
	// Instance Variables
	private String name;
}
