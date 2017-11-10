package com.deepak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author deepak
 *
 */

@Entity
@Table(name = "Student_Record")
public class Student {

	@Id
	@Column(name = "std_id")
	private int id;
	@Column(name = "std_Name")
	private String name;
	@Column(name = "std_City")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "ID :: " + id + " , Name :: " + name + " , City :: " + city;
	}
}
