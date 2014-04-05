import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BackEndRuleType;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BusinessRule;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BackEndRuleTypeDAO;

public class Launcher {
	
	public static void main(String[] args) {
//		3602 ERROR SchemaUpdate - HHH000388: Unsuccessful: alter table THO7_2013_2A_TEAM4.BRG_GENERATED_CODE add constraint FK_2xluaiv9br64gpiuoqyf6s1r5 foreign key (BUSSINESSRULE_ID) references THO7_2013_2A_TEAM4.BRG_BUSINESSRULE
//		3603 ERROR SchemaUpdate - ORA-02298: Kan (THO7_2013_2A_TEAM4.FK_2XLUAIV9BR64GPIUOQYF6S1R5) niet valideren - bovenliggende sleutels zijn niet gevonden.
//
//		3699 ERROR SchemaUpdate       - HHH000388: Unsuccessful: alter table THO7_2013_2A_TEAM4.BRG_VALUE add constraint FK_5llnfy2yffbi6vrmxvd13ea5x foreign key (BUSINESSRULE_ID) references THO7_2013_2A_TEAM4.BRG_BUSINESSRULE
//		3699 ERROR SchemaUpdate       - ORA-02298: Kan (THO7_2013_2A_TEAM4.FK_5LLNFY2YFFBI6VRMXVD13EA5X) niet valideren - bovenliggende sleutels zijn niet gevonden.
		
		SessionFactory sf = HibernateUtil.configureSessionFactory(); 
				
		sf.getCurrentSession().beginTransaction();  
		
		BackEndRuleType bert;
		bert = new BackEndRuleTypeDAO().retrieveTypeByName("Compare Rule");
        
		System.out.println("FOUND: " + bert);

         // Commit and cleanup  
         System.out.println("HIBERNATESESSIONFILTER::TEST");
         
         // sf.getCurrentSession().getTransaction().commit();
         sf.getCurrentSession().close();
		
		
		
		
	}
}
