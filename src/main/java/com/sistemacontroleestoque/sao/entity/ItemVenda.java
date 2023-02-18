package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItemVenda")
    private Long idItemVenda;

    @Column(name = "quantidadeProduto")
    private Integer quantidadeProduto;

    @Column(name = "precoItem")
    private Float precoItem;
}
