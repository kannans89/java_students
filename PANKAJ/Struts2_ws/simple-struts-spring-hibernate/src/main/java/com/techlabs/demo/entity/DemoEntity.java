package com.techlabs.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class DemoEntity {
	@Id
	private long id;
	private String name;
	@OneToMany(mappedBy = "demoEntity", cascade = CascadeType.ALL)
	private Set<AddressEntity> addressEntities;

	public DemoEntity(long id, String name, Set<AddressEntity> addressEntities) {
		this.id = id;
		this.name = name;
		this.addressEntities = addressEntities;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DemoEntity() {
	}

	public void addAddressEntity(AddressEntity addressEntity) {
		addressEntities.add(addressEntity);
	}
}
