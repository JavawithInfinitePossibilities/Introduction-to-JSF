/**
 * 
 */
package com.sid.jsf.tutorial;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.sid.jsf.tutorial.scope.BeanApplicationScope;
import com.sid.jsf.tutorial.scope.BeanScope;
import com.sid.jsf.tutorial.scope.BeanSessionScope;

/**
 * @author Lenovo
 *
 */
@ManagedBean(name = "section05Integratingwebtemplate")
public class Section05Integratingwebtemplate {

	@ManagedProperty(value = "#{beanScope}")
	private BeanScope beanScope;

	@ManagedProperty(value = "#{beanSessionScope}")
	private BeanSessionScope beanSessionScope;

	@ManagedProperty(value = "#{beanApplicationScope}")
	private BeanApplicationScope beanApplicationScope;

	
	
	public Section05Integratingwebtemplate() {
	}

	public BeanScope getBeanScope() {
		return beanScope;
	}

	public void setBeanScope(BeanScope beanScope) {
		this.beanScope = beanScope;
	}

	public BeanSessionScope getBeanSessionScope() {
		return beanSessionScope;
	}

	public void setBeanSessionScope(BeanSessionScope beanSessionScope) {
		this.beanSessionScope = beanSessionScope;
	}

	public BeanApplicationScope getBeanApplicationScope() {
		return beanApplicationScope;
	}

	public void setBeanApplicationScope(BeanApplicationScope beanApplicationScope) {
		this.beanApplicationScope = beanApplicationScope;
	}

	public void incrementValue() {
		beanScope.incrementValue();
		beanSessionScope.incrementValue();
		beanApplicationScope.incrementValue();
	}

}
