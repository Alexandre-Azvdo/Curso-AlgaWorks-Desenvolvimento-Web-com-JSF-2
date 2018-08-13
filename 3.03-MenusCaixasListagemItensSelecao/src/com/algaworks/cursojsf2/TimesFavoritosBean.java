package com.algaworks.cursojsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimesFavoritosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] times;
	
	public TimesFavoritosBean() {
	
	}

	public String[] getTimes() {
		return times;
	}

	public void setTimes(String[] times) {
		this.times = times;
	}
	
	public void escolher() {
		System.out.println("------------------");
		System.out.println("Times selecionados: ");
		for(String time: this.getTimes()) {
			System.out.println(time);
		}

	}
}
