package com.algaworks.cursojsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeFavotiroBean implements Serializable {

	private static final long serialVersionUID = 3349820904407695443L;
	private String time;
	
	public TimeFavotiroBean() {
	
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void escolher() {
		System.out.println("Time selecionado:" + this.getTime());
	}
	
	
}
