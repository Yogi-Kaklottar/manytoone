package com.main.operation;
import  com.main.map.Dept;
import  com.main.map.Emp;
import javax.persistence.*;
public class ManyToOne {

	public static void main(String[] args)
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em=emf.createEntityManager();
		
		//DepartMent sales
		Dept d1=new Dept();
		d1.setName("sales");
		
		//department hr
		//Dept d2=new Dept();
		//d2.setName("hr");
		Emp  e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		Emp e4=new Emp();
	    //Employee data 1
		  e1.setEname("vishal");
		  e1.setDeg("manager");
		 e1.setSalary(15000);
		 e1.setDept(d1);
		 
		//Employee Data 2
		  e2.setEname("bhargav");
		  e2.setDeg("employee");
		 e2.setSalary(10000);
		 e2.setDept(d1);
		 
		//Employee data 3
		  e3.setEname("rajesh");
		  e3.setDeg("management");
		 e3.setSalary(13000);
		 e3.setDept(d1);
		 
	    //Employee Data 4
		  e4.setEname("bhavesg");
		  e4.setDeg("employee");
		 e4.setSalary(9000);
		 e4.setDept(d1);
		 
		 //Transaction begin
		 em.getTransaction().begin();
		 em.persist(e1);
		 em.persist(e2);
		 em.persist(e3);
		 em.persist(e4);
		 
		  //Transaction close
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
	}
	 
}
