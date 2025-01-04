package hibernate_crud;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner("System.in");
		int id = sc.nextInt();
		
		Employee e = em.find(Employee.class,id );
		
		if(e!=null) {
			System.out.println(e);
		}
		else {
			System.out.println("Id not found");
		}
	}

}
