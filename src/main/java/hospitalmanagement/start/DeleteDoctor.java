package hospitalmanagement.start;
import java.util.Scanner;
import hospitalmanagement.entity.Doctor;
import hospitalmanagement.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class DeleteDoctor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doctor d=new Doctor();
		System.out.println("enter the Doctor id");
		d.setDr_id(sc.nextInt());
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 session.delete(d);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();
	}
}