package hiag0liveira.github.io.upcar;

import hiag0liveira.github.io.upcar.domain.repositorio.Clientes;
import hiag0liveira.github.io.upcar.domain.entity.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UpcarApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes){
		return args -> {
			System.out.println("Salvando clientes");
			clientes.salvar(new Cliente("Hiago"));
			clientes.salvar(new Cliente("Outro Cliente"));

			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			System.out.println("Atualizando clientes");
			todosClientes.forEach(c -> {
				c.setNome(c.getNome() + " atualizado.");
				clientes.atualizar(c);
			});

			todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			System.out.println("Buscando clientes");
			clientes.buscarPorNome("Cli").forEach(System.out::println);

//            System.out.println("deletando clientes");
//            clientes.obterTodos().forEach(c -> {
//                clientes.deletar(c);
//            });

			todosClientes = clientes.obterTodos();
			if(((List<?>) todosClientes).isEmpty()){
				System.out.println("Nenhum cliente encontrado.");
			}else{
				todosClientes.forEach(System.out::println);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(UpcarApplication.class, args);
	}

}