package hiag0liveira.github.io.upcar.domain.repositorio;


import hiag0liveira.github.io.upcar.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
