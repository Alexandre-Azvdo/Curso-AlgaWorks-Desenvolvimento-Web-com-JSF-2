package com.algaworks.cursojsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConsultaClienteBean implements Serializable {

	private static final long serialVersionUID = 5019311341953275571L;

	private List<String> clientes;
	
	public ConsultaClienteBean() {
		clientes = new ArrayList<String>();
	}
	
	@PostConstruct
	public void inicializar(){
		for (int i = 0; i < 20; i++) {
			clientes.add("");
		}
	}
	
	public List<String> getClientes(){
		return clientes;
	}
}
