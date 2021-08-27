package School;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println("Public : "+s.rollNo);
		//System.out.println("Private : "+s.admissionNO);
		System.out.println("Protected : "+s.age);
		System.out.println("Default : "+s.courseId);
		s.doPublic();
		s.doProtected();
		s.doDefault();
		//s.doPrivate();
	}

}
