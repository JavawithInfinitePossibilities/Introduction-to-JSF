/**
 * 
 */
package com.sid.jsf.tutorial.scope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * @author Lenovo
 *
 */
@ManagedBean
@ApplicationScoped
public class BeanApplicationScope {
	private int value;

	public BeanApplicationScope() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		System.out.println("Setting the value");
		this.value = 1;
	}

	public void incrementValue() {
		this.value = this.value + 1;
	}
}
