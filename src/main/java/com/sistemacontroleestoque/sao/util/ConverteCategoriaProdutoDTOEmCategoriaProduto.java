package com.sistemacontroleestoque.sao.util;

import com.sistemacontroleestoque.sao.dto.CategoriaProdutoDTO;
import com.sistemacontroleestoque.sao.entity.CategoriaProduto;

public class ConverteCategoriaProdutoDTOEmCategoriaProduto implements IConverteDTOEmEntidade<CategoriaProdutoDTO, CategoriaProduto> {

   @Override
    public CategoriaProduto converter(CategoriaProdutoDTO dto) {

        CategoriaProduto categoriaProduto = new CategoriaProduto();
        categoriaProduto.setId(dto.getId());
        categoriaProduto.setDescricao(dto.getDescricao());
        categoriaProduto.setStatus(dto.getStatus());
        return categoriaProduto;
    }
}
