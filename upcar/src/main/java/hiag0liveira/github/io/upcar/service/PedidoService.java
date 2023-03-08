package hiag0liveira.github.io.upcar.service;


import hiag0liveira.github.io.upcar.domain.entity.Pedido;
import hiag0liveira.github.io.upcar.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
}
