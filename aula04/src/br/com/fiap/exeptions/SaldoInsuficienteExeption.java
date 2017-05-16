package br.com.fiap.exeptions;

public class SaldoInsuficienteExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = "Saldo insuficiente!";

	public SaldoInsuficienteExeption(String message) {
		super();
		this.message = message;
	}

	public SaldoInsuficienteExeption() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
