package com.algaworks.cursojsf2.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import com.algaworks.curojsf2.dominio.Livro;

@ManagedBean
@SessionScoped
public class CatalogoLivrosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tituloPesquisa;
	private List<Livro> livros;
	private List<Livro> livrosFiltrados;	
	private Livro livro;
	
	private Livro livroSelecionado;
	
	public CatalogoLivrosBean() {
		this.livros = new ArrayList<Livro>();
		this.livrosFiltrados = new ArrayList<Livro>();
		this.livro = new Livro();
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
	
	public Livro getLivroSelecionado() {
		return livroSelecionado;
	}

	public void setLivroSelecionado(Livro livroSelecionado) {
		this.livroSelecionado = livroSelecionado;
	}

	public String getTituloPesquisa() {
		return tituloPesquisa;
	}

	public void setTituloPesquisa(String tituloPesquisa) {
		this.tituloPesquisa = tituloPesquisa;
	}

	public List<Livro> getLivrosFiltrados() {
		return livrosFiltrados;
	}
	
	private void adicionarMensagem(String clientId, Severity severity, String sumary, String detail) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(severity, sumary, detail);
		
		context.addMessage(clientId, message);
	}

	public void incluirLivro(){
		
		if(this.livro.getTitulo()!= ""){
			//Adicionando livro na lista de livros
			this.livros.add(this.livro);
			//'Limpar' o livro para ser novamente intanciado
			this.livro = new Livro();
					
			FacesContext context = FacesContext.getCurrentInstance();
			if(!context.getMessages().hasNext()) {
								
				this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO, "Livro Cadastrado.", "O livro foi cadastrado com sucesso!");
			}		
		} else {
			this.adicionarMensagem(null, FacesMessage.SEVERITY_WARN, "Livro não Cadastrado.", "O livro precisa de uma título!");
		}
		
	}
	
	public void excluirLivro(){
		this.livros.remove(this.livroSelecionado);
	}
	
	public void tituloPesquisaAlterada(ValueChangeEvent evt){
		this.livrosFiltrados.clear();
		
		for(Livro livro : this.livros){
			if(livro.getTitulo() != null && livro.getTitulo().toLowerCase()
					.startsWith(evt.getNewValue().toString().toLowerCase())){
				this.livrosFiltrados.add(livro);
				System.out.println(livro.getTitulo());
			}
		}
	}
	
	public String ajuda(){
		if(this.livros.isEmpty()){
			return "AjudaGestaoLivros?faces-redirect=true";
		} else {
			return "AjudaGestaoLivrosTelefone?faces-redirect=true";
		}
	}
}