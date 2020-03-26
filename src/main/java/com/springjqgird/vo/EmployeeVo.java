package com.springjqgird.vo;

import java.util.Date;

public class EmployeeVo {
	   private String user_id;
	   private String user_name;
	   private float user_salary;
	   private Date user_join;
	   private String user_phone;
	   private String user_address;
	   public EmployeeVo() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param user_id
	 * @param user_name
	 * @param user_salary
	 * @param user_join
	 * @param user_phone
	 * @param user_address
	 */
	public EmployeeVo(String user_id, String user_name, float user_salary, Date user_join, String user_phone,
			String user_address) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_salary = user_salary;
		this.user_join = user_join;
		this.user_phone = user_phone;
		this.user_address = user_address;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public float getUser_salary() {
		return user_salary;
	}
	public void setUser_salary(float user_salary) {
		this.user_salary = user_salary;
	}
	public Date getUser_join() {
		return user_join;
	}
	public void setUser_join(Date user_join) {
		this.user_join = user_join;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	} 
	   
}
