package com.sistemacontroleestoque.sao;

public enum StatusProduto {

    ATIVO("ativo"),
    INATIVO("inativo");


    private String selectedStatus;
    StatusProduto(String status) {
        this.selectedStatus = status;
    }
}
