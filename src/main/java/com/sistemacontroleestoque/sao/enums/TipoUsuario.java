package com.sistemacontroleestoque.sao.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUsuario {

    ADMINISTRADOR("administrador"),
    CLIENTE("cliente"),
    FUNCIONARIO("funcionario"),
    ;

    //private String selectTipoFuncionario;

    //TipoUsuario(String status) {
       // this.selectTipoFuncionario = status;
    //}

    private final String value;
    @JsonCreator
    public static TipoUsuario fromValue(String text) {
        for (TipoUsuario b : TipoUsuario.values()) {
            if (String.valueOf(b.value).equals(text.toUpperCase())) {
                return b;
            }
        }
        return null;
    }

}
