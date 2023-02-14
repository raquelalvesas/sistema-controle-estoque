package com.sistemacontroleestoque.sao;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@Data
public class Funcionario extends Pessoa {

    @Id
    private Long idFuncionario;

    private String descricaiCargo;

    private String login;

    private String senha;

    @Autowired
    public Funcionario(Long idFuncionario, String descricaiCargo, String login, String senha) {
        this.idFuncionario = idFuncionario;
        this.descricaiCargo = descricaiCargo;
        this.login = login;
        this.senha = senha;
    }
}
