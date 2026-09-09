package br.com.fiap.logitech.pedidos.dominio;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository {

    Pedido salvar(Pedido pedido);

    Optional<Pedido> porId(String id);

    List<Pedido> todos();
}
