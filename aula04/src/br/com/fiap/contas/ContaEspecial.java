package br.com.fiap.contas;

import java.time.LocalDate;

public class ContaEspecial extends ContaBancaria{
	
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataCriacaoConta, LocalDate dataNascimento) {
		super(nomeCliente, endCliente, cpfCliente, dataCriacaoConta, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public void saque(double valor) {
		super.saque(calculaValorSaque(valor, dataCriacaoConta), dataCriacaoConta);
	}
	
	public void deposita(double valor) {
		super.deposita(calculaValorDeposito(valor));
	}
	
	
	public double calculaValorDeposito(double valor) {
		return valor - valor*0.1;
	}

	public double calculaValorSaque(double valor, LocalDate dataCriacaoConta) {
		
		return valor + valor*0.1;
	}
}
