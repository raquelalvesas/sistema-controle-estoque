package com.sistemacontroleestoque.sao.service;

import com.sistemacontroleestoque.sao.entity.Produto;
import com.sistemacontroleestoque.sao.exception.InfoException;

import java.util.List;

public interface ProdutoService {

    List<Produto> buscarTodos();

    Produto inserir(Produto objeto) throws InfoException;

    Produto alterar(Long id, Produto objeto) throws InfoException;

    void excluir(Long id) throws InfoException;
}
