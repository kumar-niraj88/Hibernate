package hibernate_crud;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		
		Employee e = em.find(Employee.class, sc.nextInt());
		
		if(e!= null) {
			
			System.out.println("Enter the Phone Number: ");
			e.setPhone(sc.nextLong());
			
			et.begin();
			em.merge(e);
			et.commit();
			
			System.out.println("Data Updated");
		}else {
			System.out.println("Id not found");
		}
	}

}
