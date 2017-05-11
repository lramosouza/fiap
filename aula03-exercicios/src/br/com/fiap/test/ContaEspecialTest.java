package br.com.fiap.test;

import org.junit.Test;

import br.com.fiap.contas.ContaEspecial;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ContaEspecialTest {
	ContaEspecial contaE = new ContaEspecial(null, null, null);

	@Test
	public void test() {
		Double valor = 100.0;
		Double valorExpectedDep = 90.0;
		Double valorExpectedSaq = 110.0;
		Assert.assertEquals(valorExpectedDep, contaE.calculaValorDeposito(valor));
		Assert.assertEquals(valorExpectedSaq, contaE.calculaValorSaque(valor));
	}

}
