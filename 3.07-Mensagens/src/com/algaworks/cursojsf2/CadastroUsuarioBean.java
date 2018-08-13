package com.algaworks.cursojsf2;

import java.io.Serializable;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = -653679382529357399L;
	
	private String nome;
	private String email;
	private String senha;
	
	public CadastroUsuarioBean() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	private void adicionarMensagem(String clientId, Severity severity, String sumary, String detail) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(severity, sumary, detail);
		
		context.addMessage(clientId, message);
	}
	
	public void cadastrar() {
		if(this.getNome() == null || this.getNome().length()< 10) {
			this.adicionarMensagem("frm:nome",FacesMessage.SEVERITY_ERROR , "Nome incompleto.", "Favor informar seu nome completo.");
		}
		if(hojeEhDiaDeDescanso()) {
			this.adicionarMensagem(null, FacesMessage.SEVERITY_WARN, "Hoje é dia de descanso.", "Você não pode cadastrar usuário hoje.");
		}
		FacesContext context = FacesContext.getCurrentInstance();
		if(!context.getMessages().hasNext()) {
			//aqui você poderia cadastrar no banco de dados
			//....
			//....
			
			this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO, "Usuário Cadastrado.", "O usuário foi cadastrado com sucesso!");
		}
		
	}

	private boolean hojeEhDiaDeDescanso() {		
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}
}
