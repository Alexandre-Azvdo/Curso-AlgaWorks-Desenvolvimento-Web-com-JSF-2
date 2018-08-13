package com.algaworks.cursojsf2.converter;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.algaworks.Valores")
public class ValoresConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		BigDecimal arrecadacao = null;
		
		if(value != null && !value.equals("")) {
			if(value.equalsIgnoreCase("um milhão")) {
				return arrecadacao = new BigDecimal(1000000);
			
			} if(value.equalsIgnoreCase("cem mil")){
				return arrecadacao = new BigDecimal(100000);				
			
			} else {			
				try {
					arrecadacao = new BigDecimal(value);
				} catch (Exception e) {					
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Valor Incorreto!", "Informe um valor correto.");
					throw new ConverterException(msg);
				}
			}
		}
		return arrecadacao;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String valor = (String) value;
		return valor;
	}
}