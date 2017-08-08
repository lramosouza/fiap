package br.com.fiap.bean;

import java.util.Date;

public class UsuarioSessaoBean {

	private String login;
	private Date ultimoAcesso;
	private Date primeiroAcesso;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public Date getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(Date primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

}
