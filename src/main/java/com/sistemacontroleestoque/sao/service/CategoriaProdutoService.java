package com.sistemacontroleestoque.sao.service;

import com.sistemacontroleestoque.sao.dto.CategoriaProdutoDTO;
import com.sistemacontroleestoque.sao.entity.CategoriaProduto;
import com.sistemacontroleestoque.sao.repository.CategoriaProdutoRepository;
import com.sistemacontroleestoque.sao.util.ConverteCategoriaProdutoDTOEmCategoriaProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaProdutoService {

    /*@Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    public ResponseEntity cadastrarCategoria(CategoriaProdutoDTO categoriaProdutoDTO) {

        CategoriaProduto categoriaProduto = new ConverteCategoriaProdutoDTOEmCategoriaProduto()
                .converter(categoriaProdutoDTO);
        categoriaProduto = this.categoriaProdutoRepository.save(categoriaProduto);
        if (categoriaProduto == null) {
            throw new RuntimeException("Ocorreu um erro ao tentar-se cadastrar a categoria do produto!");
        }
        categoriaProdutoDTO.setId(categoriaProduto.getId());
        return new ResponseEntity(categoriaProdutoDTO, HttpStatus.CREATED);
    }
    public ResponseEntity buscarTodasCategorias() {

        List<CategoriaProduto> categorias = this.categoriaProdutoRepository
                .findAll();
        return new ResponseEntity(categorias, HttpStatus.OK);
    }*/
}

