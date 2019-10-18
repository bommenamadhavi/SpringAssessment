package com.web.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String name;
	private String company;
	private String location;
	private String searchKey;
	public Employee(String name, String company, String location, String searchKey) {
		super();
		this.name = name;
		this.company = company;
		this.location = location;
		this.searchKey = searchKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		searchKey = searchKey;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
