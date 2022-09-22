package io.github.helio.injecaodedepencia.services;

import io.github.helio.injecaodedepencia.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public interface FreteServices {


    public double frete(Pedido pedido);
}
