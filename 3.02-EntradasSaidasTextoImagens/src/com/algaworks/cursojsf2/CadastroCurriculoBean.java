package com.algaworks.cursojsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroCurriculoBean implements Serializable {

	private static final long serialVersionUID = 2226963012274913526L;

	private String vaga = "A0382D";
	private String cargo = "Programador Java Senior";
	
	public CadastroCurriculoBean() {
		
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
