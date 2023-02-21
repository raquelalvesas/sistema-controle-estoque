package com.sistemacontroleestoque.sao.service;

import com.sistemacontroleestoque.sao.entity.Produto;
import com.sistemacontroleestoque.sao.exception.InfoException;
import com.sistemacontroleestoque.sao.repository.ProdutoRepository;
import com.sistemacontroleestoque.sao.util.UtilProduto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceIml implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Produto inserir(Produto produto) throws InfoException {
        if (UtilProduto.validarProduto(produto)) {
            return produtoRepository.save(produto);
        } else {
            throw new InfoException("Erro ao cadastrar produto", HttpStatus.BAD_REQUEST);
        }
    }

    public Produto alterar(Long id, Produto produto) throws InfoException {
        Optional<Produto> optionalProduto = produtoRepository.findById(id);

        if (optionalProduto.isPresent()) {
            Produto produtoBuilder = Produto.builder()
                    .id(id)
                    .descricao(produto.getDescricao() != null ? produto.getDescricao() : null)
                    .valorUnitario(produto.getValorUnitario() != null ? produto.getValorUnitario() : null)
                    .pesoUnitario(produto.getPesoUnitario() != null ? produto.getPesoUnitario() : null)
                    .quantidadeEstoque(produto.getQuantidadeEstoque() != null ? produto.getQuantidadeEstoque() : null)
                    .status(produto.getStatus() != null ? produto.getStatus() : null)
                    .dataVencimento(produto.getDataVencimento() != null ? produto.getDataVencimento() : null)
                    .build();

            if (UtilProduto.validarProduto(produtoBuilder)) {
                produtoRepository.save(produtoBuilder);
            }
            return produtoBuilder;
        } else {
            throw new InfoException("Produto não encontrado", HttpStatus.NOT_FOUND);
        }
    }

    public void excluir(Long id) throws InfoException {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isPresent()) {
            produtoRepository.delete(produto.get());
        } else {
            throw new InfoException("Produto não encontrado", HttpStatus.NOT_FOUND);
        }
    }
}
