package br.com.fiap.contas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.fiap.exeptions.SaldoInsuficienteExeption;
import br.com.fiap.interfaces.ITributacao;

public class ContaPoupanca extends ContaBancaria implements ITributacao {
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataCriacaoConta, LocalDate dataNascimento) {
		super(nomeCliente, endCliente, cpfCliente, dataCriacaoConta, dataNascimento);
	}

	private int diaAniversario;		
	
	public void saque(double valor, LocalDate dataCriacaoConta) {
		try {
			validarSaldoConta(valor, saldo);
			if(isClienteMaisDeUmAno(dataCriacaoConta)){
				saldo -= valor - 0.10;
			}
		} catch (SaldoInsuficienteExeption e) {
			System.out.println(e);
		}
		
	}

	private boolean isClienteMaisDeUmAno(LocalDate dataCriacaoConta) {
	   long meses = ChronoUnit.MONTHS.between(dataCriacaoConta, LocalDate.now());
	   if (meses > 12){
			return true;
		}else{
			return false;
		}
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
	
	public void validarSaldoConta(double valor, double saldo) throws SaldoInsuficienteExeption{
		if ((valor > saldo) || (saldo <= 0)){
			throw new SaldoInsuficienteExeption();
		}
	}

}