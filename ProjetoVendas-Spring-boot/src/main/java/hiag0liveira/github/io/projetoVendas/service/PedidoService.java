package hiag0liveira.github.io.projetoVendas.service;

import hiag0liveira.github.io.projetoVendas.domain.entity.Pedido;
import hiag0liveira.github.io.projetoVendas.domain.enums.StatusPedido;
import hiag0liveira.github.io.projetoVendas.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
