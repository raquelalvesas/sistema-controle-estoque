package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idEstoque;

    @Column(name = "descricao_produto")
    private String produto;

    @Column(name = "quantidade")
    private String quantidade;


}
