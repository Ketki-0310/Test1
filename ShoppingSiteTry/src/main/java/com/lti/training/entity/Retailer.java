package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.lti.training.entity.enums.Category;

@Entity
public class Retailer {
	
@Id
@GeneratedValue
	private int id;
	private String Name;
	private Category Category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Retailer() {
		super();
	}
	public Retailer(int id, String name, String category) {
		super();
		this.id = id;
		Name = name;
		Category = category;
	}
	
	
}
