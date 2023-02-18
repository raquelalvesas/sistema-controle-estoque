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

    @Column(name = "valor_unitario")
    private Double valorUnitario;

    @Column(name = "peso_unitario")
    private Double pesoUnitario;

    @Column(name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @Column(name = "status")
    private String status;

    @Column(name = "data_vencimento")
    private Date dataVencimento;

}
