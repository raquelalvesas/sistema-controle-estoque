package com.sistemacontroleestoque.sao.controller;

import com.sistemacontroleestoque.sao.dto.CategoriaProdutoDTO;
import com.sistemacontroleestoque.sao.service.CategoriaProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

   /* @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @GetMapping
    public ResponseEntity buscarTodasAsCategorias() {
        return this.categoriaProdutoService.buscarTodasCategorias();
    }
    @PostMapping
    public ResponseEntity cadastrarCategoria(@Valid @RequestBody CategoriaProdutoDTO categoriaProdutoDTO) {
        return this.categoriaProdutoService.cadastrarCategoria(categoriaProdutoDTO);
    }*/
}
