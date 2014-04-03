import java.math.BigDecimal;

import newlyGenerated.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class launcher {

	public static void main(String[] args) {

		Test test = new Test(new BigDecimal(0), "rawr");

		// Mockito

		Configuration configuration = new Configuration()
				.configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder
				.build());

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(test); // This would save the object in session
		s.flush(); // SQL Query is generated
		tx.commit(); // Commits the transaction
		s.close(); // Session is closed

	}

}
