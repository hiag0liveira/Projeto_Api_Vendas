package hiag0liveira.github.io.upcar.service;

import io.github.dougllasfps.domain.entity.Pedido;
import io.github.dougllasfps.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
}
