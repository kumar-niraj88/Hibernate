package hibernate_crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MianClass {
	
	public static void main(String[] args) {
       Employee e  = new Employee();
       e.setId(2);
       e.setName("kumar");
       e.setGender("male");
       e.setEmail("kumar@gmail.com");
       e.setSal(16000);
       e.setPhone(47777045);
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
       EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
       
       
       et.begin();
       em.persist(e);
       et.commit();
       
       System.out.println("data saved");
       
	}
	 

}
