package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_venda")
    private Long idItemVenda;

    @Column(name = "quantidade_produto")
    private Integer quantidadeProduto;

    @Column(name = "preco_item")
    private Float precoItem;
}
