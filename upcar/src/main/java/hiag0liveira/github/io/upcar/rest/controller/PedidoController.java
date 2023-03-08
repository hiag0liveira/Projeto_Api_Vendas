package hiag0liveira.github.io.upcar.rest.controller;


import hiag0liveira.github.io.upcar.domain.entity.Pedido;
import hiag0liveira.github.io.upcar.rest.dto.PedidoDTO;
import hiag0liveira.github.io.upcar.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save( @RequestBody PedidoDTO dto ){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

    public void testarDevTools(){

    }

}