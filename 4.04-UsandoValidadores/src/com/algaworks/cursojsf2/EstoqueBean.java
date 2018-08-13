package com.algaworks.cursojsf2;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class EstoqueBean implements Serializable {

	private static final long serialVersionUID = 7537494255668834358L;

	private ItemEstoque itemEstoque;
	private List<ItemEstoque> itensEstoque;
	
	public EstoqueBean() {
		itemEstoque = new ItemEstoque();
		itensEstoque = new ArrayList<ItemEstoque>();
	}

	public ItemEstoque getItemEstoque() {
		return itemEstoque;
	}
	
	public List<ItemEstoque> getItensEstoque() {
		return itensEstoque;
	}	

	public void incluir(){
		this.itensEstoque.add(this.itemEstoque);
		this.itemEstoque = new ItemEstoque();
	}	
}