package com.api.cpms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Attribute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<AttributeTerm> atList;
	
	public Attribute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AttributeTerm> getAtList() {
		return atList;
	}

	public void setAtList(List<AttributeTerm> atList) {
		this.atList = atList;
	}
}
