package homework2;

public class CourseManager {

	public void get()
	{
		System.out.println("T�m kurslar getirildi.");
	}
	
	public void select(Course course) {
		
		System.out.println(course.courseName +" "+ "kursu eklendi.");
	}
	
	public void drop (Course course) {
		
		System.out.println(course.courseName +" "+ "kursu ��kar�ld�.");
	}
	
}
