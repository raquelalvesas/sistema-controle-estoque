package com.sistemacontroleestoque.sao.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class FuncionarioDTO extends PessoaDTO{


    private Long idFuncionario;

    private String descricaiCargo;

    @NotEmpty(message = "O login é um campo obrigatório!")
    private String login;

    @NotEmpty(message = "A senha é um campo obrigatório!")
    //@Length(min = 5, message = "A seha precisa possuir no mínimo cinco caracteres!")
    private String senha;

    @NotNull(message = "O nível de acesso do funcionário é um campo obrigatório!")
    @Min(value = 1, message = "O nível de acesso do funcionário não pode ser representado por um número menor que 1!")
    @Max(value = 2, message = "O nível de acesso do funcionário não pode ser representado por um número maior que 2!")
    private  int nivelAcesso;
}
