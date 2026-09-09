package br.com.fiap.logitech.pedidos.faturamento;

import br.com.fiap.logitech.pedidos.dominio.Pedido;
import br.com.fiap.logitech.pedidos.dominio.SolicitacaoFatura;
import org.springframework.stereotype.Component;

/**
 * Cliente CONTRATO da LogiTech: faturamento mensal, sem desconto, 30 dias de prazo.
 */
@Component
public class ConectorContrato implements ConectorFaturamento {

    public static final String TIPO_CLIENTE = "CONTRATO";

    @Override
    public String tipoClienteAtendido() {
        return TIPO_CLIENTE;
    }

    @Override
    public SolicitacaoFatura montar(Pedido pedido) {
        return new SolicitacaoFatura(
                pedido.getId(),
                pedido.getCliente(),
                pedido.getValor(),
                "FATURA_MENSAL",
                30);
    }
}
