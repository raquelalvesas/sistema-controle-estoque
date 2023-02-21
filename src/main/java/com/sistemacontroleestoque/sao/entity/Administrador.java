package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Integer idAdministrador;

    @Column(name = "descricao_cargo")
    private String descricaoCargo;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;
}
