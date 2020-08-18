package com.aydan.spring.springcore.lc.xmlconfig;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter inside");
		this.id = id;
	}
	public void hi()
	{
		System.out.println("Hi inside");
	}
	public void bye() {
		System.out.println("Bye inside");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
