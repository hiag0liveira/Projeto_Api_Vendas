package hiag0liveira.github.io.projetoVendas.domain.repository;

import hiag0liveira.github.io.projetoVendas.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}
