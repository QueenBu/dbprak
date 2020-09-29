package uni.dbprak;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbprakApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DbprakApplication.class, args);

		//Verbindung herstellen
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();

			//etwas speichern (Test)
			Transaction trx = session.beginTransaction();
			Continent c1 = new Continent("Bianca");
			session.save(c1);

			trx.commit();

		}catch (HibernateException ex){
			System.out.println("FEHLER!!" + ex.getMessage());
		}
	}

}
