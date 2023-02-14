package com.sistemacontroleestoque.sao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@Data
public class Pessoa {

    private Long idPessoa;

    private String nome;

    private Long telefone;

    private String email;

    private String cidade;

    @Autowired
    public Pessoa(Long idPessoa, String nome, Long telefone, String email, String cidade) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
    }
}
