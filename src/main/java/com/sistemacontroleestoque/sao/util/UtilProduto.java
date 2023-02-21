package com.sistemacontroleestoque.sao.util;

import com.sistemacontroleestoque.sao.dto.ProdutoDTO;
import com.sistemacontroleestoque.sao.entity.Produto;
import com.sistemacontroleestoque.sao.exception.InfoException;
import org.springframework.http.HttpStatus;

public class UtilProduto {

    public static Boolean validarProduto(Produto produto) throws InfoException {

        if (produto.getId() == null || produto.getId().equals("")) {
            throw new InfoException("MESSAGE.ID_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getDescricao() == null || produto.getDescricao().equals("")) {
            throw new InfoException("MESSAGE.DESCRICAO_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getValorUnitario() == null) {
            throw new InfoException("MESSAGE.VALOR_UNITARIO_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getPesoUnitario() == null) {
            throw new InfoException("MESSAGE.PESO_UNITARIO_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getQuantidadeEstoque() == null) {
            throw new InfoException("MESSAGE.QUATIDADE_ESTOQUE_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getStatus() == null) {
            throw new InfoException("MESSAGE.STATUS_REQUIRED", HttpStatus.BAD_REQUEST);
        }
        if (produto.getDataVencimento() == null) {
            throw new InfoException("MESSAGE.DATA_VENCIMENTO_REQUIRED", HttpStatus.BAD_REQUEST);
        }

        return true;
    }

    public static ProdutoDTO converterProduto(Produto produto) {
        return ProdutoDTO.builder()
                .descricao(produto.getDescricao())
                .valorUnitario(produto.getValorUnitario())
                .pesoUnitario(produto.getPesoUnitario())
                .quantidadeEstoque(produto.getQuantidadeEstoque())
                .status(produto.getStatus())
                .dataVencimento(produto.getDataVencimento())
                .build();
    }
}
