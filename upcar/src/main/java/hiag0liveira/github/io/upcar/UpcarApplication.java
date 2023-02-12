package hiag0liveira.github.io.upcar;

import hiag0liveira.github.io.upcar.domain.entity.Pedido;
import hiag0liveira.github.io.upcar.domain.repositorio.Clientes;
import hiag0liveira.github.io.upcar.domain.entity.Cliente;
import hiag0liveira.github.io.upcar.domain.repositorio.Pedidos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class UpcarApplication {

	@Bean
	public CommandLineRunner init(
			@Autowired Clientes clientes,
			@Autowired Pedidos pedidos
	) {
			return args -> {
				System.out.println("Salvando clientes");
				Cliente fulano = new Cliente("Fulano");
				clientes.save(fulano);

				Pedido p = new Pedido();
				p.setCliente(fulano);
				p.setDataPedido(LocalDate.now());
				p.setTotal(BigDecimal.valueOf(100));

				pedidos.save(p);

//            Cliente cliente = clientes.findClienteFetchPedidos(fulano.getId());
//            System.out.println(cliente);
//            System.out.println(cliente.getPedidos());

				pedidos.findByCliente(fulano).forEach(System.out::println);

			};
		}

		public static void main(String[] args) {
			SpringApplication.run(UpcarApplication.class, args);
		}
}