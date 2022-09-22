package io.github.helio.injecaodedepencia.services;

import io.github.helio.injecaodedepencia.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class BrazilTaxFrete implements FreteServices {

    @Override
    public double frete(Pedido pedido)  {
        double valorFrete = 0;

        if (pedido.getValor() < 200.0) {
            valorFrete = 50.0;
        }
        else if (pedido.getValor() >= 300.0 && pedido.getValor() <= 500.0) {
            valorFrete = 30.0;
        }
        else {
            valorFrete = 0;
        }

        return valorFrete;
    }
}
