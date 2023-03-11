package hiag0liveira.github.io.projetoVendas.domain.repository;

import hiag0liveira.github.io.projetoVendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
