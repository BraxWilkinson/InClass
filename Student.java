
public class Student extends Person implements comparable<Student>{
	
	private static final int INITIAL_RATING = 5;
	
	private String className;
	private Integer rating;
	
	public Student() throws NameException {
		super();
		rating = 5;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return 0;
	}

}
