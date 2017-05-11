package br.com.fiap.contas;

public class ContaPoupanca extends ContaBancaria {
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
	
	
}