package br.com.ervil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.ervil.imposto.*;
import br.com.ervil.orcamento.Orcamento;

public class CalculadoraDeImpostosTest {
	@Test
	public void icms() {
		BigDecimal expected = new BigDecimal("10.00");
		Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal actual = calculadora.calcular(orcamento, new ICMS());
		assertThat(expected, comparesEqualTo(actual));
	}

	@Test
	public void iss() {
		BigDecimal expected = new BigDecimal("6.00");
		Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal actual = calculadora.calcular(orcamento, new ISS());
		assertThat(expected, comparesEqualTo(actual));
	}
}
