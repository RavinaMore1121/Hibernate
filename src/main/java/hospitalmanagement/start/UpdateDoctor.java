package hospitalmanagement.start;
import java.util.Scanner;
import hospitalmanagement.entity.Doctor;
import hospitalmanagement.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class UpdateDoctor {
	public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		Doctor d=new Doctor();
		System.out.println("Enter Doctor's Id");
		d.setDr_id(sc.nextInt());
		System.out.println("Enter Doctor's name");
		d.setDr_name(sc.next());
		System.out.println("Enter Doctor's Contact");
		d.setDr_contact(sc.next());
		System.out.println("Enter Doctor's Address");
		d.setDr_address(sc.next());
		//Create session factory object
				SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
				  //getting session object from session factory
				  Session session = sessionFactory.openSession();
				//getting transaction object from session object
				  session.beginTransaction();
				  session.saveOrUpdate(d);;
				  System.out.println("Updated Successfully");
				  session.getTransaction().commit();
				  session.close();
				  sessionFactory.close();
	 }
}