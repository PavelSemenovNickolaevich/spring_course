package hibernate_one_to_many_uni.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_one_to_many_uni.entity.Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 11, 333533333);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 6666);
//            Employee employee2 = new Employee("Andrey", "Sidorov", 77777);
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("Done");


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            System.out.println("Done");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();
          //  Employee employee = session.get(Employee.class, 2);
            Department department = session.get(Department.class, 2);

            session.delete(department);
            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
