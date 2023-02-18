package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class TransacaoProduto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quantidade_produto")
    private Integer quantidadeProduto;

    @Column(name = "preco_venda")
    private Double precoVenda;

    @Column(name = "data_venda")
    private Date dataVenda;

    @Column(name = "funcionario_liberacao_venda")
    private Integer funcionarioLiberacaoVenda;

    @Column(name = "cliente")
    private Integer cliente;
}
