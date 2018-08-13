package com.algaworks.cursojsf2.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.curojsf2.dominio.Livro;

@ManagedBean
@ViewScoped
public class CatalogoLivrosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Livro livro;
	private List<Livro> livros;
	
	public CatalogoLivrosBean() {
		this.livro = new Livro();
		this.livros = new ArrayList<Livro>();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void incluirLivro(){
		this.livros.add(this.livro);
		livro = new Livro();
	}
	
}