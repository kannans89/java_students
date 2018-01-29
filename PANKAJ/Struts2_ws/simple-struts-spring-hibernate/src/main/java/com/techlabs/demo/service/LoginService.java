package com.techlabs.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.techlabs.demo.entity.AddressEntity;
import com.techlabs.demo.entity.DemoEntity;

@Controller
public class LoginService {
	@Autowired
	private SessionFactory sessionFactory;

	public void authenticateService() {
		System.out.println("From the login service ");
	}

	public void insert() {
		Session session = sessionFactory.openSession();
		Set<AddressEntity> addressEntities = new HashSet<AddressEntity>();
		
		AddressEntity addressEntity1 = new AddressEntity(1, "mumbai");
		AddressEntity addressEntity2 =new AddressEntity(2, "pune");
		addressEntities.add(addressEntity1);
		addressEntities.add(addressEntity2);
		
		
		DemoEntity demoEntity =new DemoEntity(100, "sanket", addressEntities);
		Transaction transaction = (Transaction) session.beginTransaction();
		for(AddressEntity addressEntity : addressEntities)
		{
			addressEntity.setAddressEntity(demoEntity);
		}
		session.save(demoEntity);
		transaction.commit();
		session.close();
		}

}
