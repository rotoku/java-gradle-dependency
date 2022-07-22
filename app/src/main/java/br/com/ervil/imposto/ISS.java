package br.com.ervil.imposto;
import br.com.ervil.orcamento.Orcamento;
import java.math.BigDecimal;

public class ISS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
