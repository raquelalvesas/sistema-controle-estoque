package com.sistemacontroleestoque.sao;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@Data
public class caixa {

    @Id
    private Integer idCaixa;

    private String login;

    private String senha;

    @Autowired
    public caixa(Integer idCaixa, String login, String senha) {
        this.idCaixa = idCaixa;
        this.login = login;
        this.senha = senha;
    }
}
