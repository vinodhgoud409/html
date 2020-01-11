package com.app.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Brand;
import com.app.model.Product;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getSf().openSession()){
			tx=ses.beginTransaction();
			Brand b=new Brand();
			b.setBrnId(90);
			b.setBrnCode("vishnu");
			b.setBrnInfo("LIER");

			Product p1=new Product();
			p1.setProdId(99);
			p1.setProdCode("vinodh");
			p1.setProdCost(99.9);
			p1.setBob(b);

			Product p2=new Product();
			p2.setProdId(97);
			p2.setProdCode("vinodh");
			p2.setProdCost(99.9);
			p2.setBob(b);
			Product p3=new Product();
			p3.setProdId(98);
			p3.setProdCode("vinodh");
			p3.setProdCost(99.9);
			p3.setBob(b);
			ses.save(b);
			ses.save(p1);
			ses.save(p2);
			ses.save(p3);
			tx.commit();
			System.out.println("done");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("done");

		}



	}

}
