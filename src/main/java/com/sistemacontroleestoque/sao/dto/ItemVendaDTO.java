package com.sistemacontroleestoque.sao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemVendaDTO {

    private Long idItemVenda;

    private Integer quantidadeProduto;

    private Float precoItem;
}
