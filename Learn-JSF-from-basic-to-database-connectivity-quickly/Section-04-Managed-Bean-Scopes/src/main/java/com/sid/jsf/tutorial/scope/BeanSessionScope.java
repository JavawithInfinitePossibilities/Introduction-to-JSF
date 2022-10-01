/**
 * 
 */
package com.sid.jsf.tutorial.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Lenovo
 *
 */
@ManagedBean
@SessionScoped
public class BeanSessionScope implements Serializable {
	private int value;

	public BeanSessionScope() {
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
