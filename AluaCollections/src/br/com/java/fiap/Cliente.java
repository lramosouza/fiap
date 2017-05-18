package br.com.java.fiap;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente implements Serializable{
	/**
	 * </br>
	 * <b>Leandro</b>
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Boolean flAtivo;
	private LocalDate dataPrimeiraCompra;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getFlAtivo() {
		return flAtivo;
	}
	public void setFlAtivo(Boolean flAtivo) {
		this.flAtivo = flAtivo;
	}
	public LocalDate getDataPrimeiraCompra() {
		return dataPrimeiraCompra;
	}
	public void setDataPrimeiraCompra(LocalDate dataPrimeiraCompra) {
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", flAtivo=" + flAtivo + ", dataPrimeiraCompra=" + dataPrimeiraCompra + "]";
	}	
}
