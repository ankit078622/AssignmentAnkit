package hibernateutilpackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//sesion factory

public class Hibernateutil {
	static SessionFactory sessionFactory;
	static Session session;
	public static SessionFactory buildSessionFactory() {
		Configuration configurationobj=new Configuration();
		configurationobj.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistryobj=new StandardServiceRegistryBuilder().applySettings(configurationobj.getProperties()).build();
		sessionFactory=configurationobj.buildSessionFactory(serviceRegistryobj);
		return sessionFactory;
	}
	
}
