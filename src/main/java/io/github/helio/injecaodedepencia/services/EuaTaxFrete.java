package io.github.helio.injecaodedepencia.services;

import io.github.helio.injecaodedepencia.entity.Pedido;

public class EuaTaxFrete implements FreteServices{

    @Override
    public double frete(Pedido pedido) {
        return 0;
    }
}
