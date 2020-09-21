package uni.dbprak;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbprakApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DbprakApplication.class, args);
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
		}catch (HibernateException ex){
			System.out.println("FEHLER!!");
		}

	}

}
