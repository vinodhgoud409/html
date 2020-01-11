package com.app.test;

import org.hibernate.Session;
//import org.hibernate.cfg.Configuration;

import cmo.app.model.Customer;
import cmo.app.util.HibernateUtil;

public class Test { 
	public static void main(String[] args) {
		
		org.hibernate.Transaction tx=null;
		try(Session ses=HibernateUtil.getSf().openSession()){
			tx=ses.beginTransaction();
			Customer cs=new Customer();
		    cs.setCusId(9);
		    cs.setCustCode("ghana");
		    cs.setCustPoints(90.9);
		    cs.setTotalRewards(90);
		    cs.setRedmeeRwds(99);
		    cs.setCibilscor(96);
		   ses.save(cs);
		    tx.commit();
		}catch(Exception e) {
		tx.rollback();
			e.printStackTrace();
			System.out.println("done");
		}


	}

}
