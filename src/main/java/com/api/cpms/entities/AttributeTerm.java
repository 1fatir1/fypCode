package com.api.cpms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttributeTerm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int atId;
	private String name;
	
	public AttributeTerm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getaId() {
		return atId;
	}

	public void setaId(int aId) {
		this.atId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
