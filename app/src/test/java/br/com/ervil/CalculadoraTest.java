package br.com.ervil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	@Test
	public void somar() {
		double expected = 4;
		double actual = new Calculadora().somar(2, 2);
		assertThat(expected, equalTo(actual));
	}

	@Test
	public void subtrair() {
		double expected = 0;
		double actual = new Calculadora().subtrair(2, 2);
		assertThat(expected, equalTo(actual));
	}

	@Test
	public void multiplicar() {
		double expected = 4;
		double actual = new Calculadora().multiplicar(2, 2);
		assertThat(expected, equalTo(actual));
	}

	@Test
	public void dividir() {
		double expected = 1;
		double actual = new Calculadora().dividir(2, 2);
		assertThat(expected, equalTo(actual));
	}
}
