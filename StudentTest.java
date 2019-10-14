
public class StudentTest {
	
	private static final int INITIAL_RATING = 5;

	@Before
	public void setUP() throws Exception {
		
	}
	
	@Test
	public void testStudent() {
		Student s;
		try {
			Student s = new Student();
		
			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING
			
			assertEquals(expected,rating);
		} catch (NameException e) {
			fail();
		}
	}
	
	@Test
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("x","y",2);
		Student secondStudent = new Student("x","y",3);
		
		int actual = secondStudent.compareTo(firstStudent);
		int expected = 1;
		
		assertEquals(expected, actual);
		
		Student student = new Student("x","y",5);
		
		expected = -1;
		actual = secondStudent.compareTo(firstStudent);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}
}
