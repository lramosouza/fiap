package br.com.fiap.enumeration;

import br.com.fiap.contas.ContaBancaria;

public enum ClassificacaoClienteEnum {
	
	POTENCIAL(400_000, 500_000),
	MEDIO(200_000, 400_000),
	BAIXO(0, 200_000);
	
	private double vrMinimo;
	private double vrMaximo;
	
	ClassificacaoClienteEnum(double vrMinimo, double vrMaximo){
		this.vrMinimo=vrMinimo;
		this.vrMaximo=vrMaximo;
		
	}

	public double getVrMinimo() {
		return vrMinimo;
	}

	public void setVrMinimo(double vrMinimo) {
		this.vrMinimo = vrMinimo;
	}

	public double getVrMaximo() {
		return vrMaximo;
	}

	public void setVrMaximo(double vrMaximo) {
		this.vrMaximo = vrMaximo;
	}

	public boolean isCompatible(ContaBancaria conta){
		if (conta.getSaldo() >= ClassificacaoClienteEnum.POTENCIAL.getVrMinimo() &&
				conta.getSaldo() <= ClassificacaoClienteEnum.POTENCIAL.getVrMinimo()){
			return true;
		}else{
			return false;
		}
		
	}
	
}
