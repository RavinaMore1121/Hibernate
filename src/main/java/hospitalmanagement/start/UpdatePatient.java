package hospitalmanagement.start;
import java.util.Scanner;
import hospitalmanagement.entity.Patient;
import hospitalmanagement.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class UpdatePatient {
	public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		Patient p=new Patient();
		System.out.println("enter the Patient id");
		p.setPatient_id(sc.nextInt());
		System.out.println("enter the Patient name");
		p.setPatient_name(sc.next());
		System.out.println("enter the Patient's Gender");
		p.setPatient_gender(sc.next());
		System.out.println("enter the Patient age");
		p.setPatient_age(sc.nextInt());
		System.out.println("enter the Patient bloodgroup");
		p.setPatient_bloodgroup(sc.next());
		System.out.println("enter the Patient address");
		p.setPatient_address(sc.next());
		System.out.println("Enter Doctor's Id");
		p.setDr_id(sc.nextInt());
			
		//Create session factory object
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  
		//getting transaction object from session object
		  session.beginTransaction();
		  
		  session.saveOrUpdate(p);;
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	 }
	
}