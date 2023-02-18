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
public class ProdutoDTO {

    private Long id;

    private String descricao;

    private Double valorUnitario;

    private Double pesoUnitario;

    private Integer quantidadeEstoque;

    private String status;
    private Date dataVencimento;
}
