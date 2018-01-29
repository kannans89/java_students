package com.techlabs.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class AddressEntity {
	@Id
	private long id;
	private String address;

	@JoinColumn
	@ManyToOne
	private DemoEntity demoEntity;

	public DemoEntity geDemoEntity() {
		return demoEntity;

	}

	public void setDemoEntity(DemoEntity demoEntity) {
		this.demoEntity = demoEntity;
	}

	public AddressEntity(long id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public AddressEntity() {

	}

	public void setAddressEntity(DemoEntity demoEntity2) {
		// TODO Auto-generated method stub

	}

}
