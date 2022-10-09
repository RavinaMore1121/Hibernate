package hospitalmanagement.start;
import java.util.List;
import hospitalmanagement.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import hospitalmanagement.entity.Patient;
import hospitalmanagement.start.CreatePatient;
public class ViewPatient {
	public static void main(String[] args) 
	 {
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Query <Patient> query = session.createQuery("from Patient");
		  List <Patient> ptnt = query.list();
		  System.out.println("---------------All Patients Data---------------");
		  for(Patient p: ptnt)
		  {
			  
			  System.out.print(p.getPatient_id());
				System.out.print("\t"+ p.getPatient_name());
				System.out.print("\t"+ p.getPatient_gender());
				System.out.println("\t"+ p.getPatient_age());
				System.out.print("\t"+ p.getPatient_bloodgroup());
				System.out.print("\t"+ p.getPatient_address());
				System.out.println("\t"+ p.getDr_id());
			 // System.out.println("Student Id:"+c.getSid()+",Student name:"+c.getSname()+",Department name:"+c.getDeptname()+", Address:"+c.getAddress()+",Marks:"+c.getMarks()+",Age:"+c.getAge());
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		  }
}