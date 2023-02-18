package com.sistemacontroleestoque.sao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaDTO {

    private Long idPessoa;

    private String nome;

    private Long telefone;

    private String email;

    private String cidade;
}
