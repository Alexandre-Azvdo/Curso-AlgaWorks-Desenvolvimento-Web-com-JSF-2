package com.algaworks.curojsf2.dominio;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String autores;
	private String assunto;
	
	public Livro() {		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	
}