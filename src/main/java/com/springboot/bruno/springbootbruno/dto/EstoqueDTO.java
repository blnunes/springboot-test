package com.springboot.bruno.springbootbruno.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EstoqueDTO {
    private int quantidade;
    private BigDecimal valor;
    private String nomeProduto;
    private String descricaoProduto;

    public EstoqueDTO(int quantidade, BigDecimal valor, String nomeProduto, String descricaoProduto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public static class Builder {
        private int quantidade;
        private BigDecimal valor;
        private String nomeProduto;
        private String descricaoProduto;

        public Builder quantidade(int quantidade){
            this.quantidade = quantidade;
            return this;
        }

        public Builder valor(BigDecimal valor){
            this.valor = valor;
            return this;
        }

        public Builder nomeProduto(String nomeProduto){
            this.nomeProduto = nomeProduto;
            return this;
        }

        public Builder descricaoProduto(String descricaoProduto){
            this.descricaoProduto = descricaoProduto;
            return this;
        }

        public EstoqueDTO build() {
            return new EstoqueDTO(this.quantidade, this.valor, this.nomeProduto, this.descricaoProduto);
        }
    }
}
