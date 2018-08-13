package com.algaworks.cursojsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormularioBean implements Serializable {

	private static final long serialVersionUID = -6234302517129884045L;
	private String nome;
	
	public FormularioBean() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}