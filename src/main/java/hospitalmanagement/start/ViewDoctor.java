package hospitalmanagement.start;
import java.util.List;
import hospitalmanagement.entity.Doctor;
import hospitalmanagement.entity.Patient;
import hospitalmanagement.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class ViewDoctor {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		  Query <Doctor> query = session.createQuery("from doctor");
		  List <Doctor> dct = query.list();
		  System.out.println("=============================Doctor Data================");
		  
		  for(Doctor d: dct)
		  {
			  
				System.out.print(d.getDr_id());
				System.out.print("\t"+ d.getDr_name());
				System.out.print("\t"+ d.getDr_contact());
				System.out.println("\t"+ d.getDr_address()); 
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
	}

}