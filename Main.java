package homework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1=new Course(1,"Java","Engin Demiro�","5%");
		course1.courseId=1;
		course1.courseName="Java";
		course1.instructor="Engin Demiro�";
		course1.percentecomplete="5%";
		
		Course course2= new Course(2, "c#", "Engin Demiro�", "90%");
		
		course2.courseId=2;
		course2.courseName="c#";
		course2.instructor="Engin Demiro�";
		course2.percentecomplete="90%";
		
		Course[] courses= {course1,course2};
		
		for (Course co: courses) {
			System.out.println(co.courseId);
			System.out.println(co.courseName);
			System.out.println(co.instructor);
			System.out.println(co.percentecomplete);
			
		}
		
		
		User user1= new User(1, "Merve Ku�");
		User[] users= {user1};
		
		for (User u: users) {
			System.out.println(u.username);
		}
		
		
		UserManager usermanager1= new UserManager();
		usermanager1.register(user1);
		
				
		
         FAQS faqs1= new FAQS();
		faqs1.question= "Bu kamp �cretsiz mi?";
		 FAQS ans1= new FAQS();
		 ans1.answer="Evet, bu kamp �cretsiz.";
		 FAQS faqs2= new FAQS();
		 faqs2.question= "Bu kamp nerede yay�mlanacak?";
		 FAQS ans2= new FAQS();
		 ans2.answer="Canl� yay�n youtube kanal�nda yay�mlanacak.";
		  FAQS faqs3= new FAQS();
		  faqs3.question= "Yay�n tarih ve saati ile ilgili bilgiler nelerdir?";
		 FAQS ans3= new FAQS();
		 ans3.answer="Her �ar�amba ve cumartesi g�nleri 9.30 pm'de";
		 FAQS[] faqs= {faqs1,ans1,faqs2,ans2,faqs3,ans3};
		 
		 for ( FAQS faq: faqs) {
			
			 System.out.println(faq.question);
			 System.out.println(faq.answer);
			
		}
		 CourseManager coursemanager=new CourseManager();
		 coursemanager.get();
		 coursemanager.select(course1);
		 coursemanager.drop(course1);
		 
		 
		 

	}

	

}
