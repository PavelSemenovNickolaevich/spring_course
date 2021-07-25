package hibernate_test_2.entitiy;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_test.entity.Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            factory.close();
        }
    }
}
