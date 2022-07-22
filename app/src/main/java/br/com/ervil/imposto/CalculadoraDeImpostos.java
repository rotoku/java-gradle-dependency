package br.com.ervil.imposto;

import java.math.BigDecimal;

import br.com.ervil.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
