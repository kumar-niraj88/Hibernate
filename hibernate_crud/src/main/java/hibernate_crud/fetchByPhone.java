package hibernate_crud;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchByPhone {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone number: ");
		long phone = input.nextLong();
		
		
		Query q = em.createQuery("select e from Employee e where e.phone=?1 ");
		q.setParameter(1, phone);
		
		Employee e = (Employee) q.getSingleResult();
		
		System.out.println(e);
		
		
	}

}
