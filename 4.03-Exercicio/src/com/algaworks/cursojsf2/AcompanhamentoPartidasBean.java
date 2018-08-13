package com.algaworks.cursojsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="AcompanhamentoPartidasBean")
@ViewScoped
public class AcompanhamentoPartidasBean implements Serializable {

	private static final long serialVersionUID = 7208025651315378403L;

	private Partida partida;
	private List<Partida> partidas;
	
	public AcompanhamentoPartidasBean() {
		partida = new Partida();
		partidas = new ArrayList<Partida>();
	}
	
	public Partida getPartida() {
		return partida;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}
	
	public void incluir() {
		this.partidas.add(this.partida);
		this.partida = new Partida();
	}
}
