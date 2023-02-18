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
    @Column(name = "quantidadeProduto")
    private Integer quantidadeProduto;

    @Column(name = "precoVenda")
    private Double precoVenda;

    @Column(name = "dataHoraVenda")
    private Date dataHoraVenda;

    @Column(name = "funcionarioLiberacaoVenda")
    private Integer funcionarioLiberacaoVenda;

    @Column(name = "cliente")
    private Integer cliente;
}
