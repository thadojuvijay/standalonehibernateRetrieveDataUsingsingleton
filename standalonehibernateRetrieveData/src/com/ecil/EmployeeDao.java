package com.ecil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;


public class EmployeeDao

{
public static void main(String[] args) {
	

{
	
	Session session = HibernateUtility.getSession();
	session.beginTransaction();
Query<Employee> query = session.createQuery("from com.ecil.Employee");
List<Employee> list = query.getResultList();



for (Employee employee2 : list) 
{
System.out.println(employee2.getEno());
System.out.println(employee2.getName());
System.out.println(employee2.getSalary());
}

	
	session.getTransaction().commit();
	session.close();
	
}
}
}