package com.jpaframwork.Cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_Record");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        //Cascade Persist
        
        /*
        EmployeeStatment empstsmt = new EmployeeStatment();
        empstsmt.setE_salary(25000);
        
        EmployeeStatment empstsmt1 = new EmployeeStatment();
        empstsmt1.setE_salary(28000);
        
        EmployeeDetails empdetails = new EmployeeDetails();
        empdetails.setE_id(101);
        empdetails.setE_name("Amit");
        empdetails.setE_city("Pune");
        empdetails.setE_email("amit.kr@gmail.com");
        empdetails.setEmpstmt(empstsmt);
        
        EmployeeDetails empdetails1 = new EmployeeDetails();
        empdetails1.setE_id(102);
        empdetails1.setE_name("Aniket");
        empdetails1.setE_city("Osmanabad");
        empdetails1.setE_email("aniket.kr@gmail.com");
        empdetails1.setEmpstmt(empstsmt1);
   
        empstsmt.setE_id(empdetails.getE_id());
     
        empstsmt1.setE_id(empdetails1.getE_id());
       

        em.persist(empdetails);
        em.persist(empdetails1);
        em.persist(empstsmt);
        em.persist(empstsmt1);
        
       
		*/
        
        // Cascade Remove
        
//        EmployeeDetails s=em.find(EmployeeDetails.class, 101);
//        em.remove(s);
        
        //Cascade Refresh 
        
        EmployeeDetails s=em.find(EmployeeDetails.class, 102);
        s.setE_city("Pune Katraj");
        em.refresh(s);
        //em.persist(s);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
