package com.sistemacontroleestoque.sao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransacaoProdutoDTO {

    private Integer quantidadeProduto;

    private Double precoVenda;

    private Date dataVenda = new Date();

    private Integer funcionarioLiberacaoVenda;

    private Integer cliente;
}
