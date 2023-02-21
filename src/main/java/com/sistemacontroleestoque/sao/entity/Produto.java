package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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
