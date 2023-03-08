package hiag0liveira.github.io.upcar.domain.repositorio;

import hiag0liveira.github.io.upcar.domain.entity.Cliente;
import hiag0liveira.github.io.upcar.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
