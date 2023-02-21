package com.sistemacontroleestoque.sao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CargoDTO {

    private Integer idCargo;

    private String descricaoCargo;
}
