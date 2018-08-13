package com.algaworks.cursojsf2.visao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.algaworks.curojsf2.dominio.Produto;

@ManagedBean
@SessionScoped
//@ApplicationScoped
public class GestaoProdutosBean {
	
	private List<Produto> produtos;
	private Produto produto;
	
	public GestaoProdutosBean() {
		produtos = new ArrayList<Produto>();
		produto = new Produto();
	}	
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void incluir(){
		//Adicionando produto na lista de produtos
		this.produtos.add(this.produto);
		//Limpar o 'produto' para ser novamente intanciado
		this.produto = new Produto();
	}	
}