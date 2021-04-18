package com.springboot.bruno.springbootbruno.entidade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Estoque {
    private int quantidade;
    private BigDecimal valor;
    private String nomeProduto;
    private String descricaoProduto;

    public Estoque(){}

}
