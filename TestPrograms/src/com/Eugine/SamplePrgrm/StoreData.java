package com.Eugine.SamplePrgrm;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData {

	public static void main(String[] args) {

		Session sess=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction trans=sess.beginTransaction();
		Employee e1=new Employee();
		e1.setName("Eugine");
		
		Regular_employee r1=new Regular_employee();
		r1.setName("Udhaya");
		r1.setSalary(45000);
		r1.setBonus(5);
		
		Contract_employee c1=new Contract_employee();
		c1.setName("Isabella");
		c1.setPer_hour("1000.00");
		c1.setContract_duration("150 hours");
		
		sess.persist(e1);
		sess.persist(r1);
		sess.persist(c1);
		
		trans.commit();
		sess.close();
		System.out.println("Success");
	}

}
