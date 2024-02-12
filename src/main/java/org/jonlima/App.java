package org.jonlima;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionFactory;

//import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure.buildSessionFactory();
    }
}
