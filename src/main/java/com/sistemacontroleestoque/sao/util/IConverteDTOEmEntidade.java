package com.sistemacontroleestoque.sao.util;

public interface IConverteDTOEmEntidade<D, E> {

    E converter(D dto);
}
