package com.sistemacontroleestoque.sao.service;

import com.sistemacontroleestoque.sao.entity.EstoqueProduto;
import com.sistemacontroleestoque.sao.entity.Produto;

import java.util.List;

public interface EstoqueProdutoService {

    List<EstoqueProduto> buscarProdutos();
}
