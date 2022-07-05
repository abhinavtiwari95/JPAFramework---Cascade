package com.jpaframwork.Cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMPSTMT")
public class EmployeeStatment {
	@Id
	private int e_id;
	private int e_salary;

	public EmployeeStatment(int e_id, int e_salary) {
		this.e_id = e_id;
		this.e_salary = e_salary;
	}
	
	public EmployeeStatment() {
	
	}

	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	
	

}