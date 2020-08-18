package com.aydan.spring.springcore.reftypes;

public class Scores {
	
	private Double maths;	
	private Double physics;
	private Double chems;
	
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getChems() {
		return chems;
	}
	public void setChems(Double chems) {
		this.chems = chems;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chems=" + chems + "]";
	}
	
}
