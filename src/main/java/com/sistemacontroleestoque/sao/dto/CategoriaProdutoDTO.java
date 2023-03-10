package com.sistemacontroleestoque.sao.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaProdutoDTO {

    private Integer id;
    @NotEmpty(message = "A descrição da categoria é um campo obrigatório!")
    //@Length(min = 3, message = "A descrição da categoria precisa ter no mínimo 3 caracteres!")
    private String descricao;
    @NotNull(message = "O status da categoria é um campo obrigatório!")
    private Boolean status;
}
