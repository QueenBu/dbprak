package uni.dbprak;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DbprakApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DbprakApplication.class, args);

		//Verbindung herstellen
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();

			//etwas speichern (Test)
			/*
			Transaction trx = session.beginTransaction();
			//GeneratedValue does not work. I do not know why, probably because of a version issue with hibernate
			Continent c1 = new Continent("Tom", (long) 33);
			session.save(c1);
			trx.commit();
			 */

			//etwas laden (Test)
			List continents = session.createQuery("From Continent").list();
			for( int i=0; i<continents.size(); i++){
				Continent continent = (Continent) continents.get(i);
				System.out.println("Continent: " + continent.getName());
			}





		}catch (HibernateException ex){
			System.out.println("FEHLER!!" + ex.getMessage());
		}
	}

}
