package hibernate_crud;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchByEmail {
		
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			EntityManager em = emf.createEntityManager();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Email : ");
			String email = sc.next();
			
			Query q = em.createQuery("select e from Employee e where e.email= :emailName ");
			q.setParameter("emailName", email);
			
			//Object o =  q.getSingleResult();
			//Employee e = (Employee) o;
			
			Employee e = (Employee) q.getSingleResult(); // u can directly pas here also  q.getSingleResult() 
			
			System.out.println(e);

		}
}


