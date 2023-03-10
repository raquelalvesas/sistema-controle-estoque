package com.sistemacontroleestoque.sao.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaDTO {

    private Long idPessoa;

    @NotEmpty(message = "O nome é um campo obrigatório!")
    //@Length(min = 3, message = "O nome precisa ter pelo menos três caracteres!")
    private String nome;

    private Long telefone;

    private String email;

    @NotNull(message = "A data de nascimento é um campo obrigatório!")
    private LocalDate dataNascimento;

    @NotEmpty(message = "A cidade é um campo obrigatório!")
    private String cidade;
}
