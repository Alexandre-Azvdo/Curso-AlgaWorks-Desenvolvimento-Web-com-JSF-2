package com.algaworks.cursojsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConsultaClienteBean implements Serializable {

	private static final long serialVersionUID = -5963150825652769247L;
	private List<Cliente> clientes;
	
	public ConsultaClienteBean() {
		clientes = new ArrayList<Cliente>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	@PostConstruct
	public void consultar() {
		this.getClientes().add(new Cliente(1,"Alexandre Azevedo" , "Sum�"));
		this.getClientes().add(new Cliente(2,"Klerianne Rafael" , "Sum�"));
		this.getClientes().add(new Cliente(3,"Ant�nio Neruda" , "Monteiro"));
		this.getClientes().add(new Cliente(5,"Maria Clara" , "Prata"));
		this.getClientes().add(new Cliente(8,"Nivaldo Braz" , "Ouro Velho"));
		this.getClientes().add(new Cliente(10,"Marcelo Oliveira" , "Amparo"));
	}	
}