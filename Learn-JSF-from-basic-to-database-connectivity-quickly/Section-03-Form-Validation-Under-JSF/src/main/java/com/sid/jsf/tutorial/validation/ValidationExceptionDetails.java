/**
 * 
 */
package com.sid.jsf.tutorial.validation;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 * @author Lenovo
 *
 */
//@Named(value = "validation")
@ManagedBean(name = "validation")
@RequestScoped
public class ValidationExceptionDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationExceptionDetails() {
	}

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String releaseDate = value.toString();
		LocalDate date = LocalDate.now(ZoneId.systemDefault());
		if (!Objects.isNull(releaseDate)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
			LocalDate localDate = LocalDate.parse(releaseDate, formatter);
			if (!localDate.isAfter(date)) {
				FacesMessage message = new FacesMessage("Future date is required!!!");
				/*
				 * ((UIInput) component).setValid(true);
				 * context.addMessage(component.getClientId(context), message);
				 */
				/**
				 * we can throw exception in 2 way <br/>
				 * first procedure is the above step by using UI component. <br/>
				 * second is by throwing exception. Below procedure.
				 */
				 throw new ValidatorException(message);
			}
		}
	}
}
