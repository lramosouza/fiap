package br.com.fiap.contas;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class ContaPoupancaTest {
	@SuppressWarnings("deprecation")
	ContaPoupanca contapoup = new ContaPoupanca("Leandro", "Rua uacuma", "42847256881", LocalDate.of(2015, Month.APRIL, 5), LocalDate.of(2015, Month.APRIL, 5));
	
	@Test
	public void testSaque() {
		contapoup.deposita(10);
		contapoup.saque(10, LocalDate.of(2012, Month.APRIL, 5));
	}

}
