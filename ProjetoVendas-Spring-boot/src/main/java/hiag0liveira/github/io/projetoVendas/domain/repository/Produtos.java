package hiag0liveira.github.io.projetoVendas.domain.repository;

import hiag0liveira.github.io.projetoVendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
