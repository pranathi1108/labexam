package com.klef.jfsd.exam;



	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class ClientDemo {
	    public static void main(String[] args) {
	        Configuration configuration = new Configuration().configure();
	        SessionFactory sessionFactory = configuration.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        Customer customer1 = new Customer();
	        customer1.setName("Alice");
	        customer1.setEmail("alice@example.com");
	        customer1.setAge(25);
	        customer1.setLocation("New York");

	        Customer customer2 = new Customer();
	        customer2.setName("Bob");
	        customer2.setEmail("bob@example.com");
	        customer2.setAge(30);
	        customer2.setLocation("California");

	        session.save(customer1);
	        session.save(customer2);

	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	    }
	}
