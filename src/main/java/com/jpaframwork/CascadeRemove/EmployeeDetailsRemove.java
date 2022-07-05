package com.jpaframwork.CascadeRemove;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPREMOVE")
public class EmployeeDetailsRemove {
	@Id
	private int e_id;
	private String e_name;
	private String e_city;
	private String e_email;
	
	 @OneToOne(cascade=CascadeType.PERSIST) 
		private EmployeeStatmentRemove emplstatrem;

	public EmployeeStatmentRemove getEmplstatrem() {
		return emplstatrem;
	}

	public void setEmplstatrem(EmployeeStatmentRemove emplstatrem) {
		this.emplstatrem = emplstatrem;
	}

	public EmployeeDetailsRemove(String e_name, String e_city, String e_email) {
		this.e_name = e_name;
		this.e_city = e_city;
		this.e_email = e_email;
	}
	
	public EmployeeDetailsRemove() {
		
	}
	

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_city() {
		return e_city;
	}
	public void setE_city(String e_city) {
		this.e_city = e_city;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	
	
}
