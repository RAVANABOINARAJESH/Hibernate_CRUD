package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private double sal;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getSal() {
//		return sal;
//	}
//
//	public void setSal(double sal) {
//		this.sal = sal;
//	}

}
