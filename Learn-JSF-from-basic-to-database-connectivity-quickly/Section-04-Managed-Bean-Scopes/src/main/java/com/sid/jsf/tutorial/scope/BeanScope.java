/**
 * 
 */
package com.sid.jsf.tutorial.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Lenovo This is a default scope. The Default scope is @RequestScoped
 *
 */
@RequestScoped
@ManagedBean
public class BeanScope implements Serializable {
	private int value;

	public BeanScope() {
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
