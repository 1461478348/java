package com.thzm.eye025.bean;

public class Professor {
	
	private String name;
	private String phtot;
	private String summary;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhtot() {
		return phtot;
	}
	public void setPhtot(String phtot) {
		this.phtot = phtot;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Professor(String name, String phtot, String summary, int id) {
		super();
		this.name = name;
		this.phtot = phtot;
		this.summary = summary;
		this.id = id;
	}
	public Professor() {
		super();
	}
	@Override
	public String toString() {
		return "Professor [name=" + name + ", phtot=" + phtot + ", summary=" + summary + ", id=" + id + "]";
	}
	
	

}
