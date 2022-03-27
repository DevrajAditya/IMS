package learn.com.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	    	
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(song.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session=sessionFactory.openSession();
    	
       song s1=new song();
       s1.setId(1);
       s1.setSongName("kabhi jo badal barshy");
       s1.setArtist("kishroe kumar");
       
       session.beginTransaction();
       session.save(s1);
       session.getTransaction().commit();
       System.out.println("Object save checked Db...");
    
    }
}
