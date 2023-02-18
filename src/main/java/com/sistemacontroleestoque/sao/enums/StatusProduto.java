package com.sistemacontroleestoque.sao.enums;

public enum StatusProduto {

    ATIVO("ativo"),
    INATIVO("inativo");


    private String selectedStatus;
    StatusProduto(String status) {
        this.selectedStatus = status;
    }
}
