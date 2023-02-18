package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@NoArgsConstructor
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valorUnitario")
    private Double valorUnitario;

    @Column(name = "pesoUnitario")
    private Double pesoUnitario;

    @Column(name = "quantidadeEstoque")
    private Integer quantidadeEstoque;

    @Column(name = "status")
    private String status;

    @Column(name = "dataVencimento")
    private Date dataVencimento;

}
