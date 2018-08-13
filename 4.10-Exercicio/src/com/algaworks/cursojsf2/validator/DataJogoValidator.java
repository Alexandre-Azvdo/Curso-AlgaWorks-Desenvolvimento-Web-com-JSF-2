package com.algaworks.cursojsf2.validator;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.algaworks.DataJogo")
public class DataJogoValidator implements Validator {
			
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Calendar data = Calendar.getInstance();
		data.setTime((Date)value);
		
		if(data.after(value)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Cadastro desta data NÃO É permitido!!!", "Informe uma data que não seja data futura.");
			throw new ValidatorException(msg);
		}		
	}
}