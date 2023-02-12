package hiag0liveira.github.io.upcar.domain.repositorio;

import hiag0liveira.github.io.upcar.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos  extends JpaRepository<Produto,Integer> {
}
