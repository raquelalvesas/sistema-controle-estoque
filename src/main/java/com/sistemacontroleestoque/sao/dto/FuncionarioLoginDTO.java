package com.sistemacontroleestoque.sao.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FuncionarioLoginDTO {

    @NotEmpty(message = "O login é um campo obrigatório!")
    private String login;
    @NotEmpty(message = "A senha é um campo obrigatório!")
    //@Length(min = 5, message = "A seha precisa possuir no mínimo cinco caracteres!")
    private String senha;
}
