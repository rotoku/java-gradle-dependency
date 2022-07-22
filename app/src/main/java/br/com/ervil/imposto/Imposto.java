package br.com.ervil.imposto;

import br.com.ervil.orcamento.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
	public BigDecimal calcular(Orcamento orcamento);
}
