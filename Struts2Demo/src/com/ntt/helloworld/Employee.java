/**
 * 
 */
package com.ntt.helloworld;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author vpquoi
 *
 */
public class Employee extends ActionSupport{
	private String name;
	private int age;
	
	public String execute() throws Exception{
		System.out.println("in execute method");
		return SUCCESS;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public final int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public final void setAge(int age) {
		this.age = age;
	}
	
	public void validate() {
		if (name == null || name.trim().equals("")) {
			addFieldError("name", "The name is required");
		}
		if (age < 28 || age > 65) {
			addFieldError("age", "Age must be in between 28 and 65");
		}
	}
}
