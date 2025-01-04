package hibernate_crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e");
		
		 List<Employee> l=q.getResultList();
		 
		 for(Employee e : l ) {
			 System.out.println(e);
		 }
	}

}
