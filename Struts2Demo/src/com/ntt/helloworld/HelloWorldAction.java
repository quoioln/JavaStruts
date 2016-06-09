/**
 * 
 */
package com.ntt.helloworld;

/**
 * @author vpquoi
 *
 */
public class HelloWorldAction {

	private String name;
	private String age;
	private String render;
	public String execute() throws Exception {
		System.out.println("welcome to controller");
		render = "male";
		return "success";
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
	public final String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public final void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the render
	 */
	public final String getRender() {
		return render;
	}

	/**
	 * @param render the render to set
	 */
	public final void setRender(String render) {
		this.render = render;
	}

	
}
