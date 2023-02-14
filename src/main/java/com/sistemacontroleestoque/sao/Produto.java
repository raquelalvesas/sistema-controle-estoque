package com.sistemacontroleestoque.sao;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Float valorUnitario;

    private Double pesoUnitario;

    private String status;

    private Date dataVencimento;

    @Autowired
    public Produto(Long id, String descricao, Float valorUnitario, Double pesoUnitario, String status, Date dataVencimento) {
        this.id = id;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.pesoUnitario = pesoUnitario;
        this.status = status;
        this.dataVencimento = dataVencimento;
    }
}
