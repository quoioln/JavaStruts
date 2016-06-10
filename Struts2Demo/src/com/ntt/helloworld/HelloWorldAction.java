/**
 * 
 */
package com.ntt.helloworld;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author vpquoi
 *
 */
public class HelloWorldAction {

	private String name;
	private String age;
	private String render;
	public String execute() throws Exception {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, String> context = new HashMap<String, String>();
		context.put("key1", "key 1");
		context.put("key2", "key 2");
		System.out.println("welcome to controller");
		render = "male";
		stack.push(context);
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
