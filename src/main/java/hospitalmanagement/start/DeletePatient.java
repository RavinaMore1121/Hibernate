package hospitalmanagement.start;
import java.util.Scanner;
import hospitalmanagement.entity.Patient;
import hospitalmanagement.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class DeletePatient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Patient p=new Patient();
		System.out.println("enter the Patient id");
		p.setPatient_id(sc.nextInt());
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction(); 
		 session.delete(p);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();
	}
}