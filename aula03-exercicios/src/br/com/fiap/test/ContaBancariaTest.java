package br.com.fiap.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.fiap.contas.ContaBancaria;

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
	}

}
