package io.github.helio.injecaodedepencia;

import io.github.helio.injecaodedepencia.entity.Pedido;
import io.github.helio.injecaodedepencia.services.BrazilTaxFrete;
import io.github.helio.injecaodedepencia.services.EuaTaxFrete;
import io.github.helio.injecaodedepencia.services.FreteServices;
import io.github.helio.injecaodedepencia.services.PedidoServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaodedepenciaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InjecaodedepenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Pedido pedidoCliente = new Pedido(1034, 100.0, 10.0);

		BrazilTaxFrete brasilFrete = new BrazilTaxFrete();
		EuaTaxFrete euaTaxFrete = new EuaTaxFrete();

		PedidoServices servicoPedido = new PedidoServices(euaTaxFrete);

		System.out.println(pedidoCliente.getCodigo());
		System.out.println(servicoPedido.total(pedidoCliente));

	}
}
