import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BusinessRule;

public class Launcher {
	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory(){
		if (factory == null){
			try {
				factory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable ex) {
				System.err.println("Failed to create sessionFactory object." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		return factory;
	}
	
	@Transactional
	public static void main(String[] args) {

		ArrayList<String> rhsValues = new ArrayList<String>();
		rhsValues.add("18");
		BusinessRule br = new BusinessRule("bla_bla_bla_01", "person.age must be equal to 18", "person.age", "must be equal to", rhsValues, "Attribute compare rule", "some generated code here");
	
		
		
//		BackEndRuleType persistable = new BackEndRuleType("");

		// Mockito


		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		Session session = factory.openSession();	
		Transaction tx = null;
		try{
			
			tx = session.beginTransaction();
			Application app = (Application) session.get(Application.class, 1);
			
			app.getBusinessRules().add(br);
			session.update(app);
			session.flush(); // SQL Query is generated
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
//		Configuration configuration = new Configuration()
//				.configure("hibernate.cfg.xml");
//		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties());
//		SessionFactory factory = configuration.buildSessionFactory(builder
//				.build());
//		Session s = factory.openSession();
//		Transaction tx = s.beginTransaction();
//
//		s.save(persistable); // This would save the object in session
//		s.flush(); // SQL Query is generated
//		tx.commit(); // Commits the transaction
//		s.close(); // Session is closed
	}
	
//	/* Method to list all the employees detail */
//	public void listEmployees( ){
//		Session session = factory.openSession();
//		Transaction tx = null;
//	
//		try{
//			tx = session.beginTransaction();
//			List employees = session.createQuery("FROM Employee").list();
//			for (Iterator iterator = employees.iterator(); iterator.hasNext();){
//				Employee employee = (Employee) iterator.next();
//				System.out.print("First Name: " + employee.getFirstName());
//				System.out.print(" Last Name: " + employee.getLastName());
//				System.out.println(" Salary: " + employee.getSalary());
//				Address add = employee.getAddress();
//				System.out.println("Address ");
//				System.out.println("\tStreet: " + add.getStreet());
//				System.out.println("\tCity: " + add.getCity());
//				System.out.println("\tState: " + add.getState());
//				System.out.println("\tZipcode: " + add.getZipcode());
//			}
//			tx.commit();
//		}catch (HibernateException e) {
//		if (tx!=null) tx.rollback();
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//	}
}
