package br.com.fiap.contas;

import br.com.fiap.tributacao.ITributacao;

public class ContaPoupanca extends ContaBancaria implements ITributacao {
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
		// TODO Auto-generated constructor stub
	}

	private int diaAniversario;

	public void saque(double valor) {
		saldo -= valor - 0.10;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	@Override
	public double calcularTributo() {
		return saldo * 0.03;
	}


}