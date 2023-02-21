package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@NoArgsConstructor
@Data
public class Funcionario extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Ffuncionario")
    private Long idFuncionario;

    @Column(name = "descricao_cargo")
    private String descricaiCargo;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

}
