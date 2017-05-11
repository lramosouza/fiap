package br.com.fiap.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.fiap.contas.ContaBancaria;
import br.com.fiap.enumeration.ClassificacaoClienteEnum;

public class ContaBancariaTest {
	ContaBancaria conta= new ContaBancaria(null, null, null);
	@Test
	public void test() {
		BigDecimal dias = new BigDecimal(5);
		BigDecimal meses = new BigDecimal(1);
		BigDecimal taxa = BigDecimal.ONE;
		assertEquals(taxa, conta.getTaxaBancaria());
		assertEquals(new BigDecimal(5),conta.getTaxaBancaria(dias.intValue()));
		assertEquals(new BigDecimal(35), conta.getTaxaBancaria(dias.intValue(), meses.intValue()));
		conta.deposita(400000.00);
		assertEquals(true, ClassificacaoClienteEnum.POTENCIAL.isCompatible(conta));
		conta.saque(450000.00);
		assertEquals(false, ClassificacaoClienteEnum.POTENCIAL.isCompatible(conta));
	}

}
