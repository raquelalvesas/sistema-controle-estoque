package com.sistemacontroleestoque.sao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdministradorDTO {

    private Integer idAdministrador;

    private String descricaoCargo;

    private String login;

    private String senha;
}
