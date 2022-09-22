package io.github.helio.injecaodedepencia.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Pedido {

    private Integer Codigo;
    private Double valor;
    private Double Disconto;

    public Pedido(Integer codigo, Double valor, Double disconto) {
        Codigo = codigo;
        this.valor = valor;
        Disconto = disconto;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDisconto() {
        return Disconto;
    }

    public void setDisconto(Double disconto) {
        Disconto = disconto;
    }
}
