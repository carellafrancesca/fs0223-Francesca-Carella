package com.esercizio1;

public class Customer {

	public long id;
	public String name;
	public Integer tier;
	
	public Customer(long id, String name, Integer tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getTier() {
		return tier;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}

	
	
}
