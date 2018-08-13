package com.algaworks.cursojsf2;

import java.math.BigDecimal;
import java.util.Date;

public class Partida  {
	
	private Date dataJogo;
	private String timeCasa;
	private Integer golsCasa;
	private String visitante;
	private Integer golsVisitante;
	private BigDecimal arrecadacao;
	
	public Partida() {
		
	}

	public Date getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}

	public String getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Integer getGolsCasa() {
		return golsCasa;
	}

	public void setGolsCasa(Integer golsCasa) {
		this.golsCasa = golsCasa;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public Integer getGolsVisitante() {
		return golsVisitante;
	}

	public void setGolsVisitante(Integer golsVisitante) {
		this.golsVisitante = golsVisitante;
	}

	public BigDecimal getArrecadacao() {
		return arrecadacao;
	}

	public void setArrecadacao(BigDecimal arrecadacao) {
		this.arrecadacao = arrecadacao;
	}	
}