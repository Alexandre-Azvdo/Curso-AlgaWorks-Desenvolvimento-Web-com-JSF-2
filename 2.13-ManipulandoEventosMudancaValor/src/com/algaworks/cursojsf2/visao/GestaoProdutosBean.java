package com.algaworks.cursojsf2.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.algaworks.curojsf2.dominio.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {
	
	private static final long serialVersionUID = 7858670752616328862L;
	
	private String nomePesquisa;
	private List<Produto> produtos;
	private List<Produto> produtosFiltrados;
	private Produto produto;
	
	private Produto produtoSelecionado;
	
	public GestaoProdutosBean() {
		produtos = new ArrayList<Produto>();
		produtosFiltrados = new ArrayList<Produto>();
		produto = new Produto();
	}	
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public List<Produto> getProdutosFiltrados() {
		return produtosFiltrados;
	}

	public void incluir(){
		//Adicionando produto na lista de produtos
		this.produtos.add(this.produto);
		//'Limpar' o produto para ser novamente intanciado
		this.produto = new Produto();
	}	
	
	public String obterAjuda(){
		if(this.produtos.isEmpty()){
			return "AjudaGestaoProdutos?faces-redirect=true";
		} else {
			return "AjudaGestaoProdutosTelefone?faces-redirect=true";
		}
	}
	
	public void verificarInclusao(ActionEvent evt){
		if("".equals(this.produto.getFabricante())){
			this.produto.setFabricante("Sem fabricante");
		}
	}
	
	public void excluir(){
		this.produtos.remove(this.produtoSelecionado);
	}	
	
	public void nomePesquisaAlterado(ValueChangeEvent evt){				
		this.produtosFiltrados.clear();
		
		for(Produto produto : this.produtos){
			if(produto.getNome() != null && produto.getNome().toLowerCase()
					.startsWith(evt.getNewValue().toString().toLowerCase())){
				this.produtosFiltrados.add(produto);
			}
		}		
	}	
}