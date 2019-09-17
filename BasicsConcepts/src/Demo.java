
public class Demo {

	public static void main(String[] args) {

		System.out.println(ObjectCount.MAX_STUDENT);
		for (int i = 1; i <= ObjectCount.MAX_STUDENT; i++) {
			if (ObjectCount.getCounter() == ObjectCount.MAX_STUDENT) {
				break;
			}
			new ObjectCount();
		} // end of for

		System.out.println("Num of Students Admitted : " + ObjectCount.getCounter());

	}// end of main
}// end of class
