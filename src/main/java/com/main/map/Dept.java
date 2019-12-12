package com.main.map;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	private String name;
	
	public Dept(int did, String name) {
		super();
		this.did = did;
		this.name = name;
	}

	public Dept() {
		super();
		
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [did=" + getDid() + ", name=" + getName() + "]";
	}

}
