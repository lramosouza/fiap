package br.com.fiap.contas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaBancaria {
	private static final BigDecimal TAXA_BANCARIA = BigDecimal.ONE;
	
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected double saldo;
	protected LocalDate dataCriacaoConta;
	protected LocalDate dataNascimento;
	
	public ContaBancaria (String nomeCliente, String endCliente, String cpfCliente, LocalDate dataCriacaoConta, LocalDate dataNascimento){
		super();
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
		this.dataCriacaoConta = dataCriacaoConta;
		this.dataNascimento = dataNascimento;
	}
	public void saque(double valor, LocalDate dataCriacaoConta) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public BigDecimal getTaxaBancaria() {
		return TAXA_BANCARIA;
	}

	public BigDecimal getTaxaBancaria(Integer dias) {
		return getTaxaBancaria().multiply(new BigDecimal(dias));
	}

	public BigDecimal getTaxaBancaria(Integer dias, Integer meses) {
		BigDecimal taxaDias = getTaxaBancaria().multiply(new BigDecimal(dias));
		return taxaDias.add((new BigDecimal(meses).multiply(new BigDecimal(30))));
	}
	
}
