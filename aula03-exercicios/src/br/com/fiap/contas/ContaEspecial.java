package br.com.fiap.contas;

public class ContaEspecial extends ContaBancaria{
	
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
		// TODO Auto-generated constructor stub
	}

	public void saque(double valor) {
		super.saque(calculaValorSaque(valor));
	}
	
	public void deposita(double valor) {
		super.deposita(calculaValorDeposito(valor));
	}
	
	
	public double calculaValorDeposito(double valor) {
		return valor - valor*0.1;
	}

	public double calculaValorSaque(double valor) {
		
		return valor + valor*0.1;
	}
}
