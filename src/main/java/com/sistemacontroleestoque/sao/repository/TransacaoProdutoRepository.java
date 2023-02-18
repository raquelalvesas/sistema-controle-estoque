package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.TransacaoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoProdutoRepository extends JpaRepository<TransacaoProduto, Integer> {

    List<TransacaoProduto> findTransacaoProdutoByQuantidadeProduto(Integer quantidadeProduto);

    List<TransacaoProduto> findTransacaoProdutoByPrecoVenda(Double precoVenda);

    List<TransacaoProduto> findTransacaoProdutoByDataHoraVenda(Double dataVenda);

    List<TransacaoProduto> findTransacaoProdutoByFuncionarioLiberacaoVenda(Integer funcionarioLiberacaoVenda);

    List<TransacaoProduto> findTransacaoProdutoByCliente(Integer cliente);

}
