package com.algaworks.cursojsf2.validator;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.algaworks.DiaUtil")
public class DiaUtilValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) 
			throws ValidatorException {
		Calendar data = Calendar.getInstance();
		data.setTime((Date)value);
		
		int diaDaSemana = data.get(Calendar.DAY_OF_WEEK);
		
		if(diaDaSemana == Calendar.SATURDAY) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Cadastro no s�bado N�O � permitido!!!", "Informe uma data que seja um dia �til.");
			throw new ValidatorException(msg);
		} 
		if(diaDaSemana == Calendar.SUNDAY) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Cadastro no domingo N�O � permitido!!!", "Informe uma data que seja um dia �til.");
			throw new ValidatorException(msg);
		}		
	}
}