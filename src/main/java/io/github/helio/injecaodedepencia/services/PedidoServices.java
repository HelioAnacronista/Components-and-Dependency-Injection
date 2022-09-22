package io.github.helio.injecaodedepencia.services;


import io.github.helio.injecaodedepencia.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServices {

    @Autowired
    private FreteServices freteServices;

    public PedidoServices(FreteServices freteServices) {
        this.freteServices = freteServices;
    }

    public double total(Pedido pedido) {

        double desconto = pedido.getDisconto() / 100;
        double valorComDesconto = pedido.getValor() * desconto;
        double subValor = pedido.getValor() - valorComDesconto;



        return  subValor + freteServices.frete(pedido);
    }
}
