package com.algaworks.curojsf2.dominio;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = -3625199213020041574L;
	
	private String nome;
	private String fabricante;
	private String categoria;
	
	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}