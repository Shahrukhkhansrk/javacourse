
public class Demo {

	public static void main(String[] args) {
		// Student s = new Student();
		// s.setName("Ali");
		// System.out.println(s.getName());
		// Student.counter = 0;
		// System.out.println(Student.counter);

		
		System.out.println(Student.MAX_STUDENT);
		for (int i = 1; i <= Student.MAX_STUDENT; i++) 
		{
			if (Student.getCounter() == Student.MAX_STUDENT) {
				break;
			}
			new Student();
		}//end of for
		
		System.out.println("Num of Students Admitted : " + Student.getCounter());
		
	}//end of main
}//end of class
