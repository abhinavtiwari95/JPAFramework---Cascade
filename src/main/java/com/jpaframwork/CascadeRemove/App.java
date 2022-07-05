package com.jpaframwork.CascadeRemove;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_Record");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employee Id: ");
//		int id = sc.nextInt();
		EmployeeStatmentRemove s=em.find(EmployeeStatmentRemove.class, 101); 
		em.remove(s);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
